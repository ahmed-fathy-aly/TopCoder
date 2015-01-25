import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class grafixMask
{
	int n = 400;
	int m = 600;
	int dx[] = new int[]
	{ 1, -1, 0, 0 };
	int dy[] = new int[]
	{ 0, 0, 1, -1 };
	private boolean[][] visited;

	public int[] sortedAreas(String[] rectangles)
	{
		// block rectangles
		visited = new boolean[n][m];
		for (String rectStr : rectangles)
			blockRectangle(rectStr);

		// bfs on the rest
		ArrayList<Integer> counts = new ArrayList<>();
		for (int r = 0; r < n; r++)
			for (int c = 0; c < m; c++)
				if (!visited[r][c])
					counts.add(bfs(r, c));

		// make an array
		Collections.sort(counts);
		int ans[] = new int[counts.size()];
		for (int i = 0; i < counts.size(); i++)
			ans[i] = counts.get(i);
		return ans;
	}

	private Integer bfs(int sourceR, int sourceC)
	{
		// invariants
		Queue<Integer> qr = new LinkedList<Integer>();
		Queue<Integer> qc = new LinkedList<Integer>();
		qr.add(sourceR);
		qc.add(sourceC);
		int sum = 0;

		// bfs
		while (!qr.isEmpty())
		{
			// welcome new cell
			int r = qr.poll();
			int c = qc.poll();
			if (visited[r][c])
				continue;
			visited[r][c] = true;
			sum++;

			// add next cells
			for (int i = 0; i < 4; i++)
			{
				int newR = r + dx[i];
				int newC = c + dy[i];
				if (valid(newR, newC))
					if (!visited[newR][newC])
					{
						qr.add(newR);
						qc.add(newC);
					}
			}

		}
		return sum;
	}

	private boolean valid(int r, int c)
	{
		return r >= 0 && r < n && c >= 0 && c < m;
	}

	private void blockRectangle(String str)
	{
		// parse co ordinates
		int r1, r2, c1, c2;
		StringTokenizer tok = new StringTokenizer(str);
		r1 = Integer.parseInt(tok.nextToken());
		c1 = Integer.parseInt(tok.nextToken());
		r2 = Integer.parseInt(tok.nextToken());
		c2 = Integer.parseInt(tok.nextToken());

		// block
		for (int r = r1; r <= r2; r++)
			for (int c = c1; c <= c2; c++)
				visited[r][c] = true;
	}

}
