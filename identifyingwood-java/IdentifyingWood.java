public class IdentifyingWood
{

	public String check(String s, String t)
	{
		// search for every character in t
		int sIndex = 0;
		for (int i = 0; i < t.length(); i++)
		{

			// find that char
			char c = t.charAt(i);
			boolean found = false;
			while (sIndex < s.length())
			{
				if (s.charAt(sIndex) == c)
					found = true;
				sIndex++;
				if (found)
					break;
			}

			// not found
			if (found == false)
				return "Nope.";
		}

		return "Yep, it's wood.";
	}

}
