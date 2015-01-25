import java.util.Arrays;

public class WinterAndMandarins
{

	public int getNumber(int[] bags, int K)
	{
		// try each start
		Arrays.sort(bags);
		int idx = 0;
		int min = Integer.MAX_VALUE;
		while (idx + K - 1< bags.length)
		{
			min = Math.min(min, bags[idx + K - 1] - bags[idx]);
			idx ++;
		}
		return min;
	}

}
