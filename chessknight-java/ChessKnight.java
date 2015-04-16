public class ChessKnight
{

	static int dx[] = new int[]
	{ 1, 2, 2, 1, -1, -2, -2, -1 };
	static int dy[] = new int[]
	{ 2, 1, -1, -2, -2, -1, 1, 2 };

	public double probability(int x, int y, int n)
	{
		// go from each cell to next
		x--;
		y--;
		double g[][][] = new double[n + 1][8][8];
		g[0][x][y] = 1.0;
		for (int i = 0; i < n; i++)
			for (int r = 0; r < 8; r++)
				for (int c = 0; c < 8; c++)
				{
					// go to all next squares
					for (int j = 0; j < dx.length; j++)
					{
						int r2 = r + dx[j];
						int c2 = c + dy[j];
						if (valid(r2, c2))
							g[i + 1][r2][c2] += g[i][r][c] / 8.0;
					}
				}

		// sum probabilities
		double sum = 0;
		for (int r = 0; r < 8; r++)
			for (int c = 0; c < 8; c++)
				sum += g[n][r][c];
		return sum;
	}

	private boolean valid(int r, int c)
	{
		return r >= 0 && r < 8 && c >= 0 && c < 8;
	}

}
