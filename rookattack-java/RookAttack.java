import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class RookAttack
{

	private int n;
	private int m;
	private boolean[][] inValid;
	private Node[] nodes;
	private int nNodes;
	private int SOURCE_ID;
	private int SINK_ID;
	private int[][] cap;

	public int howMany(int rows, int cols, String[] cutouts)
	{
		// params
		n = rows;
		m = cols;

		// mark invalid cells
		markInvalidCells(cutouts);

		// make nodes
		makeNodes();

		return maxFlow();
	}

	private int maxFlow()
	{
		// keep augmenting
		int ans = 0;
		while (true)
		{
			int x = makePath();
			if (x == 0)
				break;
			else
				ans += x;
		}
		return ans;
	}

	private int makePath()
	{
		// invariants
		Queue<Node> q = new LinkedList<>();
		q.add(nodes[SOURCE_ID]);
		boolean visited[] = new boolean[nNodes];
		visited[SOURCE_ID] = true;
		int prev[] = new int[nNodes];
		Arrays.fill(prev, -1);

		// bfs to source
		boolean foundSink = false;
		while (!q.isEmpty() && !foundSink)
		{
			Node node = q.poll();
			for (Node next : node.next)
				if (!visited[next.id] && cap[node.id][next.id] > 0)
				{
					visited[next.id] = true;
					q.add(next);
					prev[next.id] = node.id;
					if (next.id == SINK_ID)
						foundSink = true;
				}
		}
		if (!foundSink)
			return 0;

		// find min capacity
		int minCap = Integer.MAX_VALUE;
		int curr = SINK_ID;
		while (prev[curr] != -1)
		{
			int src = prev[curr];
			int c = cap[src][curr];
			minCap = Math.min(minCap, c);
			curr = prev[curr];
		}

		// make residue graph
		curr = SINK_ID;
		while (prev[curr] != -1)
		{
			System.out.println(curr);
			int src = prev[curr];
			cap[src][curr] -= minCap;
			cap[curr][src] += minCap;
			curr = prev[curr];
		}
		return minCap;
	}

	private void makeNodes()
	{
		// make nodes
		nNodes = n + m + 2;
		SOURCE_ID = n + m;
		SINK_ID = n + m + 1;
		nodes = new Node[nNodes];
		for (int i = 0; i < nNodes; i++)
			nodes[i] = new Node(i);

		// normal edges
		cap = new int[nNodes][nNodes];
		for (int r = 0; r < n; r++)
			for (int c = 0; c < m; c++)
				if (!inValid[r][c])
				{
					Node src = nodes[r];
					Node dest = nodes[n + c];
					src.next.add(dest);
					dest.next.add(src);
					cap[src.id][dest.id] = 1;
				}

		// connect source
		Node source = nodes[SOURCE_ID];
		for (int i = 0; i < n; i++)
		{
			source.next.add(nodes[i]);
			cap[SOURCE_ID][nodes[i].id] = 1;
			nodes[i].next.add(source);
		}

		// connect sink
		Node sink = nodes[SINK_ID];
		for (int i = n; i < n + m; i++)
		{
			nodes[i].next.add(sink);
			cap[nodes[i].id][SINK_ID] = 1;
			sink.next.add(nodes[i]);
		}

	}

	private void markInvalidCells(String[] cutouts)
	{
		inValid = new boolean[n][m];
		for (String strList : cutouts)
		{
			StringTokenizer tok = new StringTokenizer(strList, ",");
			while (tok.hasMoreTokens())
				removeCell(tok.nextToken());
		}

	}

	private void removeCell(String str)
	{
		// parse and remove
		StringTokenizer tok = new StringTokenizer(str.trim());
		int r = Integer.parseInt(tok.nextToken());
		int c = Integer.parseInt(tok.nextToken());
		inValid[r][c] = true;
	}

}

class Node
{
	int id;
	LinkedList<Node> next;

	public Node(int id)
	{
		this.id = id;
		this.next = new LinkedList<>();
	}
}
