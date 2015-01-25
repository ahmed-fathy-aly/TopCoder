import java.util.LinkedList;
import java.util.Queue;

public class CaptureThemAll
{

	int n = 8;
	int dx[] = new int[]
	{ -2, -2, 2, 2, -1, 1, -1, 1 };
	int dy[] = new int[]
	{ -1, 1, -1, 1, -2, -2, 2, 2 };

	public int fastKnight(String knight, String rook, String queen)
	{
		// convert to posititions
		Pos s = new Pos(knight, 0);
		Pos t1 = new Pos(rook, 0);
		Pos t2 = new Pos(queen, 0);

		// find all distances
		int st1 = bfs(s, t1);
		int st2 = bfs(s, t2);
		int t1t2 = bfs(t1, t2);
		
		System.out.println(st1 + " " + st2 + " " + t1t2);

		// find min
		int poss[] = new int[]{2 * st1 + st2, 2 * st2 + st1, st1 + t1t2, st2 + t1t2};
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < poss.length; i++) 
			min = Math.min(min, poss[i]);
		return min;
	}

	private int bfs(Pos s, Pos t)
	{
		// invariants
		boolean visited[][] = new boolean[n][n];
		Queue<Pos> q = new LinkedList<Pos>();
		s.dist = 0;
		q.add(s);

		// bfs
		while (!q.isEmpty())
		{
			// poll
			Pos pos = q.poll();
			visited[pos.r][pos.c] = true;
			if (pos.r == t.r && pos.c == t.c)
				return pos.dist;

			// bfs next
			for (int i = 0; i < 8; i++)
			{
				int r = pos.r + dx[i];
				int c = pos.c + dy[i];
				if (valid(r, c) && !visited[r][c])
					q.add(new Pos(r, c, pos.dist + 1));
			}
		}
		return -1;
	}

	private boolean valid(int r, int c)
	{
		return r >= 0 && r < n && c >= 0 && c < n;
	}

}

class Pos
{
	int r, c, dist;

	public Pos(String str, int dist)
	{
		r = str.charAt(0) - 'a';
		c = Integer.parseInt(str.charAt(1) + "") - 1;
		this.dist = dist;
	}

	public Pos(int r, int c, int dist)
	{
		this.r = r;
		this.c = c;
		this.dist = dist;
	}
	
	public String toString()
	{
		return r + "," + c + " : " + dist;
	}
}