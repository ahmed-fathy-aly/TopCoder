public class FoxAndHandleEasy
{

	public String isPossible(String S, String T)
	{
		for (int i = 0; i < S.length(); i++) 
		{
			String newStr = S.substring(0, i) + S + S.substring(i);
			System.out.println(newStr);
			if (newStr.equals(T))
				return "Yes";
		}
			
		return "No";
	}

}
