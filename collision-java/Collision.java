public class Collision
{

	public double probability(int[] assignments, int ids)
	{
		// no one have memory
		int sum = 0;
		for (int i : assignments)
			sum += i;
		double pNoMemmory = p(sum, ids);

		// each has its own memory
		double pMemory = 1;
		int sumIds = 0;
		for (int i = 0; i < assignments.length - 1; i++)
		{
			pMemory *= p2(assignments[i], assignments[i + 1], ids, sumIds);
			sumIds += assignments[i];
		}

		return Math.abs(pMemory - pNoMemmory);
	}

	private double p2(int n1, int n2, int total, int sum)
	{
		if (total < n1 + n2)
			return 0;

		// say n1 take the first 20 numbers
		double p = 1;
		int num = total - n1 - sum;
		int den = total;
		for (int i = 0; i < n2; i++)
		{
			p *= 1.0 * num / den;
			num--;
			den--;
		}
		return p;
	}

	private double p(int n, int total)
	{
		int num = total;
		int den = total;
		double p = 1;
		for (int i = 0; i < n - 1; i++)
		{
			num--;
			p *= 1.0 * num / den;
		}

		return p;
	}

}
