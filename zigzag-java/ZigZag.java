public class ZigZag
{

	private int[] arr;
	private int n;
	private int[][] dp;

	public int longestZigZag(int[] sequence)
	{
		// clear memory
		arr = sequence;
		n = sequence.length;
		dp = new int[n][2];
		for (int i = 0; i < n; i++) 
			for (int j = 0; j <= 1; j++) 
				dp[i][j] = -1;
				
			
		// find the longest one
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) 
		{
			max = Math.max(max, f(i, 1));
			max = Math.max(max, f(i, 0));
		}
			
		return max;
	}

	private int f(int i, int increasing)
	{
		// already solved
		if (dp[i][increasing] != -1)
			return dp[i][increasing];
		
		// solve
		int ans = 1;
		if (increasing == 1)
		{
			for (int j = 0; j < i; j++) 
				if (arr[j] < arr[i])
					ans = Math.max(ans, 1 + f(j, 0));
		}
		else
		{
			for (int j = 0; j < i; j++) 
				if (arr[j] > arr[i])
					ans = Math.max(ans, 1 + f(j, 1));
		}
		
		// record
		dp[i][increasing] = ans;
		return ans;
	}

}
