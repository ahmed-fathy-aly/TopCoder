public class CandyShop
{

	public int countProbablePlaces(int[] X, int[] Y, int[] R)
	{
		int count = 0;
		for (int x = -200; x <= 200; x++)
			for (int y = -200; y <= 200; y++)
			{
				boolean valid = true;
				for (int i = 0; i < X.length; i++)
				{
					double dx = Math.abs(x - X[i]);
					double dy = Math.abs(y - Y[i]);
					double dist = dx + dy;
					if (dist  > R[i])
						valid = false;
				}
				if (valid)
					count++;

			}

		return count;
	}

}
