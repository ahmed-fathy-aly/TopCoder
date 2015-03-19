public class NamingConvention
{

	public String toCamelCase(String variableName)
	{
		
		StringBuilder ans = new StringBuilder();
		ans.append(variableName.charAt(0));
		for (int i = 1; i < variableName.length(); i++) 
			if (variableName.charAt(i) == '_')
				continue;
			else if (variableName.charAt(i-1) == '_')
				ans.append(("" + variableName.charAt(i)).toUpperCase());
			else
				ans.append(variableName.charAt(i));
			
		return ans.toString().trim();
	}

}
