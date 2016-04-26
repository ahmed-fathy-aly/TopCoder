public class TheKingsArmyDiv2
{

	public int getNumber(String[] state)
	{
		// zero
		int R = state.length;
		int C = state[0].length();
		for (int r = 0; r < R; r++) 
			for (int c = 0; c < C-1; c++) 
				if (state[r].charAt(c) == 'H' && state[r].charAt(c+1) == 'H')
					return 0;
		for (int r = 0; r < R-1; r++) 
			for (int c = 0; c < C; c++) 
				if (state[r].charAt(c) == 'H' && state[r+1].charAt(c) == 'H')
					return 0;
		
		// one
		for (int r = 0; r < R; r++) 
			for (int c = 0; c < C; c++) 
				if (state[r].charAt(c) == 'H')
					return 1;
		
		return 2;
	}

}
