public class AliceGameEasy
{

	public long findMinimumValue(long x, long y)
	{
		// find total number of games
		int total = -1;
		int curr = 0;
		while (f(curr) <= x + y)
		{
			if (f(curr) == x + y)
				total = curr;
			curr++;
		}
		if (total == -1)
			return -1;

		// find number of game alice played
		int nAlice = 0;
		while(nAlice <= total)
		{
			long min = 1l * nAlice * (nAlice+1) / 2;
			long max = 1l * (total - nAlice + 1 + total) * nAlice / 2;
			if (min <= x && x <= max)
				return nAlice;
			nAlice++;
		}
		return -1;
	}

	private long f(int n)
	{
		return 1l*n*(n+1) / 2;
	}

}
