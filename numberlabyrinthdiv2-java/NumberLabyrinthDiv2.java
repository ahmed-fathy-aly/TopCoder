import java.util.LinkedList;
import java.util.Queue;

public class NumberLabyrinthDiv2
{

	private int R;
	private int C;
	private int[][] g;
	private Cell start;
	private Cell end;
	private int k;
	int dx[] = new int[]
	{ 1, -1, 0, 0 };
	int dy[] = new int[]
	{ 0, 0, 1, -1 };

	public int getMinimumNumberOfMoves(String[] board, int r1, int c1, int r2, int c2, int K)
	{
		// read board
		R = board.length;
		C = board[0].length();
		g = new int[R][C];
		k = K;
		for (int r = 0; r < R; r++)
			for (int c = 0; c < C; c++)
				if (board[r].charAt(c) == '.')
					g[r][c] = -1;
				else
					g[r][c] = Integer.parseInt(board[r].charAt(c) + "");
		start = new Cell(r1, c1, K);
		end = new Cell(r2, c2, K);

		// bfs from start
		boolean visited[][][] = new boolean[R][C][k + 1];
		int d[][] = new int[R][C];
		for (int i = 0; i < R; i++)
			for (int j = 0; j < C; j++)
				d[i][j] = Integer.MAX_VALUE;
		d[start.r][start.c] = 0;
		visited[start.r][start.c][start.k] = true;
		Queue<Integer> distance = new LinkedList<Integer>();
		distance.add(0);
		Queue<Cell> q = new LinkedList<Cell>();
		q.add(start);

		while (!q.isEmpty())
		{
			// take a cell
			Cell cell = q.poll();
			int dist = distance.poll();
			d[cell.r][cell.c] = Math.min(d[cell.r][cell.c], dist);

			// go to the next
			int mul = g[cell.r][cell.c];
			if (mul > 0)
				for (int i = 0; i < dx.length; i++)
				{
					int newR = cell.r + dx[i] * mul;
					int newC = cell.c + dy[i] * mul;
					if (valid(newR, newC))
						if (!visited[newR][newC][cell.k])
						{
							visited[newR][newC][cell.k] = true;
							q.add(new Cell(newR, newC, cell.k));
							distance.add(dist + 1);
						}
				}

			if (mul == -1)
				if (cell.k > 0)
					for (int newMul = 0; newMul <= 9; newMul++)
						for (int i = 0; i < dx.length; i++)
						{
							int newR = cell.r + dx[i] * newMul;
							int newC = cell.c + dy[i] * newMul;
							if (valid(newR, newC))
								if (!visited[newR][newC][cell.k - 1])
								{
									visited[newR][newC][cell.k - 1] = true;
									q.add(new Cell(newR, newC, cell.k-1));
									distance.add(dist + 1);
								}
						}
		}

		return d[r2][c2] == Integer.MAX_VALUE ? -1 : d[r2][c2];
	}

	private boolean valid(int r, int c)
	{
		return r >= 0 && r < R && c >= 0 && c < C;
	}

}

class Cell
{
	int r, c, k;

	public Cell(int r, int c, int k)
	{
		this.r = r;
		this.c = c;
		this.k = k;
	}
}