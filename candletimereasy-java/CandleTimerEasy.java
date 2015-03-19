import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class CandleTimerEasy
{

	private static final int INFINITY = 1000000;
	private int nNodes;
	private Node[] nodes;
	private int nEdges;
	private int[] degree;
	private ArrayList<ArrayList<Boolean>> allPermutations;

	public int differentTime(int[] A, int[] B, int[] len)
	{
		// make nodes
		nNodes = A.length + 1;
		nodes = new Node[nNodes];
		for (int i = 0; i < nNodes; i++)
			nodes[i] = new Node(i);

		// make edges
		nEdges = A.length;
		degree = new int[nNodes];
		for (int i = 0; i < nEdges; i++)
		{
			Node source = nodes[A[i]];
			Node dest = nodes[B[i]];
			int weight = len[i] * 2;
			source.next.add(new Edge(source, dest, weight));
			dest.next.add(new Edge(dest, source, weight));
			degree[A[i]]++;
			degree[B[i]]++;
		}

		// generate all permutations
		allPermutations = new ArrayList<ArrayList<Boolean>>();
		addPermutations(new ArrayList<Boolean>(), false);

		// try each permutations
		HashSet<Integer> allTimes = new HashSet<>();
		for (ArrayList<Boolean> permutation : allPermutations)
			allTimes.add(maxTime(permutation));

		System.out.println(allTimes);
		return allTimes.size();
	}

	private int maxTime(ArrayList<Boolean> onFire)
	{
		// invariants
		final int dist[] = new int[nNodes];
		PriorityQueue<Edge> pq = new PriorityQueue<>(7, new Comparator<Edge>()
		{
			@Override
			public int compare(Edge o1, Edge o2)
			{
				return Integer.compare(dist[o1.source.id] + o1.weight, dist[o2.source.id]
						+ o2.weight);
			}
		});

		// add sources
		Arrays.fill(dist, -1);
		for (int i = 0; i < nNodes; i++)
			if (onFire.get(i) == true)
			{
				dist[i] = 0;
				for (Edge e : nodes[i].next)
					pq.add(e);
			}

		// do a dijkstra
		while (!pq.isEmpty())
		{
			// get an edge
			Edge e = pq.poll();
			if (dist[e.dest.id] != -1)
				continue;

			// set new distance
			Node dest = e.dest;
			dist[dest.id] = dist[e.source.id] + e.weight;
			for (Edge next : dest.next)
				if (dist[next.dest.id] == -1)
					pq.add(next);
		}

		// max node time
		int max = Integer.MIN_VALUE;
		for (int x : dist)
			max = Math.max(max, x);

		// max between edge
		for (Node node : nodes)
			for (Edge edge : node.next)
			{
				int minTime = Math.min(dist[edge.source.id], dist[edge.dest.id]);
				int maxTime = Math.max(dist[edge.source.id], dist[edge.dest.id]);
				int rem = edge.weight;
				int time = 0;

				// one only
				time += maxTime;
				rem -= maxTime - minTime;
				time += rem / 2;
				max = Math.max(max, time);
			}
		return max;
	}

	private void addPermutations(ArrayList<Boolean> curr, boolean anyOne)
	{
		// base case
		if (curr.size() == nNodes)
		{
			if (anyOne)
				allPermutations.add(curr);
			return;
		}

		// add true
		if (degree[curr.size()] == 1)
		{
			ArrayList<Boolean> yesCurr = new ArrayList<>(curr);
			yesCurr.add(true);
			addPermutations(yesCurr, true);
		}

		// add false
		ArrayList<Boolean> noCurr = new ArrayList<>(curr);
		noCurr.add(false);
		addPermutations(noCurr, anyOne);
	}

}

class Node
{
	int id;
	LinkedList<Edge> next;

	public Node(int id)
	{
		this.id = id;
		this.next = new LinkedList<>();
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

}
