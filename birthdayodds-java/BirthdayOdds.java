public class BirthdayOdds
{

	public int minPeople(int minOdds, int daysInYear)
	{
		int nPeople = 1;
		int num = daysInYear;
		int den = daysInYear;
		double currP = 1;
		while (1 - currP < minOdds / 100.0)
		{
			nPeople++;
			num--;
			currP *= 1.0 * num / den;
		}
		return nPeople;
	}

}
