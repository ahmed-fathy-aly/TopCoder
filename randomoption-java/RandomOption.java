public class RandomOption
{

	private int n;
	private double[][][] dp;
	private boolean[][] g;

	public double getProbability(int keyCount, int[] badLane1, int[] badLane2)
	{
		// set invalid matrix
		n = keyCount;
		g = new boolean[n+1][n+1];
		for (int i = 0; i < badLane2.length; i++) 
		{
			g[badLane1[i]][badLane2[i]] = true;
			g[badLane2[i]][badLane1[i]] = true;
		}
			
		// clear mem
		dp = new double[n+1][n+1][1 << n];
		for (int i = 0; i <= n; i++)
			for (int j = 0; j <= n; j++)
				for (int k = 0; k < (1 << n); k++)
					dp[i][j][k] = -1;
		return f(n, 0, 0);
	}

	private double f(int prev, int idx, int mask)
	{
		// base case
		if (idx == n)
			return 1.0;
		if (dp[prev][idx][mask] != -1)
			return dp[prev][idx][mask];

		// try all good choices
		double pGood = 0;
		int nGood = 0;
		int nBad = 0;
		for (int i = 0; i < n; i++) 
			if (((mask & (1<<i)) == 0))
			{
				boolean canPut = g[prev][i] == false;
				if (canPut)
				{
					nGood++;
					pGood += f(i, idx + 1, mask | (1<<i));
				}
				else
					nBad++;
			}
		pGood /= (nGood+nBad);
		
		return dp[prev][idx][mask] = pGood;
	}


}
