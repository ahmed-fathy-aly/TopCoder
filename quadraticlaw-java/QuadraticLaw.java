public class QuadraticLaw
{

	public long getTime(long d)
	{
		// bs
		long start = 0;
		long end = Integer.MAX_VALUE;
		while (start <= end)
		{
			long mid = (start + end) / 2;
			boolean valMid = valid(mid, d);
			boolean validNext = valid(mid + 1, d);
			if (valMid && !validNext)
				return mid;
			else if (!valMid)
				end = mid;
			else
				start = mid;
		}

		return 0;
	}

	private boolean valid(long t, long d)
	{
		long x = t + t * t;
		return x <= d;
	}

}
