import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class TheAlmostLuckyNumbersDivOne
{

	private long a;
	private long b;
	private long count = 0;

	public long find(long a, long b)
	{
		this.a = a;
		this.b = b;
		f(0, true);
		return count;
	}

	private void f(long x, boolean canAdd)
	{
		// base case
		if (x > b)
			return;
		if (x >= a && x <= b)
			count++;

		// try to add each digit
		for (int d = 1; d <= 9; d++)
			if (d == 4 || d == 7 || canAdd)
			{
				long newX = x * 10 + d;
				if (d != 4 && d != 7)
					f(newX, false);
				else
					f(newX, canAdd);
			}
		if (canAdd && x != 0)
			f(x * 10, false);
	}

}
