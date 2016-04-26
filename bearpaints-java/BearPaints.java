public class BearPaints
{

	public long maxArea(int W, int H, long M)
	{
		// try all widthes
		long max = 0;
		for (long w = 1; w <= W; w++)
		{
			long h = 1l * M / w;
			h = Math.min(h, H);
			if (w * h > max)
				max = w * h;
		}

		// all heights
		for (long h = 1; h <= H; h++)
		{
			long w = 1l * M / h;
			w = Math.min(w, W);
			if (w * h > max)
				max = w * h;
		}

		return max;
	}

}
