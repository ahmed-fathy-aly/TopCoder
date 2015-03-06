import java.util.Arrays;
import java.util.Iterator;

public class NumberGameAgain
{

	public long solve(int k, long[] table)
	{
		// find max num
		long maxNum = 1;
		for (int i = 0; i < k; i++)
			maxNum *= 2;
		maxNum -= 1;

		// find total number and subtract forbidden
		long sum = maxNum - 1;
		System.out.println("sum:" + sum);

		Arrays.sort(table);
		for (int i = 0; i < table.length; i++) 
		{
			long x = table[i];
			long s2 = 0;
			long currBranches = 1;
			long currNum = x;
			while (currNum <= maxNum)
			{
				// add to removed items
				s2 += currBranches;

				// remove from table
				long min = currNum;
				long max = currNum + currBranches - 1;
				for (int j = i+1; j< table.length; j++)
					if (min <= table[j] && table[j] <= max)
						table[j] = maxNum + 1;

				// update
				currBranches *= 2;
				currNum *= 2;
			}
			System.out.println(s2);
			sum -= s2;
		}

		return sum;
	}
}
