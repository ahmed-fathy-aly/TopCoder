public class MonstersValley2
{

	private int n;
	private int[] scare;
	private int[] price;
	private int min;

	public int minimumPrice(int[] dread, int[] price)
	{
		n = price.length;
		this.scare = dread;
		this.price = price;
		min = Integer.MAX_VALUE;
		f(0, 0, 0);
		return min;
	}

	private void f(int i, int p, long s)
	{
		// base case
		if (i == n)
		{
			min = Math.min(min, p);
			return;
		}

		// bribe him
		f(i + 1, p + price[i], s + scare[i]);

		// just pass
		if (s >= scare[i])
			f(i + 1, p, s);
	}

}
