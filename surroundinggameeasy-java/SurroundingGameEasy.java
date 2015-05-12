public class SurroundingGameEasy
{
	int dx[] = new int[]
	{ 1, -1, 0, 0 };
	int dy[] = new int[]
	{ 0, 0, 1, -1};

	public int score(String[] cost, String[] benefit, String[] stone)
	{
		// calculate cost
		int sumCost = 0;
		for (int r = 0; r < cost.length; r++)
			for (int c = 0; c < cost[0].length(); c++)
				if (stone[r].charAt(c) == 'o')
					sumCost += Integer.parseInt(cost[r].charAt(c) + "");

		// calculate benefit
		int sumBenefit = 0;
		for (int r = 0; r < cost.length; r++)
			for (int c = 0; c < cost[0].length(); c++)
			{
				boolean dom = true;
				for (int i = 0; i < dx.length; i++)
				{
					int r2 = r + dx[i];
					int c2 = c + dy[i];
					if (r2 >= 0 && r2 < cost.length && c2 >= 0 && c2 < cost[0].length())
						if (stone[r2].charAt(c2) != 'o')
							dom = false;
				}
				if (dom || stone[r].charAt(c) == 'o')
					sumBenefit += Integer.parseInt(benefit[r].charAt(c) + "");

			}

		System.out.println(sumBenefit + "-" + sumCost);
		return sumBenefit - sumCost;
	}

}
