import java.util.HashMap;
import java.util.HashSet;

public class TwoNumberGroupsEasy
{

	private HashSet<Integer> allDivisors;

	public int solve(int[] A, int[] numA, int[] B, int[] numB)
	{

		// get all divisors of numbers
		allDivisors = new HashSet<Integer>();
		allDivisors.add(2);
		for (int i = 0; i < A.length; i++)
			for (int j = 0; j < B.length; j++)
				addDivisors(Math.abs(A[i] - B[j]));

		// find distance for all modes
		int min = Integer.MAX_VALUE;
		for (int mod : allDivisors)
			if (mod >= 2)
			{
				// get a map of the mods
				HashMap<Integer, Integer> map = new HashMap<>();
				for (int i = 0; i < A.length; i++)
				{
					int x = A[i] % mod;
					if (map.containsKey(x))
						map.put(x, map.get(x) + numA[i]);
					else
						map.put(x, numA[i]);
				}
				for (int i = 0; i < B.length; i++)
				{
					int x = B[i] % mod;
					if (map.containsKey(x))
						map.put(x, map.get(x) - numB[i]);
					else
						map.put(x, -numB[i]);
				}

				// find distance
				int distance = 0;
				for (Integer key : map.keySet())
					distance += Math.abs(map.get(key));
				min = Math.min(min, distance);

			}

		return min;
	}

	private void addDivisors(int x)
	{
		allDivisors.add(x);
		for (int i = 2; i * i <= x; i++)
			if (x % i == 0)
			{
				allDivisors.add(i);
				allDivisors.add(x / i);
			}

	}
}
