public class TheCowDivTwo
{
	int MOD = 1000000007;
	private int[][][] dp;
	private int n;
	private int k;

	public int find(int N, int K)
	{
		// clear dp
		n = N;
		k = K;
		dp = new int[2][N + 1][K + 1];
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < N + 1; j++)
				for (int k = 0; k < K + 1; k++)
					dp[i][j][k] = -1;

		// dp
		for (int idx = n; idx >= 0; idx--)
			for (int sum = n; sum >= 0; sum--)
				for (int remaining = k; remaining >= 0; remaining--)
				{
					int ans = 0;

					if (idx == n)
						if (remaining == 0 && sum % n == 0)
							ans = 1;
						else
							ans = 0;
					else
					{
						if (remaining > 0)
							ans = (ans + dp[(idx + 1)%2][(sum + idx) % n][remaining - 1]) % MOD;
						ans = (ans + dp[(idx + 1)%2][(sum) % n][remaining]) % MOD;
					}
					dp[idx%2][sum][remaining] = ans;
				}

		return dp[0][0][k];
	}

}
