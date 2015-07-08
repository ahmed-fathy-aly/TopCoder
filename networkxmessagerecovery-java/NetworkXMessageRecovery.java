import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;

public class NetworkXMessageRecovery
{

	private Node[] nodes;
	private boolean[] visited;
	private int currRank;

	public String recover(String[] messages)
	{
		// create nodes
		int nNodes = 26 * 2;
		nodes = new Node[nNodes];
		for (int i = 0; i < nNodes; i++)
			nodes[i] = new Node(i, toChar(i));
		for (String string : messages)
			for (int i = 0; i < string.length(); i++)
				nodes[fromChar(string.charAt(i))].needed = true;

		// create edges
		for (String string : messages)
			for (int i = 0; i < string.length() - 1; i++)
				addEdge(string.charAt(i), string.charAt(i + 1));

		// make nodes
		HashSet<Node> poss = new HashSet<>();
		for (Node node : nodes)
			if (node.needed)
				poss.add(node);

		int reqSize = poss.size();
		String ans = "";
		visited = new boolean[nNodes];

		while (ans.length() < reqSize)
			ans = ans + getValid(poss);
		return ans;
	}

	private char  getValid(HashSet<Node> poss)
	{
		// take those with no edge before
		Node curr = null;
		for (Node node : poss)
		{
			boolean can = true;
			for (Node prev : node.prev)
				if (!visited[prev.id])
					can = false;
			if (can)
				if (curr == null || node.c < curr.c)
					curr = node;
		}

		// mark as visited
		visited[curr.id] = true;
		poss.remove(curr);
		return curr.c;
	}

	private void addEdge(char c1, char c2)
	{
		int x = fromChar(c1);
		int y = fromChar(c2);
		nodes[x].next.add(nodes[y]);
		nodes[y].prev.add(nodes[x]);
	}

	private int fromChar(char c1)
	{
		if (c1 >= 'a')
			return c1 - 'a';
		else
			return c1 - 'A' + 26;
	}

	private char toChar(int i)
	{
		if (i < 26)
			return (char) ('a' + i);
		else
			return (char) ('A' + i - 26);

	}

}

class Node
{
	int id;
	char c;
	int rank;
	boolean needed;
	LinkedList<Node> prev;
	LinkedList<Node> next;

	public Node(int id, char c)
	{
		this.id = id;
		this.c = c;
		this.prev = new LinkedList<>();
		this.next = new LinkedList<>();
		this.rank = -1;
	}

	public String toString()
	{
		return c + "";
	}
}