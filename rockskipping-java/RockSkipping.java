public class RockSkipping
{

	public double probability(String pads, int maxDist)
	{
		// find probability at each skip
		double p[][] = new double[maxDist+1][pads.length()];
		p[0][0] = 100;
		for (int i = 0; i < maxDist; i++) 
		{
			int maxNow = maxDist - i;
			for (int j = 0; j < pads.length(); j++) 
				if (pads.charAt((j % pads.length())) == '.')
					for (int k = 1; k <= maxNow; k++) 
						p[i+1][(j + k) % pads.length()] += p[i][j] / maxNow;
		}
		
		// sum 
		double sum = 0;
		for (int i = 0; i < pads.length(); i++) 
			if (pads.charAt((i % pads.length())) == '.')
					sum += p[maxDist][i];
		return sum;
	}

}
