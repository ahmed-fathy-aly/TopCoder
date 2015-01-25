public class WinterAndCandies
{

	public int getNumber(int[] type)
	{
		// count elements
		int count[] = new int[51];
		for (int candyType : type) 
			count[candyType]++;
		
		// try all ks
		int ans = 0;
		for (int k = 1; k <= 50; k++) 
		{
			int sum = 1;
			for (int i = 1; i <= k; i++) 
				sum *= count[i];
			ans += sum;
		}
		return ans;
	}
}
