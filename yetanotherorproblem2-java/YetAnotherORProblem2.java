public class YetAnotherORProblem2
{

	private boolean[] bits;
	private int nBits;
	private long[][] dp;
	private int nRows;
	int MOD = 1000000009;

	public int countSequences(int N, int R)
	{
		// convert R to bits
		toBinary(R);
		nRows = N;

		// dp
		dp = new long[nBits][nRows + 1];
		for (int i = 0; i < nBits; i++)
			for (int j = 0; j <= nRows; j++)
				dp[i][j] = -1;

		return (int) f(nBits - 1, nRows);
	}

	private long f(int col, int nEqual)
	{
		// base case
		if (col == -1)
			return 1;
		if (dp[col][nEqual] != -1)
			return dp[col][nEqual];

		// put all zeroes
		long ans = 0;
		if (bits[col] == true)
			ans += f(col - 1, 0);
		else
			ans += f(col - 1, nEqual);

		// put a one in those not equal
		if (bits[col] == true)
			ans += f(col - 1, 0) * (nRows - nEqual);
		else
			ans += f(col - 1, nEqual) * (nRows - nEqual);

		// put a one in those equal
		if (bits[col])
			ans += f(col - 1, 1) * nEqual;
		
		ans %= MOD;
		dp[col][nEqual] = ans;
		return ans;
	}

	private void toBinary(int x)
	{
		// count nBits
		nBits = 0;
		int temp = x;
		while (temp > 0)
		{
			nBits++;
			temp /= 2;
		}
		//nBits++;
		
		// make bits
		bits = new boolean[nBits];
		for (int i = 0; i < nBits; i++, x /= 2)
			if (x % 2 == 1)
				bits[i] = true;

	}

}
