public class Zoo
{

	public long theCount(int[] answers)
	{
		// make count
		int n = answers.length;
		int count[] = new int[n];
		for (int x : answers)
			if (x < n)
				count[x]++;
			else
				return 0;

		// check invalid
		for (int i = 0; i < n; i++)
		{
			if (count[i] > 2)
				return 0;
			if (i > 0 && count[i] > count[i - 1])
				return 0;
		}

		// check if one is longer
		boolean oneLonger = false;
		for (int i = 0; i < count.length; i++) 
			if (count[i] == 1)
				oneLonger = true;
			
		// compute
		long ans = oneLonger ? 2 : 1;
		for (int x : count)
			if (x == 2)
				ans *= 2;
		return ans;
	}
}
