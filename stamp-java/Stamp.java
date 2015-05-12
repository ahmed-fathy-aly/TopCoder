import java.util.Arrays;

public class Stamp
{

	private int n;
	private int stampCost;
	private int pushCost;
	private int[] colors;
	private int l;
	private long[][] dp;

	public int getMinimumCost(String desiredColor, int stampCost, int pushCost)
	{
		// fill param
		n = desiredColor.length();
		colors = new int[n];
		for (int i = 0; i < n; i++)
			if (desiredColor.charAt(i) == '*')
				colors[i] = 0;
			else if (desiredColor.charAt(i) == 'R')
				colors[i] = 1;
			else if (desiredColor.charAt(i) == 'G')
				colors[i] = 2;
			else if (desiredColor.charAt(i) == 'B')
				colors[i] = 3;
		this.stampCost = stampCost;
		this.pushCost = pushCost;

		// try all stamp lengths
		long min = Integer.MAX_VALUE;
		for (l = 1; l <= n; l++)
		{
			long cost = cost(l);
			if (cost != -1)
				min = Math.min(min, cost + stampCost * l);
		}
		return (int) min;
	}

	private long cost(int l)
	{
		dp = new long[n][4];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < 4; j++)
				dp[i][j] = -1;

		return f(0, 0);
	}

	private long f(int i, int color)
	{
		// base case
		if (i == n)
			return 0;
		if (i + l > n)
			return -1;
		if (dp[i][color] != -1)
			return dp[i][color];

		// check which color we can use
		int colorNeeded = 0;
		for (int j = i; j < i + l; j++)
			if (colors[j] != colorNeeded)
				if (colors[j] != 0)
				{
					if (colorNeeded == 0)
						colorNeeded = colors[j];
					else
						colorNeeded = -1;
				}

		if (colorNeeded != color)
			if (color != 0)
				if (colorNeeded == 0)
					colorNeeded = color;
				else
					colorNeeded = color == 0 ? colorNeeded : -1;
		if (colorNeeded == -1)
			return -1;

		// try all colors
		long min = Integer.MAX_VALUE;
		for (int usedColor = 1; usedColor <= 3; usedColor++)
			for (int nextIndex = i + 1; nextIndex <= i + l; nextIndex++)
				if (colorNeeded == 0 || colorNeeded == usedColor)
				{
					long remCost = f(nextIndex, nextIndex == i + l ? 0 : usedColor);
					if (remCost != -1)
						min = Math.min(min, remCost + pushCost);
				}

		dp[i][color] = min;
		return min;
	}

}
