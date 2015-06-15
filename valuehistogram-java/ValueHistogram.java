import java.util.ArrayList;
import java.util.Collections;

public class ValueHistogram
{

	public String[] build(int[] values)
	{
		// buld histogram
		int[] hist = new int[10];
		for (int x : values)
			hist[x]++;
		int max = 0;
		for (int x : hist)
			max = Math.max(max, x);

		// build result
		boolean g[][] = new boolean[max + 1][10];
		for (int r = 0; r < max + 1; r++)
			for (int c = 0; c < 10; c++)
				if (hist[c] > r)
					g[r][c] = true;

		// make string
		ArrayList<String> result = new ArrayList<>();
		for (int r = 0; r < max + 1; r++)
		{
			String str = "";
			for (int c = 0; c < 10; c++)
				if (g[r][c])
					str += "X";
				else
					str += ".";
			result.add(str);
		}

		Collections.reverse(result);
		String strs[] = new String[result.size()];
		for (int i = 0; i < result.size(); i++)
			strs[i] = result.get(i);

		return strs;
	}

}
