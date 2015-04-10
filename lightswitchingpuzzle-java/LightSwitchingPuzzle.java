public class LightSwitchingPuzzle
{

	private int n;
	private boolean[] arr;

	public int minFlips(String state)
	{
		n = state.length();
		arr = new boolean[n+1];
		for (int i = 0; i < state.length(); i++) 
			arr[i+1] = state.charAt(i) == 'Y';
		return min();
	}

	private int min()
	{
		// try all switches
		int count = 0;
		for (int s = 1; s <= n; s++) 
			if (arr[s] == true)
			{
				count ++;
				for (int i = s; i <= n; i+= s) 
					arr[i] = !arr[i];
					
			}
		return count;
	}

}
