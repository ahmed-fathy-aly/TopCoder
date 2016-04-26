import java.util.LinkedList;

public class PalindromePath
{
	int n;
	LinkedList<Edge> next[];
	private int[][][] dp;
	int maxlevel = 300;

	public int shortestLength(int n, int[] a, int[] b, String c)
	{
		// form adjacency list
		this.n = n;
		next = new LinkedList[n];
		for (int i = 0; i < n; i++)
			next[i] = new LinkedList<>();
		for (int i = 0; i < a.length; i++)
		{
			Edge e1 = new Edge(b[i], c.charAt(i));
			Edge e2 = new Edge(a[i], c.charAt(i));
			next[a[i]].add(e1);
			next[b[i]].add(e2);
		}

		// clear dp
		dp = new int[n][n][maxlevel];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				for (int k = 0; k < maxlevel; k++)
					dp[i][j][k] = -1;

		// odd length
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++)
			min = Math.min(min, f(i, i, 0));

		// even length
		for (int i = 0; i < n; i++)
			for (Edge e : next[i])
			{
				int path = f(i, e.dest, 0);
				if (path != Integer.MAX_VALUE)
					min = Math.min(min, 1 + f(i, e.dest, 0));
			}
		
		return min == Integer.MAX_VALUE ? -1 : min;
	}

	private int f(int node1, int node2, int level)
	{
		// base case
		if (node1 == 0 && node2 == 1)
			return 0;
		if (level == maxlevel)
			return Integer.MAX_VALUE;
		if (dp[node1][node2][level] != -1)
			return dp[node1][node2][level];

		// try all edges here and there
		int min = Integer.MAX_VALUE;
		for (Edge e1 : next[node1])
			for (Edge e2 : next[node2])
				if (e1.c == e2.c)
				{
					int path = f(e1.dest, e2.dest, level + 1);
					if (path != Integer.MAX_VALUE)
						min = Math.min(min, path + 2);
				}

		return dp[node1][node2][level] = min;
	}

	class Edge
	{
		int dest;
		char c;

		public Edge(int dest, char c)
		{
			this.dest = dest;
			this.c = c;
		}
	}

}
