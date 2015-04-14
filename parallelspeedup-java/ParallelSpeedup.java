public class ParallelSpeedup
{

	public int numProcessors(int k, int overhead)
	{
		// try all
		long  minTime = Integer.MAX_VALUE;
		int  minNum = -1;
		for (int n = 1; n <= k; n++) 
		{
			long commTime = 1l * overhead *  n * (n-1) / 2;
			long processingTime = (int) Math.ceil(1.0 * k / n);
			long time = commTime + processingTime;
			if (time < minTime)
			{
				minTime = time;
				minNum = n;
			}
		}
			
		return minNum;
	}

}
