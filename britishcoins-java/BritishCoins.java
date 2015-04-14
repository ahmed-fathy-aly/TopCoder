public class BritishCoins
{

	public int[] coins(int pence)
	{
		int nPounds = pence / (20 * 12);
		pence = pence - nPounds*20*12;
		int nShill = pence / 12;
		pence = pence - nShill * 12;
		return new int[]{nPounds, nShill, pence};
	}

}
