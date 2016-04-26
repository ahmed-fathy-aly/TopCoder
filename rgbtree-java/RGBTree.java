public class RGBTree
{

	private int n;
	private char[][] graph;
	private boolean[][][][] dp;
	private boolean[][][][] visited;
	
	
	public String exist(String[] G)
	{
		// make graph
		n = G.length;
		graph = new char[n][n];
		for (int i = 0; i < n; i++)
			graph[i] = G[i].toCharArray();

		// clear dp
		visited = new boolean[(1 << n)][5][5][5];
		dp = new boolean[(1 << n)][5][5][5];

		return f(1, 0, 0, 0) ? "Exist" : "Does not exist";
	}

	private boolean f(int mask, int r, int g, int b)
	{
		// base case
		if (r > 4 || g > 4 || b > 4)
			return false;
		if (mask == (1 << n ) - 1)
			return (r == g && g == b);
		if (visited[mask][r][g][b])
			return dp[mask][r][g][b];
		// try adding any edge
		boolean can = false;
		for (int node1 = 0; node1 < n; node1++)
			if ((mask & (1 << node1)) != 0)
				for (int node2 = 0; node2 < n; node2++)
					if ((mask & (1 << node2)) == 0)
					{
						int color = graph[node1][node2];
						switch (color)
						{
						case 'R':
							can |= f(mask | (1 << node2), r + 1, g, b);
							break;

						case 'G':
							can |= f(mask | (1 << node2), r, g + 1, b);
							break;

						case 'B':
							can |= f(mask | (1 << node2), r, g, b + 1);
							break;

						default:
							break;
						}

					}

		visited[mask][r][g][b] = true;
		return dp[mask][r][g][b] = can;
	}

}
