import java.util.Arrays;

public class SpellCardsEasy
{

	private int[][] dp;
	private int n;
	private int[] level;
	private int[] damage;

	public int maxDamage(int[] level, int[] damage)
	{
		// clear mem
		n = level.length;
		this.level = level;
		this.damage = damage;
		dp = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				dp[i][j] = -1;

		return f(n - 1, 0);
	}

	private int f(int idx, int rem)
	{
		// base case
		if (idx < 0)
			return 0;
		if (dp[idx][rem] != -1)
			return dp[idx][rem];

		// dun take it
		int max = 0;
		max = Math.max(max, f(idx - 1, rem + 1));

		// take it
		if (rem >= level[idx] - 1)
			max = Math.max(max, damage[idx] + f(idx - 1, rem - (level[idx] - 1)));

		return dp[idx][rem] = max;
	}

}
