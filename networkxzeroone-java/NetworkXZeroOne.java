public class NetworkXZeroOne
{

	public String reconstruct(String message)
	{
		String str1 = "";
		String str2 = "";
		int n = message.length();
		for (int i = 0; i < n; i++) 
			if (i % 2 == 0)
			{
				str1 += "x";
				str2 += "o";
			}
			else
			{
				str1 += "o";
				str2 += "x";
			}
		
		boolean valid1 = true;
		for (int i = 0; i < n; i++) 
			if (message.charAt(i) == '?' || message.charAt(i) == str1.charAt(i))
				continue;
			else
				valid1  = false;
		return valid1 ? str1 : str2;
			
	}

}
