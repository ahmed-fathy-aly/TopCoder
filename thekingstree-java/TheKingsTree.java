import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.LinkedList;

public class TheKingsTree
{
	int n;
	int[] child, brother, latestBrother, treeSize;
	private int[][] dp;

	
	public int getNumber(int[] parent)
	{
		// build tree
		n = parent.length + 1;
		child = new int[n];
		brother = new int[n];
		latestBrother = new int[n];
		Arrays.fill(child, -1);
		Arrays.fill(brother, -1);
		Arrays.fill(latestBrother, -1);
		for (int c = 1; c < n; c++)
		{
			int p = parent[c - 1];
			if (latestBrother[p] == -1)
			{
				child[p] = c;
				latestBrother[p] = c;
			} else
			{
				brother[latestBrother[p]] = c;
				latestBrother[p] = c;
			}
		}

		// count subtree size
		treeSize = new int[n];
		countTree(0);

		// clear dp
		dp = new int[n][n + 1];
		for (int i = 0; i < n; i++)
			for (int j = 0; j <= n; j++)
				dp[i][j] = -1;

		// find max
		int min = Integer.MAX_VALUE;
		for (int red = 0; red <= n; red++)
			min = Math.min(min, f(0, red));
		return min;
	}

	private int f(int node, int red)
	{
		// base case
		if (dp[node][red] != -1)
			return dp[node][red];

		int green = treeSize[node] - red;
		int min = Integer.MAX_VALUE;

		// no brother, no children
		if (child[node] == -1 && brother[node] == -1)
		{
			if (red == 1 && green == 0) 
				;
			else if (red == 0 && green == 1)
				;
			else
				return 100000;
				
			min = 1;
		}
		
		// brother, no children
		else if (child[node] == -1 && brother[node] != -1)
		{
			if (red > 0)
				min = Math.min(min, 1 + f(brother[node], red - 1));

			if (green > 0)
				min = Math.min(min, 1 + f(brother[node], red));
		}

		// no brother, children
		else if (brother[node] == -1 && child[node] != -1)
		{
			if (red > 0)
				min = Math.min(min, red + f(child[node], red - 1));

			if (green > 0)
				min = Math.min(min, green + f(child[node], red));
		}

		// brother and children
		else
		{
			// red
			if (red > 0)
				for (int brotherR = 0; brotherR <= red - 1; brotherR++)
				{
					int brotherCost = f(brother[node], brotherR);
					int childCost = (red - 1 - brotherR)+ f(child[node], red - 1 - brotherR);
					min = Math.min(min, 1 + brotherCost + childCost);
				}
			
			// green
			if (green > 0)
				for (int brotherR = 0; brotherR <= red; brotherR++)
				{
					int brotherCost = f(brother[node], brotherR);
					int childCost =  (treeSize[child[node]] -  (red - brotherR))
							+ f(child[node], red - brotherR);
					min = Math.min(min, 1 + brotherCost + childCost);
				}
		}

		return dp[node][red] = min;
	}

	private int countTree(int node)
	{
		int sum = 1;
		if (child[node] != -1)
			sum += countTree(child[node]);
		if (brother[node] != -1)
			sum += countTree(brother[node]);
		return treeSize[node] = sum;

	}

}
