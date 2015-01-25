public class PilingRectsDiv2
{

	public int getmax(int[] X, int[] Y, int limit)
	{
		// try all the possible widths and heights
		int ans = -1;
		for (int width = 1; width <= limit; width++)
		{
			// count the valid rectangles
			int height = (int) Math.ceil(1.0 * limit / width);
			int count = 0;
			for (int i = 0; i < X.length; i++)
				if ((X[i] >= width && Y[i] >= height) || (Y[i] >= width && X[i] >= height))
					count++;
			if (count > 0)
				ans = Math.max(ans, count);
		}

		return ans;
	}

}
