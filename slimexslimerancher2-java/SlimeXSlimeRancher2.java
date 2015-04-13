public class SlimeXSlimeRancher2
{

	public int train(int[] attributes)
	{
		// find range
		int n = attributes.length;
		int max = Integer.MIN_VALUE;
		for (int i : attributes) 
			max = Math.max(max, i);
		
		// find sum
		int sum = 0;
		for (int i : attributes) 
			sum += max - i;
		return sum;
	}

}
