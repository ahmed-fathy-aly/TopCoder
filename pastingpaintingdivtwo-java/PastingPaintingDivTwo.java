public class PastingPaintingDivTwo
{

	public long countColors(String[] clipboard, int T)
	{
		// make the board
		int R = clipboard.length;
		int C = clipboard[0].length();
		boolean g[][] = new boolean[clipboard.length][clipboard[0].length()];
		for (int r = 0; r < clipboard.length; r++)
			for (int c = 0; c < clipboard[r].length(); c++)
				if (clipboard[r].charAt(c) == 'B')
					g[r][c] = true;

		// sum count from each point
		long count = 0;
		for (int r = 0; r < R; r++)
			for (int c = 0; c < C; c++)
				if (g[r][c])
			{
				long itsCount = 1;
				boolean blocked = false;
				int currR = r + 1;
				int currC = c + 1;
				int rem = T-1;
				while (currR < R && currC < C && rem > 0)
				{
					if (g[currR][currC])
					{
						blocked = true;
						break;
					} else
					{
						itsCount++;
						currR++;
						currC++;
						rem--;
					}
				}
				
				if (blocked)
					count += itsCount;
				else
					count += T;
			}

		return count;
	}

}
