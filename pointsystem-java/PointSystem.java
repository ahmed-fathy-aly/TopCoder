public class PointSystem
{

	public double oddsOfWinning(int pointsToWin, int pointsToWinBy, int skill)
	{
		int n = 1000;
		double p[][] = new double[n + 1][n + 1];
		p[0][0] = 1.0;
		double firstWinCount = 0;
		double secondWinCount = 0;
		for (int sum = 0; sum < n; sum++)
			for (int i = 0; i <= sum; i++)
			{
				int j = sum - i;

				// checkif winning position for i or j
				boolean iWins = i >= pointsToWin && (i - j) >= pointsToWinBy;
				boolean JWins = j >= pointsToWin && (j - i) >= pointsToWinBy;
				if (iWins)
					firstWinCount += p[i][j];
				else if (JWins)
					secondWinCount += p[i][j];
				else
				{
					p[i + 1][j] += p[i][j] * skill / 100.0;
					p[i][j + 1] += p[i][j] * (100 - skill) / 100.0;
				}
			}

		return firstWinCount / (firstWinCount + secondWinCount);
	}
}
