public class FlowerGarden
{

	private int[] h;
	private int[] start;
	private int[] end;
	private int n;
	private boolean[] taken;

	public int[] getOrdering(int[] height, int[] bloom, int[] wilt)
	{
		// variables
		h = height;
		start = bloom;
		end = wilt;
		n = h.length;
		taken = new boolean[n];
		int[] result = new int[n];
		
		// sort by taking the max that doesn't block or is shorter than the rest
		for (int i = 0; i < n; i++) 
		{
			int chosenIndex = -1;
			for (int j = 0; j < n; j++) 
				if (!taken[j])
					if (canTake(j))
						if (chosenIndex == -1 || (h[j] > h[chosenIndex]))
							chosenIndex = j;
					
			result[i] = h[chosenIndex];
			taken[chosenIndex] = true;
		}
			
		return result;
	}

	private boolean canTake(int idx)
	{
			for (int i = 0; i < n; i++) 
				if (!taken[i] && i != idx)
					if (block(idx, i))
						return false;
		return true;
	}

	private boolean block(int idx, int i)
	{
		// shorter
		if (h[idx] < h[i])
			return false;
		
		// earlier
		if (end[idx] < start[i])
			return false;
		
		// later
		if (start[idx] > end[i])
			return false;
		
		return true;
	}

}
