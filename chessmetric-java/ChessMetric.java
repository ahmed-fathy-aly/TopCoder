import javax.xml.bind.ValidationEvent;

public class ChessMetric
{

	private int dx[] = new int[]
	{ 1, 1, 2, 2, -1, -1, -2, -2 };
	private int dy[] = new int[]
	{ 2, -2, 1, -1, 2, -2, 1, -1 };
	private long[][][] dp;
	private int size;
	private int endX;
	private int endY;

	public long howMany(int size, int[] start, int[] end, int numMoves)
	{
		// save params
		this.size = size;
		this.endX = end[0];
		this.endY = end[1];

		// clear memory
		dp = new long[size][size][numMoves + 1];
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				for (int k = 0; k <= numMoves; k++)
					dp[i][j][k] = -1;

		return f(start[0], start[1], numMoves);
	}

	private long f(int x, int y, int numMoves)
	{
		// base case
		if (numMoves == 0)
			if (x == endX && y == endY)
				return 1;
			else
				return 0;

		// already solved
		if (dp[x][y][numMoves] != -1)
			return dp[x][y][numMoves];

		// try all paths
		long sum = 0;
		for (int dx = -1; dx <= 1; dx++)
			for (int dy = -1; dy <= 1; dy++)
				if (!(dx == 0 && dy == 0))
				{
					int newX = x + dx;
					int newY = y + dy;
					if (valid(newX, newY))
						sum += f(newX, newY, numMoves - 1);
				}
		for (int i = 0; i < 8; i++)
		{
			int newX = x + dx[i];
			int newY = y + dy[i];
			if (valid(newX, newY))
				sum += f(newX, newY, numMoves - 1);
		}

		// record answer
		dp[x][y][numMoves] = sum;
		return sum;
	}

	private boolean valid(int x, int y)
	{
		return x >= 0 && x < size && y >= 0 && y < size;
	}

}
