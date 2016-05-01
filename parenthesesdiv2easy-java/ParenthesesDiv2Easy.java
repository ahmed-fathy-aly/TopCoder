public class ParenthesesDiv2Easy
{

	public int getDepth(String s)
	{
		int maxDepth = 0;
		int currDepth = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i) == '(') 
				currDepth ++;
			else
				currDepth--;
			maxDepth = Math.max(maxDepth, currDepth);
		}	
		return maxDepth;
	}

}
