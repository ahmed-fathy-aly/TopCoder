public class BuyingTshirts
{

	public int meet(int T, int[] Q, int[] P)
	{
		int count = 0;
		
		int first = 0;
		int second = 0;
		for (int i = 0; i < P.length; i++) 
		{
			first += P[i];
			second += Q[i];
			if (first >= T & second >= T)
				count++;
			
			if (first >= T)
				first -= T;
			if (second >= T)
				second -=T;
		}
			
		
		return count;
	}

}
