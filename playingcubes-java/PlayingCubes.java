import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PlayingCubes
{

	private int nCubes;
	private int nNodes;
	private Node[] nodes;
	private int[][] cap;

	public int[] composeWords(String[] cubes, String[] words)
	{
		// try every word
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < words.length; i++)
			if (solve(words[i], cubes))
				ans.add(i);
		System.out.println(ans);
		// convert to array
		int arr[] = new int[ans.size()];
		for (int i = 0; i < ans.size(); i++)
			arr[i] = ans.get(i);
		return arr;
	}

	private boolean solve(String string, String[] cubes)
	{
		// make nodes
		nCubes = cubes.length;
		nNodes = nCubes + 26 + 2;
		nodes = new Node[nNodes];
		for (int i = 0; i < nNodes; i++)
			nodes[i] = new Node(i);

		// make cubes nodes
		Node sourceNode = nodes[nNodes - 2];
		Node sinkNode = nodes[nNodes - 1];
		cap = new int[nNodes][nNodes];
		for (int i = 0; i < nCubes; i++)
			for (int j = 0; j < cubes[i].length(); j++)
			{
				// connect to letters
				char c = cubes[i].charAt(j);
				Node source = nodes[i];
				Node dest = nodes[nCubes + c - 'A'];
				source.next.add(dest);
				dest.next.add(source);
				cap[source.id][dest.id] = 1;

				// connect to source
				source.next.add(sourceNode);
				sourceNode.next.add(source);
				cap[sourceNode.id][source.id] = 1;
			}

		// make letters nodes
		for (int i = 0; i < string.length(); i++)
		{
			// connect to sink
			char c = string.charAt(i);
			Node letterNode = nodes[nCubes + c - 'A'];
			letterNode.next.add(sinkNode);
			sinkNode.next.add(letterNode);
			cap[letterNode.id][sinkNode.id] += 1;
		}

		return maxFlow() == string.length();
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
		Queue<Node> q = new LinkedList<Node>();
		boolean visited[] = new boolean[nNodes];
		int prev[] = new int[nNodes];
		q.add(nodes[nNodes - 2]);
		visited[nNodes - 2] = true;
		Arrays.fill(prev, -1);

		// bfs to sink
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
					if (next.id == nNodes - 1)
						foundSink = true;
				}
		}
		if (!foundSink)
			return 0;

		// make residue
		int curr = nNodes - 1;
		while (prev[curr] != -1)
		{
			int source = prev[curr];
			cap[source][curr]--;
			cap[curr][source]++;
			curr = prev[curr];
		}
		return 1;
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