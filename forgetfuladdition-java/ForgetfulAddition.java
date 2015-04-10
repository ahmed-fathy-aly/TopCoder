public class ForgetfulAddition
{

	public int minNumber(String expression)
	{
		int min = Integer.MAX_VALUE;
		for (int firstStringLength = 1; firstStringLength < expression.length(); firstStringLength++) 
		{
			String first = expression.substring(0, firstStringLength);
			String second = expression.substring(firstStringLength);
			min = Math.min(min, Integer.parseInt(first) + Integer.parseInt(second));
		}
		return min;
	}

}
