import java.util.HashSet;

public class SetPartialOrder
{

	public String compareSets(int[] a, int[] b)
	{
		HashSet<Integer> aSet = new HashSet<>();
		for (Integer x : a)
			aSet.add(x);
		HashSet<Integer> bSet = new HashSet<>();
		for (Integer x : b)
			bSet.add(x);

		boolean aInB = true;
		for (int x : a)
			if (!bSet.contains(x))
				aInB = false;
		boolean bInA = true;
		for (int x : b)
			if (!aSet.contains(x))
				bInA = false;

		if (aInB && bInA) 
			return "EQUAL";
		else if (aInB)
			return "LESS";
		else if (bInA)
			return "GREATER";
		else 
			return "INCOMPARABLE";
	}

}
