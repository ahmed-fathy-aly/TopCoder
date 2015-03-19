import java.util.ArrayList;

public class NarrowPassage2Easy
{

	private int maxSize;
	private ArrayList<ArrayList<Integer>> allPermutations;
	private int n;

	public int count(int[] size, int maxSizeSum)
	{
		// params
		maxSize = maxSizeSum;
		allPermutations = new ArrayList<ArrayList<Integer>>();
		n = size.length;

		// add all permutations
		ArrayList<Integer> list = new ArrayList<>();
		for (Integer x : size)
			list.add(x);
		addPermutations(new ArrayList<Integer>(), list);
		System.out.println(allPermutations);
		return allPermutations.size();
	}

	private void addPermutations(ArrayList<Integer> curr, ArrayList<Integer> rem)
	{
		// base case
		if (rem.size() == 0)
		{
			allPermutations.add(curr);
			return;
		}

		// add any one here
		for (int i = 0; i < rem.size(); i++)
			if (canPutFirst(i, rem))
			{
				// make new lists
				ArrayList<Integer> newCurr = new ArrayList<>(curr);
				newCurr.add(rem.get(i));
				ArrayList<Integer> newRem = new ArrayList<>();
				for (int j = 0; j < rem.size(); j++) 
					if (i != j)
						newRem.add(rem.get(j));
				
				// recruse
				addPermutations(newCurr, newRem);
			}

	}

	private boolean canPutFirst(int i, ArrayList<Integer> rem)
	{
		int curr = i;
		int item = rem.get(curr);
		while (curr != 0)
		{
			int prev = rem.get(curr - 1);
			if (prev + item> maxSize)
				return false;
			else
				curr--;
		}
		return true;
	}

}
