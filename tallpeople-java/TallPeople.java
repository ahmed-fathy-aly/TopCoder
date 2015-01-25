import java.util.StringTokenizer;

public class TallPeople
{

	public int[] getPeople(String[] people)
	{
		// parse heights
		int n = people.length;
		int m = 0;
		int[] ans = new int[2];
		StringTokenizer tok = new StringTokenizer(people[0]);
		while (tok.hasMoreTokens())
		{
			m++;
			tok.nextToken();
		}
		int heights[][] = new int[n][m];
		for (int i = 0; i < n; i++)
		{
			tok = new StringTokenizer(people[i]);
			for (int j = 0; j < m; j++)
				heights[i][j] = Integer.parseInt(tok.nextToken());
		}

		// max min
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++)
		{
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < m; j++)
				min = Math.min(min, heights[i][j]);
			max = Math.max(max, min);
		}
		ans[0] = max;

		// min max
		int min = Integer.MAX_VALUE;
		for (int c = 0; c < m; c++)
		{
			max = Integer.MIN_VALUE;
			for (int r = 0; r < n; r++)
				max = Math.max(max, heights[r][c]);
			min = Math.min(min, max);
		}
		ans[1] = min;

		return ans;
	}

}
