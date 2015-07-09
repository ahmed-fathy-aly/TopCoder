public class MonochromaticBoard
{

	public int theMin(String[] board)
	{
		// paint rows
		int rows = 0;
		int R = board.length;
		int C = board[0].length();
		for (int r = 0; r < R; r++)
		{
			boolean can = true;
			for (int c = 0; c < C; c++)
				if (board[r].charAt(c) == 'W')
					can = false;
			if (can)
				rows++;
		}

		int cols = 0;

		for (int c = 0; c < C; c++)
		{
			boolean can = true;
			for (int r = 0; r < R; r++)
				if (board[r].charAt(c) == 'W')
					can = false;
			if (can)
				cols++;
		}

		if (cols == C && rows == R)
			return Math.min(cols, rows);
		else
			return rows + cols;
	}

}
