import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SlimeXResidentSlime
{

	private int R;
	private int C;
	private char[][] g;
	private Cell start;
	private int[][] sd;
	private int dx[] = new int[]
	{ 1, -1, 0, 0 };
	private int dy[] = new int[]
	{ 0, 0, 1, -1 };
	private ArrayList<Slime> slimes;
	private int minAns;
	private LinkedList<Move> moves;

	public int exterminate(String[] field)
	{
		// make grid
		R = field.length;
		C = field[0].length();
		g = new char[R][C];
		for (int r = 0; r < R; r++)
			for (int c = 0; c < C; c++)
				g[r][c] = field[r].charAt(c);

		// count slimes
		int slimeCount = 0;
		slimes = new ArrayList<Slime>();
		start = new Cell(-1, -1);
		for (int r = 0; r < R; r++)
			for (int c = 0; c < C; c++)
				if (g[r][c] == '#')
					;
				else if (g[r][c] == '$')
					start = new Cell(r, c);
				else if (g[r][c] == '.')
					;
				else
				{
					slimeCount++;
					slimes.add(new Slime(new Cell(r, c), Integer.parseInt(g[r][c] + "")));
				}
		if (slimeCount > 9)
			return -1;

		// find shortest distance to each slime
		bfs();

		// try all slimes as starting point
		minAns = Integer.MAX_VALUE;
		moves = new LinkedList<>();

		for (int r = 0; r < R; r++)
			for (int c = 0; c < C; c++)
				if (g[r][c] != '$' && g[r][c] != '.' && g[r][c] != '#')
					if (sd[r][c] != -1)
					{
						moves.addFirst(new Move(new Cell(r, c), 0));
						dfs(r, c, 0, sd[r][c]);
						moves.removeLast();
					}
		return minAns == Integer.MAX_VALUE ? -1 : minAns;
	}

	private void dfs(int r, int c, int time, int start)
	{
		// base case
		if (time > 9)
			return;
		if (win(time))
		{
			minAns = Math.min(minAns, start + time);
			return;
		}

		// try all directions
		for (int i = 0; i < 4; i++)
		{
			int r2 = r + dx[i];
			int c2 = c + dy[i];
			if (valid(r2, c2))
			{
				moves.addLast(new Move(new Cell(r2, c2), time + 1));
				dfs(r2, c2, time + 1, start);
				moves.removeLast();
			}
		}
	}

	private boolean win(int time)
	{
		// check all slimes are dead
		for (Slime slime : slimes)
		{
			int killTime = -1;
			for (Move move : moves)
				if (move.c.r == slime.c.r && move.c.c == slime.c.c)
					killTime = Math.max(killTime, move.t);
			if (killTime == -1)
				return false;
			if (time - killTime >= slime.rt)
				return false;
		}
		return true;
	}

	private void bfs()
	{
		// invariants
		sd = new int[R][C];
		for (int i = 0; i < R; i++)
			for (int j = 0; j < C; j++)
				sd[i][j] = -1;
		Queue<Cell> q = new LinkedList<Cell>();
		Queue<Integer> d = new LinkedList<Integer>();
		boolean visited[][] = new boolean[R][C];
		sd[start.r][start.c] = 0;
		visited[start.r][start.c] = true;
		q.add(start);
		d.add(0);
	
		//bfs
		while (!q.isEmpty())
		{
			Cell cell = q.poll();
			int distance = d.poll();
			for (int i = 0; i < 4; i++)
			{
				int r = cell.r + dx[i];
				int c = cell.c + dy[i];
				if (valid(r, c))
					if (!visited[r][c])
					{
						visited[r][c] = true;
						sd[r][c] = distance + 1;
						q.add(new Cell(r, c));
						d.add(distance + 1);
					}
			}

		}
	}

	private boolean valid(int r, int c)
	{
		return r >= 0 && r < R && c >= 0 && c < C && g[r][c] != '#';
	}

}

class Cell
{
	int r, c;

	public Cell(int r, int c)
	{
		this.r = r;
		this.c = c;
	}
}

class Move
{
	Cell c;
	int t;

	public Move(Cell c, int t)
	{
		this.c = c;
		this.t = t;
	}

	public String toString()
	{
		return c.r + ":" + c.c + "  " + t + "\n";
	}
}

class Slime
{
	Cell c;
	int rt;

	public Slime(Cell c, int rt)
	{
		this.c = c;
		this.rt = rt;
	}
}