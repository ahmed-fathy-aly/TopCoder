import java.util.HashSet;

public class NetworkXOneTimePad
{

	private String[] plainTexts;
	private String[] cihpers;

	public int crack(String[] plaintexts, String[] ciphertexts)
	{
		HashSet<String> s = new HashSet<>();
		for (String in : plaintexts)
			for (String out : ciphertexts)
				s.add(key(in, out));

		this.plainTexts = plaintexts;
		this.cihpers = ciphertexts;

		int count = 0;
		for (String key : s)
			if (validKey(key))
				count++;
		return count;
	}

	private boolean validKey(String key)
	{
		for (String string : cihpers)
		{
			boolean can = false;
			for (String in : plainTexts)
				can |= encrypt(key, in).equals(string);
			if (!can)
				return false;
		}
		return true;
	}

	private String encrypt(String key, String in)
	{
		StringBuilder strb = new StringBuilder();
		for (int i = 0; i < key.length(); i++)
			if (key.charAt(i) == '0')
				strb.append(in.charAt(i));
			else
				strb.append(inverse(in.charAt(i)));
		return strb.toString();
	}

	private char inverse(char c)
	{
		return c == '0' ? '1' : '0';
	}

	private String key(String in, String out)
	{
		StringBuilder strb = new StringBuilder();
		for (int i = 0; i < in.length(); i++)
			if (in.charAt(i) == out.charAt(i))
				strb.append("0");
			else
				strb.append("1");
		return strb.toString();
	}

}
