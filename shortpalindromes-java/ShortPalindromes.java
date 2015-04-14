public class ShortPalindromes
{

	private int n;
	private char[] arr;
	private int[][] dp;

	public String shortest(String base)
	{
		// clear dp
		n = base.length();
		arr = base.toCharArray();
		dp = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				dp[i][j] = -1;

		// build string
		StringBuilder left = new StringBuilder();
		StringBuilder right = new StringBuilder();
		int l = 0;
		int r = n - 1;
		while (l <= r)
		{
			// same letter
			if (arr[l] == arr[r])
			{
				left.append(arr[l]);
				if (l != r)
				{
					right.append(arr[r]);
					r--;
				}
				l++;
			} 
			// choose one of them
			else
			{
				if (f(l, r - 1) < f(l + 1, r) || (f(l, r - 1) == f(l + 1, r) && arr[r] < arr[l]))
				{
					left.append(arr[r]);
					right.append(arr[r]);
					r--;
				} else
				{
					left.append(arr[l]);
					right.append(arr[l]);
					l++;
				}
			}
		}

		return left.toString() + right.reverse().toString();
	}

	private int f(int l, int r)
	{
		// base case
		if (r - l < 1)
			return 0;
		if (dp[l][r] != -1)
			return dp[l][r];

		// find min
		int ans = 0;
		if (arr[l] == arr[r])
			ans = f(l + 1, r - 1);
		else
			ans = 1 + Math.min(f(l + 1, r), f(l, r - 1));

		// store
		dp[l][r] = ans;
		return ans;
	}

}
