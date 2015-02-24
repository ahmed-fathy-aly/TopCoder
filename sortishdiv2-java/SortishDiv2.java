import java.util.HashSet;

public class SortishDiv2
{

	private int n;
	private int reqSort;
	private int[] arr;
	private HashSet<Integer> rem;

	public int ways(int sortedness, int[] seq)
	{
		// find which numbers are remaining
		n = seq.length;
		reqSort = sortedness;
		arr = seq;
		rem = new HashSet<>();
		for (int i = 1; i <= n; i++)
			rem.add(i);
		for (Integer x : seq)
			if (x != 0)
				rem.remove(x);

		return f(0, 0);
	}

	private int f(int idx, int currSort)
	{
		// base case
		if (idx == n)
			if (currSort == reqSort)
				return 1;
			else
				return 0;

		if (arr[idx] != 0)
		{
			// number is given
			int newSort = currSort;
			for (int i = 0; i < idx; i++)
				if (arr[idx] > arr[i])
					newSort++;
			return f(idx + 1, newSort);
		} 
		else
		{
			// back track all possible
			int ans = 0;
			HashSet<Integer> poss = new HashSet<>(rem);
			for (Integer x : poss)
			{
				// remove
				rem.remove(x);
				arr[idx] = x;

				// count sort
				int newSort = currSort;
				for (int i = 0; i < idx; i++)
					if (arr[idx] > arr[i])
						newSort++;
				ans += f(idx + 1, newSort);

				// restore
				rem.add(x);
				arr[idx] = 0;

			}
			return ans;
		}
	}

}
