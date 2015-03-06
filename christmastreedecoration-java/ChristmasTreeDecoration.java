import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ChristmasTreeDecoration
{

	private int nNodes;
	private boolean[][] g;
	private int nEdges;

	public int solve(int[] col, int[] x, int[] y)
	{
		// make params
		nNodes = col.length;
		for (int i = 0; i < y.length; i++)
		{
			x[i]--;
			y[i]--;
		}
		g = new boolean[nNodes][nNodes];
		for (int i = 0; i < nNodes; i++)
			for (int j = 0; j < nNodes; j++)
				if (i == j)
					g[i][j] = true;

		// connect edges with different color
		nEdges = x.length;
		for (int i = 0; i < nEdges; i++)
			if (col[x[i]] != col[y[i]])
			{
				g[x[i]][y[i]] = true;
				g[y[i]][x[i]] = true;
			}

		// connect edges of same color if not connected
		int count = 0;
		for (int i = 0; i < nEdges; i++)
			if (!isConnected(x[i], y[i]))
			{
				count++;
				g[x[i]][y[i]] = true;
				g[y[i]][x[i]] = true;
			}

		return count;
	}

	private boolean isConnected(int s, int t)
	{
		// bfs from s t o t
		boolean visited[] = new boolean[nNodes];
		visited[s] = true;
		Queue<Integer> q = new LinkedList<>();
		q.add(s);

		while (!q.isEmpty())
		{
			int node = q.poll();
			for (int next = 0; next < nNodes; next++)
				if (next != node && g[node][next])
					if (!visited[next])
					{
						visited[next] = true;
						q.add(next);
						if (next == t)
							return true;
					}
		}
		return false;
	}

}
