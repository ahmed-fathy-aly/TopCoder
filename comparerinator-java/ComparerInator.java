public class ComparerInator
{

	public int makeProgram(int[] A, int[] B, int[] wanted)
	{
		// equals a
		boolean valid = true;
		for (int i = 0; i < wanted.length; i++)
			if (wanted[i] != A[i])
				valid = false;
		if (valid)
			return 1;

		// equals b
		valid = true;
		for (int i = 0; i < wanted.length; i++)
			if (wanted[i] != B[i])
				valid = false;
		if (valid)
			return 1;

		// min
		valid = true;
		for (int i = 0; i < wanted.length; i++)
			if (wanted[i] != Math.min(A[i], B[i]))
				valid = false;
		if (valid)
			return 7;

		// max
		valid = true;
		for (int i = 0; i < wanted.length; i++)
			if (wanted[i] != Math.max(A[i], B[i]))
				valid = false;
		if (valid)
			return 7;

		return -1;
	}

}
