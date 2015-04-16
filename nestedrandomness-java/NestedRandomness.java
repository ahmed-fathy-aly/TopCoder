public class NestedRandomness
{

	public double probability(int N, int nestings, int target)
	{
		double result[][] = new double[nestings][N];
		for (int i = 0; i < N; i++)
			result[0][i] = 1.0 / N;
		for (int i = 1; i < nestings; i++)
			for (int j = 0; j < N; j++)
			{
				int itsN = j;
				for (int k = 0; k < j; k++)
					result[i][k] += result[i - 1][j] / itsN;
			}

		return result[nestings - 1][target];
	}

}
