import java.util.Arrays;

public class WaitingForBus
{

	private int n;
	private double[] dp;
	private int[] time;
	private int[] prob;

	public double whenWillBusArrive(int[] time, int[] prob, int s)
	{
		// clear dp
		n = time.length;
		this.time = time;
		this.prob = prob;
		int maxTime = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) 
			maxTime = Math.max(maxTime, time[i]);
		int dpLength = maxTime + s;
		dp = new double[dpLength + 1];
		Arrays.fill(dp, -1);
	
		// test
		dp[0] = 1;
		for (int i = 0; i <= s + maxTime; i++) 
			f(i);
		double expected = 0;
		for (int i = s; i <= s + maxTime; i++) 
		{
			double p = 0;
			for (int j = 0; j < n; j++) 
				if (0 <= i - time[j] && i - time[j] < s)
					p += dp[i - time[j]] * prob[j] / 100.0;
			expected += (i - s) * p;
		}
		
		for (int i = 0; i < 10; i++) 
			System.out.println(i + ":" + dp[i]);
			
		return expected ;
	}

	private double f(int t)
	{
		// base case
		if (t < 0)
			return 0;
		if (dp[t] != -1)
			return dp[t];
		if (t == 0)
			return 1;
		
		// count how mant ways
		double ans = 0;
		for (int i = 0; i < n; i++) 
			if (t - time[i] >= 0)
				ans += 1.0 * f(t - time[i]) * (prob[i] / 100.0);

		// save
		dp[t] = ans;
		return ans;
			
	}

}
