import java.util.ArrayList;

public class ParenthesesDiv2Medium
{

	private int n;
	private String s;
	private int[][] dp;
	private boolean[][] shouldChange;

	public int[] correct(String s)
	{
		this.n = s.length();
		this.s = s;

		// clear dp
		dp = new int[n][n];
		shouldChange = new boolean[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				dp[i][j] = -1;
		int cost = f(0, 0);
		
		// find how many changed
		int openRight = 0;
		ArrayList<Integer> flips = new ArrayList<>();
		for (int index = 0; index < n; index++) 
		{
			int type = s.charAt(index) == '(' ? 1 : -1;
			if (shouldChange[index][openRight]) 
			{
				flips.add(index);
				openRight += -type;
			}	
			else
				openRight += type;
		}
			
System.out.println(flips);
		return toArray(flips);
	}

	private int f(int index, int openRight)
	{
		// base case
		if (openRight < 0)
			return 100000;
		if (index == n)
			return openRight == 0 ? 0 : 100000;
		if (dp[index][openRight] != -1)
			return dp[index][openRight];

		// leave
		int type = s.charAt(index) == '(' ? 1 : -1;
		int leave = f(index + 1, openRight + type);
		int change = 1 + f(index + 1, openRight - type);
		if (leave < change)
		{
			shouldChange[index][openRight] = false;
			return dp[index][openRight] = leave;
		} else
		{
			shouldChange[index][openRight] = true;
			return dp[index][openRight] = change;
		}

	}

	private int[] toArray(ArrayList<Integer> flips)
	{

		int result[] = new int[flips.size()];
		for (int i = 0; i < result.length; i++)
			result[i] = flips.get(i);
		return result;
	}

	private char flip(char c)
	{
		return (char) (c == ')' ? '(' : ')');
	}
}
