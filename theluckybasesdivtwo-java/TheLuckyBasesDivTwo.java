import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;

public class TheLuckyBasesDivTwo
{
	boolean four = false;
	boolean seven = true;
	private long n;

	public long find(long n)
	{
		if (n == 4 || n == 7)
			return -1;
		this.n = n;

		// try if the base has length 2
		HashSet<Long> bases = new HashSet<>();
		for (int i = 4; i <= 7; i += 3)
			for (int j = 4; j <= 7; j += 3)
			{
				long base = getBase(i, j);
				if (base != -1)
					bases.add(base);
			}

		// try all bases from 2 t osqrt the number
		for (long base = 2; base <= 1000000l; base++)
			if (validBases(base))
				bases.add(base);

		return bases.size();
	}

	private boolean validBases(long base)
	{
		long x = n;
		while (x > 0)
		{
			long rem = x % base;
			if (rem != 4 && rem != 7)
				return false;
			x /= base;
		}
		return true;
	}

	private long getBase(int a, int b)
	{
		// solve a + b*base = n
		long right = n - a;
		if (right % b != 0)
			return -1;
		long base = right / b;
		if (base <= a || base <= b)
			return -1;
		return base;
	}

}
