import java.util.Arrays;

public class Istr
{

	public int count(String s, int k)
	{
		int count[] = new int[26];
		for (int i = 0; i < s.length(); i++)
			count[s.charAt(i) - 'a']++;

		for (int i = 0; i < k; i++)
		{

			Arrays.sort(count);
			for (int j = count.length - 1; j >= 0; j--)
				if (count[j] > 0)
				{
					count[j]--;
					break;
				}
		}


		int sum = 0;
		for (int i = 0; i < count.length; i++)
			sum += count[i] * count[i];

		return sum;
	}

}
