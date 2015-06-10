import java.util.Arrays;

public class CutTheNumbers
{

	private int R;
	private int C;
	private int n;
	private int[] dp;
	private int[][] g;

	public int maximumSum(String[] board)
	{
		// make params
		R = board.length;
		C = board[0].length();
		n = R * C;
		dp = new int[(1 << n)];
		Arrays.fill(dp, -1);
		g = new int[R][C];
		for (int r = 0; r < R; r++)
			for (int c = 0; c < C; c++)
				g[r][c] = Integer.parseInt(board[r].charAt(c) + "");

		return f(0);
	}

	private int f(int mask)
	{
		// base case
		if (mask == (1 << n) - 1)
			return 0;
		if (dp[mask] != -1)
			return dp[mask];

		// try to take anything
		int max = 0;
		for (int r = 0; r < R; r++)
			for (int c = 0; c < C; c++)
			{
				// take in the same row
				int newMask = mask;
				int sum = 0;
				for (int c2 = c; c2 < C; c2++)
				{
					int idx = getIdx(r, c2);
					if ((mask & (1 << idx)) != 0)
						break;
					sum += g[r][c2];
					newMask |= (1 << idx);
					max = Math.max(max, sum + f(newMask));
					sum *= 10;
				}

				// take in the same coloumn
				newMask = mask;
				sum = 0;
				for (int r2 = r; r2 < R; r2++)
				{
					int idx = getIdx(r2, c);
					if ((mask & (1 << idx)) != 0)
						break;
					sum += g[r2][c];
					newMask |= (1 << idx);
					max = Math.max(max, sum + f(newMask));
					sum *= 10;
				}

			}

		dp[mask] = max;
		return max;
	}

	private int getIdx(int r, int c)
	{
		return r * C + c;
	}

}
