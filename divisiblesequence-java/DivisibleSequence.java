import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class DivisibleSequence
{

	private ArrayList<Integer> divisors;
	private long mod = 1000000009l;
	private int length;

	public int count(int N, int H)
	{
		// factorize the number
		HashMap<Integer, Integer> factors = new HashMap<>();
		int x = N;
		this.length = H;
		for (int i = 2; i * i <= N; i++)
			while (x % i == 0)
			{
				x /= i;
				if (factors.containsKey(i))
					factors.put(i, factors.get(i) + 1);
				else
					factors.put(i, 1);
			}
		if (x != 1)
			factors.put(x, 1);

		// add count of each factor
		long count = 1;
		for (Integer i : factors.values())
			count = (count * (f(i) % mod)) % mod;

		return (int) count;

	}

	private long f(Integer x)
	{
		return nCr(length - 1 + x, x);
	}

	long modDivision(long p, long q)
	{
		return (p * modInverse(q)) % mod;
	}

	long nCr(long n, int k)
	{
		if (k > n)
		{
			return 0;
		}
		long p = 1, q = 1;
		for (int i = 1; i <= k; i++)
		{
			q = (q * i) % mod;
			p = (p * (n - i + 1)) % mod;
		}
		return modDivision(p, q);
	}

	long modInverse(long x)
	{
		return powMod(x, mod - 2);
	}

	private long powMod(long x, long y)
	{
		// base case
		if (y == 0)
			return 1;

		long ans = powMod(x, y / 2);
		ans = (ans * ans) % mod;
		if (y % 2 == 1)
			ans = (ans * x) % mod;

		return ans;
	}

}
