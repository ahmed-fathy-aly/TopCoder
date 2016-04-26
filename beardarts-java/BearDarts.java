import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BearDarts
{

	public long count(int[] w)
	{
		long count = 0;
		Map<Long, Integer> m = new HashMap<>();

		for (int b = 0; b < w.length; b++)
		{
			// add all b/a pairs
			for (int a = 0; a < b; a++)
			{
				long key = getKey(w[a], w[b]);
				if (m.containsKey(key))
					m.put(key, m.get(key) + 1);
				else
					m.put(key, 1);
			}

			// search for count of required values for c d pairs
			int c = b + 1;
			for (int d = c + 1; d < w.length; d++)
			{
				long key = getKey(w[d], w[c]);
				if (m.containsKey(key))
					count += m.get(key);
			}

		}

		return count;
	}

	private long getKey(int a, int b)
	{
		int g = gcd(a, b);
		a /= g;
		b /= g;
		return a + 1000000001l * b;
	}

	private int gcd(int a, int b)
	{
		if (a < b)
		{
			int temp = b;
			b = a;
			a = temp;
		}
		if (b == 0)
			return a;

		return gcd(b, a % b);
	}

}
