public class YetAnotherIncredibleMachine
{
	long MOD = 1000000009;
	public int countWays(int[] platformMount, int[] platformLength, int[] balls)
	{
		long count  = 1;
		int nPlatforms = platformMount.length;
		for (int i = 0; i < nPlatforms; i++)
		{
			long positions = 0;
			for (int l = platformMount[i] - platformLength[i]; l <= platformMount[i]; l++)
			{
				int r = l + platformLength[i];
				boolean hit = false;
				for (int ball : balls)
					if (l <= ball && ball <= r)
						hit = true;
				if (!hit)
					positions++;
			}
			count *= positions;
			count %= MOD;
		}

		return (int) count;
	}

}
