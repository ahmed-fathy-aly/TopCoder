import java.util.Arrays;

public class DiceThrows
{

	public double winProbability(int numDiceA, int[] sidesA, int numDiceB, int[] sidesB)
	{
		// find probability of each number for player
		Arrays.sort(sidesA);
		Arrays.sort(sidesB);
		int n = Math.max(numDiceA * sidesA[5], numDiceB * sidesB[5]);

		// first player
		double g1[][] = new double[2][n + 1];
		for (int x : sidesA)
			g1[0][x] += 1.0 / 6;
		for (int i = 0; i < numDiceA - 1; i++)
		{
			Arrays.fill(g1[(i+1) %2], 0);
			for (int x = 0; x <= n; x++)
				if (g1[i % 2][x] > 0)
					for (int side : sidesA)
						g1[(i + 1) % 2][x + side] += g1[i % 2][x] / 6;
		}

		// second player
		double g2[][] = new double[2][n + 1];
		for (int x : sidesB)
			g2[0][x] += 1.0 / 6;
		for (int i = 0; i < numDiceB - 1; i++)
		{
			Arrays.fill(g2[(i+1) %2], 0);
			for (int x = 0; x <= n; x++)
				if (g2[i % 2][x] > 0)
					for (int side : sidesB)
						g2[(i + 1) % 2][x + side] += g2[i % 2][x] / 6;
		}

		// calculate probability of p1's win
		double sum = 0;
		for (int x = 0; x <= n; x++)
			for (int x2 = 0; x2 < x; x2++)
				sum += g1[(numDiceA - 1) % 2][x] * g2[(numDiceB - 1) % 2][x2];
		return sum;
	}

}
