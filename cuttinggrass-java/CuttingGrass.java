import java.util.Arrays;
import java.util.Comparator;

public class CuttingGrass
{

	private int n;
	private int H;
	private Item[] items;
	private int[][] dp;
	private int T;

	public int theMin(int[] init, int[] grow, int H)
	{
		// make items
		n = init.length;
		this.H = H;
		items = new Item[n];
		for (int i = 0; i < grow.length; i++)
			items[i] = new Item(init[i], grow[i]);

		// sort
		Arrays.sort(items, new Comparator<Item>()
		{
			@Override
			public int compare(Item o1, Item o2)
			{
				return Integer.compare(o1.grow, o2.grow);
			}
		});

		// try all times
		int minTime = Integer.MAX_VALUE;
		for (int t = 0; t <= n; t++)
			if (can(t))
				minTime = Math.min(minTime, t);
		return minTime == Integer.MAX_VALUE ? -1 : minTime;
	}

	private boolean can(int t)
	{
		// clear dp
		dp = new int[n][t + 1];
		for (int i = 0; i < n; i++)
			for (int j = 0; j <= t; j++)
				dp[i][j] = -1;
		
		this.T = t;
		return f(0, 0) <= H;
	}

	private int f(int idx, int t)
	{
		if (idx == n)
			return 0;
		if (dp[idx][t] != -1)
			return dp[idx][t];

		// dun cut this ont
		int min = Integer.MAX_VALUE;
		min = Math.min(min, f(idx + 1, t) + items[idx].init + items[idx].grow * T);

		// cut this one now
		if (t + 1 <= T)
			min = Math.min(min, f(idx + 1, t + 1) + items[idx].grow * (T - t - 1));

		return dp[idx][t] = min;
	}

}

class Item
{
	int init, grow;

	public Item(int init, int grow)
	{
		this.init = init;
		this.grow = grow;
	}
}