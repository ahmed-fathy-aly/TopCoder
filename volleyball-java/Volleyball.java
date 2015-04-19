public class Volleyball
{

	private int n;
	private double serverWin;
	private double[][] p;

	public double win(int sScore, int rScore, double probWinServe)
	{
		// make dp
		n = 1500;
		serverWin = probWinServe;
		p = new double[n + 1][n + 1];
		for (int i = 0; i <= n; i++)
			for (int j = 0; j <= n; j++)
				p[i][j] = -1;

		return f(sScore, rScore);
	}

	private double f(int sScore, int rScore)
	{
		// base case
		if (sScore > n || rScore > n)
			return 0.5;
		if (sScore >= 15 && (sScore - rScore) >= 2)
			return 1;
		else if (rScore >= 15 && (rScore - sScore) >= 2)
			return 0;
		if (p[sScore][rScore] != -1)
			return p[sScore][rScore];

		// either win this server or lose it
		double ret = 0;
		ret += serverWin * f(sScore+1, rScore);
		ret += (1-serverWin) * (1- f(rScore+1, sScore));
		
		p[sScore][rScore] = ret;
		return ret;
	}
}
