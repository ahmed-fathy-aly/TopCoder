public class ChocolateDividingEasy
{

	private int width;
	private int height;
	private int[][] g;
	private int[] cutR;
	private int[] cutC;

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

		// try all cuts
		int max = 0;
		cutR = new int[4];
		cutC = new int[4];
		cutR[3] = height;
		cutC[3] = width;
		for (int r1 = 1; r1 < height; r1++)
			for (int r2 = r1 + 1; r2 < height; r2++)
				for (int c1 = 1; c1 < width; c1++)
					for (int c2 = c1 + 1; c2 < width; c2++)
					{
						cutR[1] = r1;
						cutR[2] = r2;
						cutC[1] = c1;
						cutC[2] = c2;
						max = Math.max(max, findMinSqure());
					}
		return max;
	}

	private int findMinSqure()
	{
		// find min of all squares
		int min = Integer.MAX_VALUE;
		for (int r = 1; r < 4; r++) 
			for (int c = 1; c < 4; c++) 
				min = Math.min(min, getArea(cutR[r-1], cutR[r], cutC[c-1], cutC[c]));
		return min;
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
