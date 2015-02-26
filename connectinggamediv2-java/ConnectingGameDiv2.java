import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectingGameDiv2
{

	private int nPureNodes;
	private int nNodes;
	private Node[] nodes;
	private int SOURCE_ID;
	private int DEST_ID;
	int INFINITY = 100000;
	private int[][] g;
	private HashMap<Integer, Character> idxToChar;
	private HashMap<Character, Integer> charToIdx;
	private int dx[] = new int[]
	{ 1, -1, 0, 0 };
	private int dy[] = new int[]
	{ 0, 0, 1, -1 };
	private int width;
	private int height;

	public int getmin(String[] board)
	{
		// save params
		width = board[0].length();
		height = board.length;

		// count nodes
		HashMap<Character, Integer> charCount = new HashMap<>();
		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[i].length(); j++)
			{
				char c = board[i].charAt(j);
				if (charCount.containsKey(c))
					charCount.put(c, charCount.get(c) + 1);
				else
					charCount.put(c, 1);
			}

		// map character to index
		charToIdx = new HashMap<Character, Integer>();
		idxToChar = new HashMap<Integer, Character>();
		int currIdx = 0;
		ArrayList<Character> chars = new ArrayList<>(charCount.keySet());
		Collections.sort(chars);
		for (Character c : chars)
		{
			charToIdx.put(c, currIdx);
			idxToChar.put(currIdx, c);
			currIdx++;
		}

		// make nodes
		nPureNodes = charCount.size();
		nNodes = 2 * nPureNodes + 2;
		SOURCE_ID = nNodes - 2;
		DEST_ID = nNodes - 1;
		nodes = new Node[nNodes];
		for (int i = 0; i < nNodes; i++)
			nodes[i] = new Node(i);

		// make edges between twin nodes
		g = new int[nNodes][nNodes];
		for (int i = 0; i < nPureNodes; i++)
		{
			Character c = idxToChar.get(i);
			int count = charCount.get(c);
			g[i][i + nPureNodes] = count;
		}

		// make edges between neighbors
		for (int r = 0; r < board.length; r++)
			for (int c = 0; c < board[r].length(); c++)
				for (int i = 0; i < 4; i++)
				{
					int newR = r + dy[i];
					int newC = c + dx[i];
					if (inBounds(newR, newC))
					{
						// find indices of nodes
						char c1 = board[r].charAt(c);
						char c2 = board[newR].charAt(newC);
						if (c1 == c2)
							continue;
						int idx1 = charToIdx.get(c1);
						int idx1Twin = idx1 + nPureNodes;
						int idx2 = charToIdx.get(c2);
						int idx2Twin = idx2 + nPureNodes;

						// add edges
						g[idx1Twin][idx2] = INFINITY;
						g[idx2Twin][idx1] = INFINITY;
					}
				}

		// connect to source
		for (int c = 0; c < width; c++)
		{
			char ch = board[0].charAt(c);
			int id = charToIdx.get(ch);
			g[SOURCE_ID][id] = INFINITY;
		}

		// connect to dest
		for (int c = 0; c < width; c++)
		{
			char ch = board[height - 1].charAt(c);
			int id = charToIdx.get(ch);
			g[id + nPureNodes][DEST_ID] = INFINITY;
		}

		// // test
		// System.out.println(charToIdx);
		// for (int i = 0; i < nNodes; i++)
		// {
		// for (int j = 0; j < nNodes; j++)
		// if (g[i][j] != INFINITY)
		// System.out.print(g[i][j] + "\t");
		// else
		// System.out.print("00\t");
		// System.out.println();
		// }

		return maxFlow();
	}

	private boolean inBounds(int r, int c)
	{
		return r >= 0 && r < height && c >= 0 && c < width;
	}

	private int maxFlow()
	{
		// everyday i'm augmenting
		int sum = 0;
		while (true)
		{
			int x = augmentPath();
			if (x == 0)
				break;
			else
				sum += x;
		}
		return sum;
	}

	private int augmentPath()
	{
		// bfs invariants
		Queue<Integer> q = new LinkedList<Integer>();
		boolean visited[] = new boolean[nNodes];
		int prev[] = new int[nNodes];
		q.add(SOURCE_ID);
		visited[SOURCE_ID] = true;
		Arrays.fill(prev, -1);

		// bfs
		boolean foundDest = false;
		while (!q.isEmpty() && !foundDest)
		{
			int node = q.poll();

			// add next
			for (int next = 0; next < nNodes; next++)
				if (node != next && g[node][next] > 0 && !visited[next])
				{
					// add to queue
					visited[next] = true;
					q.add(next);
					prev[next] = node;

					// check if dest
					if (next == DEST_ID)
						foundDest = true;
				}
		}
		if (!foundDest)
			return 0;

		// find min capacity
		int minCapacity = Integer.MAX_VALUE;
		int curr = DEST_ID;
		while (prev[curr] != -1)
		{
			int prevNode = prev[curr];
			minCapacity = Math.min(minCapacity, g[prevNode][curr]);
			curr = prev[curr];
		}

		// make residue graph
		curr = DEST_ID;
		while (prev[curr] != -1)
		{
			int prevNode = prev[curr];
			g[prevNode][curr] -= minCapacity;
			g[curr][prevNode] += minCapacity;
			curr = prev[curr];
		}

		return minCapacity;
	}

}

class Node
{
	int id;

	public Node(int id)
	{
		this.id = id;
	}
}