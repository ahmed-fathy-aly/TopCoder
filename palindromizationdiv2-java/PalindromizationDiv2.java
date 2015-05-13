public class PalindromizationDiv2
{

	public int getMinimumCost(int X)
	{
		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= X*2; i++) 
			if (isPalindrome(i))
				min = Math.min(min, Math.abs(X - i));
		return min;
	}

	private boolean isPalindrome(int i)
	{
		StringBuilder strb = new StringBuilder("" + i);
		return strb.reverse().toString().equals("" + i);
	}

}
