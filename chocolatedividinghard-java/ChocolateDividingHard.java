
public class ChocolateDividingHard
{

	private int width;
	private int height;
	private int[][] g;
	private int[] cutR;

	public int findBest(String[] chocolate)
	{
		// save params
		width = chocolate[0].length();
		height = chocolate.length;
		g = new int[height + 1][width + 1];
		for (int r = 0; r < height; r++)
			for (int c = 0; c < width; c++)
				g[r + 1][c + 1] = Integer.parseInt(chocolate[r].charAt(c) + "");

		// accumulate sum
		for (int r = 1; r <= height; r++)
			for (int c = 1; c <= width; c++)
				g[r][c] += g[r - 1][c];
		for (int c = 1; c <= width; c++)
			for (int r = 1; r <= height; r++)
				g[r][c] += g[r][c - 1];

		// binary search for the answer
		int start = 0;
		int end = 10000;
		while (start <= end)
		{
			int mid = (start + end) / 2;
			boolean canMid = canSolve(mid);
			boolean canNext = canSolve(mid + 1);
			if (canMid && !canNext)
				return mid;
			else if (!canMid)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;

	}

	private boolean canSolve(int req)
	{
		// try all horizontal cuts
		cutR = new int[5];
		cutR[4] = height;
		for (int r1 = 1; r1 < height; r1++)
			for (int r2 = r1 + 1; r2 < height; r2++)
				for (int r3 = r2 + 1; r3 < height; r3++)
				{
					cutR[1] = r1;
					cutR[2] = r2;
					cutR[3] = r3;
					if (canPutEnoughColoumns(req))
						return true;
				}
		return false;
	}

	private boolean canPutEnoughColoumns(int req)
	{
		// see how many coloumns we can put
		int coloumns = 1;
		int prevC = 0;
		int currC = 1;
		while (currC <= width)
		{
			// find the min area now
			int min = Integer.MAX_VALUE;
			for (int r = 1; r < 5; r++)
			{
				int r1 = cutR[r - 1];
				int r2 = cutR[r];
				int c1 = prevC;
				int c2 = currC;
				min = Math.min(min, getArea(r1, r2, c1, c2));
			}

			// add a coloumn if we can
			if (min >= req)
			{
				coloumns++;
				prevC = currC;
			}

			// prune
			if (coloumns >= 5)
				return true;
			currC++;
		}
		return coloumns >= 5;
	}

	private int getArea(int r1, int r2, int c1, int c2)
	{
		int area = g[r2][c2];
		area -= g[r1][c2];
		area -= g[r2][c1];
		area += g[r1][c1];
		return area;
	}

}
