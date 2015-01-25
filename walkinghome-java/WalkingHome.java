import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class WalkingHome
{

	private int n;
	private int m;
	private Node[][] nodes;
	private Node source;
	private Node dest;
	int dx[] = new int[]
	{ 1, -1, 0, 0 };
	int dy[] = new int[]
	{ 0, 0, 1, -1 };

	public int fewestCrossings(String[] map)
	{
		makeNodes(map);
		makeEdges();
		return dijksra();
	}

	private int dijksra()
	{
		// invariants
		boolean visited[][] = new boolean[n][m];
		final int dist[][] = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				dist[i][j] = 10000;
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>(n * m, new Comparator<Edge>()
		{
			public int compare(Edge e1, Edge e2)
			{
				return Integer.compare(dist[e1.source.r][e1.source.c] + e1.weight,
						dist[e2.source.r][e2.source.c] + e2.weight);
			}
		});
		dist[source.r][source.c] = 0;
		visited[source.r][source.c] = true;
		for (Edge e : source.edges)
			pq.add(e);

		// poll edges
		while (!pq.isEmpty())
		{
			// welcome the new node
			Edge edge = pq.poll();
			Node dest = edge.dest;
			if (visited[dest.r][dest.c])
				continue;
			visited[dest.r][dest.c] = true;
			dist[dest.r][dest.c] = dist[edge.source.r][edge.source.c] + edge.weight;

			// add its edges
			for (Edge edge2 : dest.edges)
				if (!visited[edge2.dest.r][edge2.dest.c])
					pq.add(edge2);
		}

		// return
		if (dist[dest.r][dest.c] < 10000)
			return dist[dest.r][dest.c];
		else
			return -1;
	}

	private void makeEdges()
	{
		// check each adjacent nodes
		for (int r = 0; r < n; r++)
			for (int c = 0; c < m; c++)
				for (int i = 0; i < 4; i++)
				{
					// get the two nodes
					int r2 = r + dx[i];
					int c2 = c + dy[i];
					if (!valid(r2, c2))
						continue;
					Node node1 = nodes[r][c];
					Node node2 = nodes[r2][c2];

					// free to free
					if (node1.type == '.' && node2.type == '.')
						node1.edges.add(new Edge(node1, node2, 0));

					// road to road
					if (node1.type == '|' && node2.type == '|')
						if (node1.r == node2.r)
							node1.edges.add(new Edge(node1, node2, 0));
					if (node1.type == '-' && node2.type == '-')
						if (node1.c == node2.c)
							node1.edges.add(new Edge(node1, node2, 0));

					// free to road
					if (node1.type == '.' && node2.type == '|')
						if (node1.r == node2.r)
							node1.edges.add(new Edge(node1, node2, 1));
					if (node1.type == '.' && node2.type == '-')
						if (node1.c == node2.c)
							node1.edges.add(new Edge(node1, node2, 1));

					// road to free
					if (node1.type == '|' && node2.type == '.')
						if (node1.r == node2.r)
							node1.edges.add(new Edge(node1, node2, 0));
					if (node1.type == '-' && node2.type == '.')
						if (node1.c == node2.c)
							node1.edges.add(new Edge(node1, node2, 0));

				}

	}

	private boolean valid(int r, int c)
	{
		return r >= 0 && r < n && c >= 0 && c < m;
	}

	private void makeNodes(String[] map)
	{
		// make a nodes
		n = map.length;
		m = map[0].length();
		nodes = new Node[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
			{
				char c = map[i].charAt(j);
				nodes[i][j] = new Node(i, j, c);
				if (c == 'S')
				{
					source = nodes[i][j];
					source.type = '.';
				}
				if (c == 'H')
				{
					dest = nodes[i][j];
					dest.type = '.';
				}
			}
	}

}

class Node
{
	int r, c;
	char type;
	LinkedList<Edge> edges;

	public Node(int r, int c, char type)
	{
		this.r = r;
		this.c = c;
		this.type = type;
		this.edges = new LinkedList<Edge>();
	}
}

class Edge
{
	Node source;
	Node dest;
	int weight;

	public Edge(Node source, Node dest, int weight)
	{
		this.source = source;
		this.dest = dest;
		this.weight = weight;
	}

	public String toString()
	{
		return source.type + " -" + weight + "-> " + dest.type;
	}
}