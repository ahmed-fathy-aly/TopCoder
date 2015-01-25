import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class AvoidRoads
{

	private int width;
	private int height;
	private Point[][][] badPoints;
	private long[][] dp;
	private int[] dx = new int[]
	{ -1, 0 };
	private int[] dy = new int[]
	{ 0, -1 };

	public long numWays(int width, int height, String[] bad)
	{
		// save params
		this.width = width;
		this.height = height;

		// find bad points
		findBadPoints(bad);

		// clear mem
		dp = new long[width + 1][height + 1];
		for (int i = 0; i <= width; i++)
			for (int j = 0; j <= height; j++)
				dp[i][j] = -1L;

		return f(width, height);
	}

	private long f(int x, int y)
	{
		// base case
		if (x == 0 && y == 0)
			return 1L;

		// already solved
		if (dp[x][y] != -1)
			return dp[x][y];

		// try all next points if valid
		long ans = 0;
		for (int i = 0; i < dx.length; i++)
		{
			// check the new point is valid
			int newX = x + dx[i];
			int newY = y + dy[i];
			boolean valid = true;
			if (newX < 0 || newX > width || newY < 0 || newY > height)
				valid = false;
			for (Point p : badPoints[x][y])
				if (p != null)
					if (p.x == newX && p.y == newY)
						valid = false;

			// add to the answer
			if (valid)
				ans += f(newX, newY);
		}
		dp[x][y] = ans;
		return ans;
	}

	private void findBadPoints(String[] bad)
	{
		badPoints = new Point[width + 1][height + 1][50];
		for (String badStr : bad)
		{
			// parse point
			StringTokenizer tok = new StringTokenizer(badStr);
			int x1 = Integer.parseInt(tok.nextToken());
			int y1 = Integer.parseInt(tok.nextToken());
			int x2 = Integer.parseInt(tok.nextToken());
			int y2 = Integer.parseInt(tok.nextToken());

			// mark as bad for the first point
			boolean done = true;
			for (int i = 0; i < 50; i++)
				if (badPoints[x1][y1][i] == null)
				{
					badPoints[x1][y1][i] = new Point(x2, y2);
					done = false;
					break;
				}
			if (done)
				System.out.println("failed");
			// mark as bad for the second point
			for (int i = 0; i < 50; i++)
				if (badPoints[x2][y2][i] == null)
				{
					badPoints[x2][y2][i] = new Point(x1, y1);
					break;
				}
		}
	}

}

class Point
{
	int x, y;

	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}