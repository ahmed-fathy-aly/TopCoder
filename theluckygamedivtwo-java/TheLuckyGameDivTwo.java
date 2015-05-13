public class TheLuckyGameDivTwo
{

	private int a;
	private int b;
	private int jLen;
	private int bLen;
	private int[] acc;

	public int find(int a, int b, int jLen, int bLen)
	{
		// make variables
		this.a = a;
		this.b = b;
		this.jLen = jLen;
		this.bLen = bLen;

		// acc count of unlucky numbers
		acc = new int[b + 1];
		for (int i = 0; i <= b; i++)
			if (lucky(i))
				acc[i] = 1;
		for (int i = 1; i <= b; i++)
			acc[i] += acc[i - 1];

		// find max start
		int max = 0;
		for (int start = a; start + jLen - 1 <= b; start++)
			max = Math.max(max, f(start, start + jLen - 1));
		return max;

	}

	private int f(int l, int r)
	{
		// take min number of stuff
		int min = Integer.MAX_VALUE;
		for (int start = l; start + bLen - 1 <= r; start++)
			min = Math.min(min, countLucky(start, start + bLen - 1));
		return min;
	}

	private boolean lucky(int x)
	{
		String str = x + "";
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) != '4' && str.charAt(i) != '7')
				return false;
		return true;
	}

	private int countLucky(int l, int r)
	{
		int count = acc[r] - acc[l];
		if (lucky(l))
			count++;
		return count;
	}

}
