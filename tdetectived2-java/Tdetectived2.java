import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Tdetectived2
{

	private int n;
	private int[][] g;
	private boolean[] dp;
	private int[] min;

	public int reveal(String[] s)
	{
		// create the hate grid
		n = s.length;
		g = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				g[i][j] = Integer.parseInt(s[i].charAt(j) + "");

		// bfs on the levels
		min = new int[n];
		Arrays.fill(min, Integer.MAX_VALUE);
		boolean visited[] = new boolean[1 << n];
		visited[1] = true;

		Queue<Integer> q = new LinkedList<>();
		q.add(1);

		Queue<Integer> d = new LinkedList<>();
		d.add(0);

		while (!q.isEmpty())
		{
			// compute the max
			int mask = q.poll();
			int max[] = new int[n];
			for (int i = 0; i < n; i++)
				if (((1 << i) & mask) != 0)
					for (int j = 0; j < n; j++)
						max[j] = Math.max(max[j], g[i][j]);

			// calculate max suspision
			int maxS = 0;
			for (int i = 0; i < n; i++)
				if (((1 << i) & mask) == 0)
					maxS = Math.max(max[i], maxS);
			
			// go to all max suspisions
			int dist = d.poll();
			for (int i = 0; i < n; i++)
				if (((1 << i) & mask) == 0)
					if (!visited[mask | (1 << i)])
						if (max[i] == maxS)
						{
							int newMask = mask | (1 << i);
							visited[newMask] = true;
							q.add(newMask);
							d.add(dist + 1);
							min[i] = Math.min(min[i], dist + 1);
						}

		}

		// compute answer
		int ans = 0;
		for (int i = 0; i < n; i++)
			ans += i * min[i];
		return ans;
	}


}
