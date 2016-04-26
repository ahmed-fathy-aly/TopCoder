import java.util.Arrays;

public class DivFreed2
{

	private long[][] count;
	int mod = 1000000007;

	public int count(int n, int k)
	{

		count = new long[n + 1][k + 1];
		for (int x = 1; x <= k; x++)
			count[1][x] = 1;

		// invalid ways
		for (int l = 2; l <= n; l++)
		{
			// valid ways
			long total = 0;
			for (int x = 1; x <= k; x++)
				total = (total + count[l - 1][x]) % mod;
			Arrays.fill(count[l], total);

			// remove invalid ways
			for (int x = 1; x <= k; x++)
				for (int y = x + x; y <= k; y += x)
					count[l][x] = (count[l][x] - count[l - 1][y] + mod) % 1000000007;
		}

		// sum
		long sum = 0;
		for (int i = 1; i <= k; i++)
			sum = (sum + count[n][i]) % mod;
		return (int) sum;
	}

}
