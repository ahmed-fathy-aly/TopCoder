public class BadNeighbors
{

	private int[] arr;
	private int n;
	private int[][] dp;

	public int maxDonations(int[] donations)
	{
		// clear memory
		arr = donations;
		n = donations.length;
		dp = new int[n][2];
		for (int i = 0; i < n; i++) 
			for (int j = 0; j < 2; j++) 
				dp[i][j] = -1;			
			
		return Math.max(f(0, 1), f(1, 0));
	}

	private int f(int i, int tookFirst)
	{
		// base case
		if (i >= n)
			return 0;
		if (i == n-1 && tookFirst == 1)
			return 0;
		
		// already solved
		if (dp[i][tookFirst] != -1)
			return dp[i][tookFirst];
		
		// solve
		int ans = Math.max(arr[i] + f(i+2, tookFirst), f(i+1, tookFirst));
		dp[i][tookFirst] = ans;
		return ans;
	}

}
