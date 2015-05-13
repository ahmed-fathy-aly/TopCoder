import java.util.ArrayList;
import java.util.Arrays;

public class DivideAndShift
{

	private ArrayList<Integer> primes;

	public int getLeast(int N, int M)
	{
		for (int i = 0; i < 30; i++)
			System.out.println(i + ": " + nFactors(i));

		// try all divisions
		int idx = M - 1;
		int n = N;
		int min = Integer.MAX_VALUE;
		for (int x = 1; x <= N; x++)
			if (n % x == 0)
			{
				// see the number of prime factors
				int factors = nFactors(x);

				// add the distance afterwards
				int newSize = n / x;
				int newIdx = idx % newSize;
				int cost = factors + Math.min(newIdx, newSize - newIdx);
				min = Math.min(min, cost);
			}
		return min;

	}

	private int nFactors(int x)
	{
		int count = 0;
		for (int i = 2; i <= x; i++)
		{
			while (x % i == 0)
			{
				count++;
				x /= i;
			}
		}
		return count;
	}

}
