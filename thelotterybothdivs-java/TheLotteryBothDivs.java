import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TheLotteryBothDivs
{

	public double find(String[] goodSuffixes)
	{
		// add suffixes that are not included in others
		Arrays.sort(goodSuffixes, new Comparator<String>()
		{
			@Override
			public int compare(String o1, String o2)
			{
				return Integer.compare(o1.length(), o2.length());
			}
		});
		ArrayList<String> remSuffixes = new ArrayList<>();
		for (int i = 0; i < goodSuffixes.length; i++)
		{
			String str = goodSuffixes[i];
			boolean unique = true;
			for (String other : remSuffixes)
			{
				int idx1 = str.length() - 1;
				int idx2 = other.length() - 1;
				boolean same = true;
				while (idx1 >= 0 && idx2 >= 0)
				{
					if (other.charAt(idx2) != str.charAt(idx1))
						same = false;
					idx1--;
					idx2--;
				}
				if (same)
					unique = false;
			}
			if (unique)
				remSuffixes.add(str);
		}

		// calculate probability
		System.out.println(remSuffixes);
		double p = 0;
		for (String suffix : remSuffixes)
		{
			p += 1.0 / Math.pow(10, suffix.length());
		}
		return p;
	}

}
