import java.awt.Dialog.ModalExclusionType;
import java.math.BigInteger;
import java.util.Arrays;

public class BearDestroysDiv2
{

	private int R;
	private int C;
	private int MOD;
	private long[][][][] dp;
	private long[] pows;

	public int sumUp(int W, int H, int MOD)
	{
		// read params
		this.R = H;
		this.C = W;
		this.MOD = MOD;
		this.pows = new long[R * C + 1];
		Arrays.fill(pows, -1);

		// clear dp
		dp = new long[(1 << C)][(1 << C)][R][C];
		for (int r = 0; r < (1 << C); r++)
			for (int r2 = 0; r2 < (1 << C); r2++)
				for (int rowIdx = 0; rowIdx < R; rowIdx++)
					for (int colIdx = 0; colIdx < C; colIdx++)
						for (int count = 0; count <= R * C; count++)
							dp[r][r2][rowIdx][colIdx] = -1;
		return (int) f(0, 0, 0, 0);
	}

	private long f(int currRow, int newRow, int r, int c)
	{
		// base case
		if (r == R)
		{
			return 0;
		}
		if (c == C)
			return f(newRow, 0, r + 1, 0);
		if (dp[currRow][newRow][r][c] != -1)
			return dp[currRow][newRow][r][c];

		// either marked south or east

		// marked south
		long south = 0;
		if (((1 << c) & currRow) != 0)
			south = f(currRow, newRow, r, c + 1);
		else
		{
			// drop south if can
			if (r != R - 1)
				south += rem(r, c) + f(currRow, newRow | (1 << c), r, c + 1);

			// drop east
			else if (c != C - 1 && (((1 << (c + 1)) & currRow) == 0))

				south += rem(r, c) + f(currRow | (1 << (c + 1)), newRow, r, c + 1);

			else
				south += f(currRow, newRow, r, c + 1);

		}

		// marked east
		long east = 0;
		if (((1 << c) & currRow) != 0)
			east = f(currRow, newRow, r, c + 1);
		else
		{
			// drop east if can
			if (c != C - 1 && (((1 << (c + 1)) & currRow) == 0))
				east += rem(r, c) + f(currRow | (1 << (c + 1)), newRow, r, c + 1);

			// drop south
			else if (r != R - 1)
				east += rem(r, c) + f(currRow, newRow | (1 << c), r, c + 1);
			else
				east += f(currRow, newRow, r, c + 1);

		}

		return dp[currRow][newRow][r][c] = (south + east) % MOD;

	}

	private long rem(int r, int c)
	{
		// power of 2
		int totalCells = r * C + c + 1;
		int rem = R * C - totalCells;
		if (pows[rem] != -1)
			return pows[rem];

		BigInteger pow = new BigInteger(2 + "");
		BigInteger result = pow.pow(rem).mod(new BigInteger(MOD + ""));
		return pows[rem] = Long.parseLong(result.toString());
	}

	private String mask(int mask)
	{
		String str = "";
		for (int i = 0; i < C; i++)
			if (((1 << i) & mask) != 0)
				str += "1";
			else
				str += "0";
		return str;
	}

}
