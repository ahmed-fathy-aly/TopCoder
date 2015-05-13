public class LuckyRemainder
{

	private long[][] ncr;
	private int n;
	private char[] chars;

	public int getLuckyRemainder(String X)
	{
		// clear ncr
		chars = X.toCharArray();
		n = X.length();
		ncr = new long[n + 1][n + 1];
		for (int i = 0; i <= n; i++)
			for (int j = 0; j <= n; j++)
				ncr[i][j] = -1;

		// compute sum of each number
		long sum = 0;
		for (int i = 0; i < X.length(); i++)
			sum += count(i);

		return (int) (sum % 9);
	}

	private long count(int idx)
	{
		int posBefore = n - idx - 1;
		int posAfter = idx;
		int value = Integer.parseInt(chars[idx] + "");
		long sum = 0;

		// find the number of occurences with i numbers before it
		for (int before = 0; before <= posBefore; before++)
		{
			long count = nCr(posBefore, before);
			count *= Math.round(Math.pow(2, posAfter));
			count *= value;
			sum = (sum + count) % 9;
		}
		return sum;
	}

	long nCr(int n, int r)
	{
		if (r == 0)
			return 1;
		if (n == 0)
			return 0;
		if (ncr[n][r] != -1)
			return ncr[n][r];

		long ans = nCr(n - 1, r - 1) + nCr(n - 1, r);
		ans %= 9;
		ncr[n][r] = ans;
		return ans;
	}
}
