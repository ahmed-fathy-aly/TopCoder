public class ElectronicPetEasy
{

	public String isDifficult(int st1, int p1, int t1, int st2, int p2, int t2)
	{
		// first pet
		boolean arr[] = new boolean[1100000];
		int curr = st1;
		for (int i = 0; i < t1; i++) 
		{
			arr[curr] = true;
			curr += p1;
		}
		
		// second pet
		curr = st2;
		for (int i = 0; i < t2; i++) 
		{
			if (arr[curr])
				return "Difficult";
			curr += p2;
		}
			
			
		return "Easy";
	}

}
