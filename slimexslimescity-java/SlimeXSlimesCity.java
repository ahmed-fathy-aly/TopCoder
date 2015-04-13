import java.util.Arrays;
import java.util.HashSet;

public class SlimeXSlimesCity
{

	public int merge(int[] population)
	{
		// accumulate count
		Arrays.sort(population);
		int n = population.length;
		long acc[] = new long[n];
		acc[0] = population[0];
		for (int i = 1; i < n; i++) 
			acc[i] = acc[i-1] + population[i];
		
		// see which has sum greater than next
		int count = 0;
		for (int i = 0; i < n; i++) 
			{
				boolean can = true;
				long curr = acc[i];
				for (int j = i+1; j < n; j++) 
				{
					if (population[j] > curr)
						can = false;
					else
						curr += population[j];
				}
				if (can)
					count++;
			}
		return count;
	}

}
