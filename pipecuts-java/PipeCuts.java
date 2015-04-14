import java.util.Arrays;

public class PipeCuts
{

	public double probability(int[] weldLocations, int L)
	{
		Arrays.sort(weldLocations);
		int okCount = 0;
		int totalCount = 0;
		for (int i = 0; i < weldLocations.length; i++)
			for (int j = i + 1; j < weldLocations.length; j++)
			{
				totalCount++;
				int length1 = weldLocations[i];
				int length2 = weldLocations[j] - weldLocations[i];
				int length3 = 100 - weldLocations[j];
				if (length1 > L || length2 > L || length3 > L)
					okCount++;
			}

		return 1.0 * okCount / totalCount;
	}

}
