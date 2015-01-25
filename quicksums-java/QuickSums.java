public class QuickSums
{

	private String str;
	private int n;
	private int[][][] dp;
	private static int INVALID = -1;
	private static int UNSOLVED = -2;

	public int minSums(String numbers, int sum)
	{
		// save params
		str = numbers;
		n = numbers.length();

		// clear memory
		dp = new int[n][n][sum + 1];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				for (int k = 0; k <= sum; k++)
					dp[i][j][k] = UNSOLVED;

		return f(0, n - 1, sum);
	}

	private int f(int start, int end, int rem)
	{
		// base case
		Long x = Long.parseLong(str.substring(start, end+1));
		if (x == rem)
			return 0;

		// already solved
		if (dp[start][end][rem] != UNSOLVED)
			return dp[start][end][rem];

		// find min moves
		int min = INVALID;
		for (int newStart = start + 1; newStart <= Math.min(end, start + 3); newStart++)
		{
			// try to make an operation for start to i
			int taken = Integer.parseInt(str.substring(start, newStart));
			int newRem = rem - taken;
			if (newRem < 0)
				continue;
			int otherOperations = f(newStart, end, newRem);
			if (otherOperations != INVALID)
				if (min == INVALID)
					min = 1 + otherOperations;
				else
					min = Math.min(min, 1 + otherOperations);
		}

		// save answer
		dp[start][end][rem] = min;
		return min;
	}

}
