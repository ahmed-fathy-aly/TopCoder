public class MathContest
{

	public int countBlack(String ballSequence, int repetitions)
	{
		// make balls
		boolean arr[] = new boolean[ballSequence.length() * repetitions];
		for (int i = 0; i < arr.length; i++)
			arr[i] = ballSequence.charAt(i % ballSequence.length()) == 'W';

		// keep getting them out
		int count = 0;
		int l = 0;
		int r = arr.length - 1;
		boolean invert = false;
		boolean left = true;
		while (l <= r)
		{
			// take the ball
			boolean ball = left ? arr[l] : arr[r];
			if (left)
				l++;
			else
				r--;

			// see what to do
			boolean color = invert ? !ball : ball;
			if (color)
			{
				left = !left;
			} else
			{
				count++;
				invert = !invert;
			}
		}
		return count;
	}

}
