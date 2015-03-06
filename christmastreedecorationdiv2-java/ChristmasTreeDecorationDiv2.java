public class ChristmasTreeDecorationDiv2
{

	public int solve(int[] col, int[] x, int[] y)
	{
		int sum = 0;
		for (int i = 0; i < y.length; i++) 
		{
			int c1 = col[x[i]-1];
			int c2 = col[y[i]-1];
			if (c1 != c2)
				sum ++;
		}
			
		return sum;
	}

}
