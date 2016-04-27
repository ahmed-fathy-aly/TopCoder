import java.util.Arrays;

public class SubstitutionCipher
{

	public String decode(String a, String b, String y)
	{
		// create the map
		int m[] = new int[26];
		Arrays.fill(m, -1);
		for (int i = 0; i < a.length(); i++)
		{
			int c1 = a.charAt(i) - 'A';
			int c2 = b.charAt(i) - 'A';
			m[c2] = c1;
		}

		// if there's only one character not mapped then map it
		int countNonMapped = 0;
		int remNonMapped = -1;
		for (int i = 0; i < 26; i++)
			if (m[i] == -1)
			{
				countNonMapped++;
				remNonMapped = i;
			}
		if (countNonMapped == 1)
			for (int i = 0; i < 26; i++)
			{
				boolean found = false;
				for (int j = 0; j < 26; j++)
					if (m[j] == i)
						found = true;
				if (!found)
					m[remNonMapped] = i;
			}

		// decipher
		StringBuilder strb = new StringBuilder();
		for (int i = 0; i < y.length(); i++) 
		{
			int  c= y.charAt(i) - 'A';
			if (m[c] == -1) 
				return "";
			char from = (char) ('A' + m[c]);
			strb.append(from);
		}
				
			
		return strb.toString();
	}

}
