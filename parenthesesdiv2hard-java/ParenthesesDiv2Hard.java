import java.beans.Visibility;

import javax.print.StreamPrintService;

public class ParenthesesDiv2Hard
{

	private String s;
	private int n;
	private boolean[] isRight;
	private boolean[] isLeft;
	private int[][][][] dp;
	private int spareRight;
	private int spareLeft;
	private boolean[] visited;

	public int minSwaps(String s, int[] L, int[] R)
	{
		this.s = s;
		this.n = s.length();
		this.isRight = new boolean[n];
		this.isLeft = new boolean[n];

		// count spare ( and )
		visited = new boolean[s.length()];
		for (int k = 0; k < L.length; k++)
		{
			if ((R[k] - L[k]) % 2 != 1)
				return -1;

			isLeft[L[k]] = true;
			isRight[R[k]] = true;
			for (int i = L[k]; i <= R[k]; i++)
				visited[i] = true;
		}
		this.spareRight = 0;
		this.spareLeft = 0;
		for (int i = 0; i < n; i++)
			if (!visited[i])
				if (s.charAt(i) == '(')
					spareRight++;
				else
					spareLeft++;

		// clear dp
		dp = new int[n][n][n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				for (int j2 = 0; j2 < n; j2++)
					for (int k = 0; k < n; k++)
						dp[i][j][j2][k] = -1;

		// dp
		int answer = dp(0, 0, 0, 0);
		return answer > n * n ? -1 : answer;
	}

	private int dp(int index, int openRight, int changedR, int changedL)
	{

		// base case
		if (index == n)
		{
			// swap with each other
			int common = Math.min(changedR, changedL);
			changedR -= common;
			changedL -= common;
			if (changedR <= spareRight && changedL <= spareLeft)
				return common + changedR + changedL;
			else
				return 100000;
		}
		if (dp[index][openRight][changedR][changedL] != -1)
			return dp[index][openRight][changedR][changedL];

		int cost = 100000;

		if (!visited[index])
		{
			cost = Math.min(cost, dp(index+1, 0, changedR, changedL));
		
		} else
		{
			// leave it
			int newOpen = openRight + (s.charAt(index) == '(' ? 1 : -1);
			if (newOpen >= 0)
				if (!isRight[index] || newOpen == 0)
					cost = Math.min(cost, dp(index + 1, newOpen, changedR, changedL));

			// change it
			newOpen = openRight + (s.charAt(index) == ')' ? 1 : -1);
			int newChangedR = changedR + (s.charAt(index) == ')' ? 1 : 0);
			int newChangedL = changedL + (s.charAt(index) == '(' ? 1 : 0);
			if (newOpen >= 0)
				if (!isRight[index] || newOpen == 0)
					cost = Math.min(cost, dp(index + 1, newOpen, newChangedR, newChangedL));			
		}

		return dp[index][openRight][changedR][changedL] = cost;
	}

}
