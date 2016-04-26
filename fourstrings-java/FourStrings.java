public class FourStrings
{

	public int shortestLength(String a, String b, String c, String d)
	{
		// try all orders
		int min = Integer.MAX_VALUE;
		String strs[] = new String[]
		{ a, b, c, d };
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				for (int k = 0; k < 4; k++)
					for (int l = 0; l < 4; l++)
						if (i != j && i != k && i != l && j != k && j != l && k != l) 
						min = Math.min(min, len(strs[i], strs[j], strs[k], strs[l]));
		return min;
	}

	private int len(String a, String b, String c, String d)
	{
		// keep appeding
		String str = a + "";
		str += eliminate(str, b);
		str += eliminate(str, c);
		str += eliminate(str, d);
		return str.length();
	}
	

	private String eliminate(String a, String b)
	{
		// all of b in a
		if (a.contains(b))
			return "";

		// first bit of b in last of a
		for (int i = b.length(); i >= 1; i--)
			if (a.length() - i >= 0)
				if (a.substring(a.length() - i).equals(b.substring(0, i)))
					return b.substring(i);
		return b + "";
	}

}
