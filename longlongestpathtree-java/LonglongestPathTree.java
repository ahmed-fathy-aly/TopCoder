import java.util.LinkedList;

public class LonglongestPathTree
{

	private Node[] nodes;
	private int n;
	private Edge[] edges;
	private long maxDist;
	private Node maxNode;

	public long getLength(int[] A, int[] B, int[] L)
	{
		// make nodes
		n = A.length + 1;
		nodes = new Node[n];
		for (int i = 0; i < n; i++)
			nodes[i] = new Node(i);

		// make edges
		edges = new Edge[L.length];
		for (int i = 0; i < L.length; i++)
		{
			Edge e = new Edge(nodes[A[i]], nodes[B[i]], L[i]);
			nodes[A[i]].next.add(e);
			nodes[B[i]].next.add(e);
			edges[i] = e;
		}

		// try to remove every each
		long ans = 0;
		for (int i = 0; i < L.length; i++)
		{
			edges[i].removed = true;
			long val = maxDiameter(edges[i].src) + edges[i].weight + maxDiameter(edges[i].dest);
			ans = Math.max(ans, val);
			edges[i].removed = false;
		}

		return ans;
	}

	private long maxDiameter(Node s)
	{
		// find furthest node
		s.dist = 0;
		maxDist = 0;
		maxNode = s;
		maxDFS(s);
		Node t = maxNode;

		// find diameter
		t.dist = 0;
		maxDist = 0;
		maxNode = t;
		maxDFS(t);
		Node d = maxNode;
		return d.dist;
	}

	private void maxDFS(Node node)
	{
		// compare that dist
		if (node.dist > maxDist)
		{
			maxDist = node.dist;
			maxNode = node;
		}

		// dfs to next
		for (Edge e : node.next)
			if (!e.removed)

			{
				Node nextNode = nextNode(node, e);
				e.removed = true;
				maxDFS(nextNode);
				e.removed = false;
			}

	}

	private Node nextNode(Node node, Edge e)
	{
		// find which one is the next
		Node next = node == e.src ? e.dest : e.src;
		next.dist = node.dist + e.weight;
		return next;
	}

	class Node
	{
		int id;
		LinkedList<Edge> next;
		long dist;

		public Node(int id)
		{
			this.id = id;
			this.next = new LinkedList<>();
			this.dist = 0;
		}
	}

	class Edge
	{
		Node src;
		Node dest;
		long weight;
		boolean removed;

		public Edge(Node src, Node dest, long weight)
		{
			this.src = src;
			this.dest = dest;
			this.weight = weight;
			this.removed = false;
		}

	}
}
