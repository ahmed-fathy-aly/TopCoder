import java.util.Arrays;

public class BearCries
{

	private int n;
	private char[] arr;
	private long[][][] dp;
	int mod = 1000000007;
	
	public int count(String message)
	{
		// clear dp
		n = message.length();
		arr = message.toCharArray();
		dp = new long[n][n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				for (int k = 0; k < n; k++)
					dp[i][j][k] = -1;

		return (int) f(0, 0, 0);
	}

	private long f(int i, int a, int b)
	{
		if (i == n)
			return (a == 0 && b == 0) ? 1 : 0;
		if (dp[i][a][b] != -1)
			return dp[i][a][b];

		long count = 0;
		if (arr[i] == ';')
		{
			// close an open one that has a _
			if (b != 0)
				count += b * f(i + 1, a, b - 1);

			// open a new one
			count += f(i + 1, a + 1, b);
		}

		if (arr[i] == '_')
		{
			// put it to one that already has _
			count += b * f(i + 1, a, b);

			// put it to a poor one that has no _
			if (a != 0)
				count += a * f(i + 1, a - 1, b+1);
		}

		return dp[i][a][b] = count % mod;
	}

}
