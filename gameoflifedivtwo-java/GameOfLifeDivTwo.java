public class GameOfLifeDivTwo
{

	public String theSimulation(String init, int T)
	{
		// make params
		int n = init.length();
		boolean b[] = new boolean[n];
		for (int i = 0; i < n; i++)
			if (init.charAt(i) == '1')
				b[i] = true;

		// simulate
		for (int t = 1; t <= T; t++)
		{
			StringBuilder strb = new StringBuilder();
			for (int i = 0; i < n; i++)
				if (b[i])
					strb.append("1");
				else
					strb.append("0");
			boolean bNew[] = new boolean[n];
			for (int i = 0; i < n; i++)
			{
				int count = 0;
				for (int j = i - 1; j <= i + 1; j++)
				{
					int x = j;
					if (j >= n)
						x -= n;
					if (j < 0)
						x += n;
					if (b[x])
						count++;
				}
				if (count >= 2)
					bNew[i] = true;
				else
					bNew[i] = false;
			}
			for (int i = 0; i < n; i++)
				b[i] = bNew[i];
		}

		// convert to string
		StringBuilder strb = new StringBuilder();
		for (int i = 0; i < n; i++)
			if (b[i])
				strb.append("1");
			else
				strb.append("0");
		return strb.toString();
	}

}
