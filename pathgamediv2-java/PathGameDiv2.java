import java.util.LinkedList;
import java.util.Queue;

public class PathGameDiv2
{

	private int width;
	private int height;
	private boolean[][] valid;
	public int dx[] = new int[]
	{ 1, -1, 0, 0 };
	public int dy[] = new int[]
	{ 0, 0, 1, -1 };

	public int calc(String[] board)
	{
		// save params
		int alreadyBlackCount = 0;
		width = board[0].length();
		height = board.length;
		valid = new boolean[height][width];
		for (int r = 0; r < height; r++)
			for (int c = 0; c < width; c++)
				if (board[r].charAt(c) == '#')
				{
					alreadyBlackCount++;
					valid[r][c] = false;
				} else
					valid[r][c] = true;

		// find shortest path
		int min = Integer.MAX_VALUE;
		for (int r = 0; r < board.length; r++)
			if (valid[r][0])
				min = Math.min(min, bfs(r, 0));
		System.out.println("min" + min);
		return width * height - min - alreadyBlackCount;
	}

	private int bfs(int sourceR, int sourceC)
	{
		// invariants
		Queue<Integer> qR = new LinkedList<Integer>();
		Queue<Integer> qC = new LinkedList<Integer>();
		Queue<Integer> qCount = new LinkedList<Integer>();
		boolean visited[][] = new boolean[height][width];
		qR.add(sourceR);
		qC.add(sourceC);
		qCount.add(1);
		visited[sourceR][sourceC] = true;

		// bfs
		while (!qCount.isEmpty())
		{
			// check if dest
			int r = qR.poll();
			int c = qC.poll();
			int count = qCount.poll();
			if (c == width - 1)
				return count;

			// add next
			for (int i = 0; i < 4; i++)
			{
				int newR = r + dx[i];
				int newC = c + dy[i];
				int newCount = count + 1;
				if (valid(newR, newC) && !visited[newR][newC])
				{
					// add to queue
					visited[newR][newC] = true;
					qR.add(newR);
					qC.add(newC);
					qCount.add(newCount);

				}
			}

		}
		return Integer.MAX_VALUE;
	}

	private boolean valid(int r, int c)
	{
		return r >= 0 && r < height && c >= 0 && c < width && valid[r][c];
	}

}
