public class TheAlmostLuckyNumbersDivTwo
{

	public int find(int a, int b)
	{
		int count = 0;
		for (int i = a; i <= b; i++)
			if (almostUnlucky(i))
				count++;

		for (int i = 0; i < 20; i++)
			System.out.println(i + " " + almostUnlucky(i));
		System.out.println();
		return count;
	}

	private boolean almostUnlucky(int i)
	{
		String str = i + "";
		int diff = 0;
		for (int j = 0; j < str.length(); j++)
		{
			int x = Integer.parseInt(str.charAt(j) + "");
			if (!(x == 4 || x == 7))
				diff++;
		}
		return diff <= 1;
	}

}
