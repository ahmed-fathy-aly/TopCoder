import java.util.Arrays;

public class CompositeSmash
{

	private int target;
	private int[] dp;

	public String thePossible(int N, int target)
	{
		this.target = target;
		dp = new int[N + 1];
		Arrays.fill(dp, -1);
		return f(N) ? "Yes": "No";
	}

	private boolean f(int x)
	{
		if (x == target)
			return true;
		if (dp[x] != -1)
			return dp[x] == 1;
		
		boolean oneCan = false;
		boolean oneFailed = false;
		for (int i = 2; i*i <= x; i++) 
			if (x % i == 0)
			{
				int other = x / i;
				boolean can = f(other) | f(i);
				oneCan |= can;
				oneFailed |= !can;
			}
		
		dp[x] = (oneCan && !oneFailed) ? 1 : 0;
		return oneCan && !oneFailed;
			
	}

}
