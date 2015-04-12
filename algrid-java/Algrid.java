public class Algrid
{

	public String[] makeProgram(String[] outputStr)
	{
		// convert to 2D arrays
		int R = outputStr.length;
		int C = outputStr[0].length();
		boolean[][] output = new boolean[R][C];
		for (int r = 0; r < R; r++)
			for (int c = 0; c < C; c++)
				output[r][c] = outputStr[r].charAt(c) == 'W';

		// copy the first
		boolean[][] input = new boolean[R][C];
		for (int i = 0; i < C; i++)
			input[0][i] = output[0][i];

		// try all next rows
		for (int r = 1; r < R; r++)
		{
			boolean[] inputRow = getInput(output[r - 1], C, output[r]);
			if (inputRow == null)
				return new String[]
				{};
			else
				input[r] = inputRow;
			
			// TODO
			System.out.println(r);
			StringBuilder strb = new StringBuilder();
			for (int j = 0; j < C; j++)
				if (inputRow[j])
					strb.append("W");
				else
					strb.append("B");				
			System.out.println(strb.toString());
		}

		// convert to string
		String[] result = new String[R];
		for (int i = 0; i < R; i++)
		{
			StringBuilder strb = new StringBuilder();
			for (int j = 0; j < C; j++)
				if (input[i][j])
					strb.append("W");
				else
					strb.append("B");
			result[i] = strb.toString();
		}

		return result;
	}

	private boolean[] getInput(boolean[] prev, int C, boolean[] output)
	{
		// try all masks
		boolean input[] = new boolean[C];
		for (int mask = 0; mask < (1 << C); mask++)
		{
			// fill the mask
			for (int i = 0; i < C; i++)
				if (((mask & (1 << i))) != 0)
					input[i] = true;
				else
					input[i] = false;
			
			// apply operations
			boolean thisOutput[] = new boolean[C];
			for (int i = 0; i < C; i++)
				thisOutput[i] = input[i];
			for (int c = 0; c < C - 1; c++)
			{
				boolean a = prev[c];
				boolean b = prev[c + 1];
				if (a && !b)
				{
					thisOutput[c] = true;
					thisOutput[c + 1] = true;

				} else if (!a && b)
				{
					thisOutput[c] = false;
					thisOutput[c + 1] = false;
				} else if (!a && !b)
				{
					boolean temp = thisOutput[c];
					thisOutput[c] = thisOutput[c + 1];
					thisOutput[c + 1] = temp;
				}
			}

			// test
			boolean good = true;
			for (int i = 0; i < C; i++)
				if (thisOutput[i] != output[i])
					good = false;
			if (good)
				return input;
		}
		return null;
	}

}
