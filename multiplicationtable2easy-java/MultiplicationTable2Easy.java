public class MultiplicationTable2Easy
{

	public String isGoodSet(int[] table, int[] t)
	{
		int n = (int) Math.sqrt(table.length);
		
		for (int i = 0; i < t.length; i++) 
			for (int j = 0; j < t.length; j++) 
				{
					int x = table[t[i]*n + t[j]];
					if (!contains(x, t)) 
						return "Not Good";
				}
					
				
			
		return "Good";
	}

	private boolean contains(int x, int[] t)
	{
		for(int y : t)
			if (x == y) 
				return true;
		return false;
				
			
	}

}
