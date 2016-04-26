import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Autohamil
{

	private int[] z0;
	private int[] z1;
	private int n;
	private int[] component;
	private LinkedList<Integer>[] sccNext;
	private LinkedList<Integer>[] rev;

	private int sccN;
	private int currLevel;
	private boolean[] visited;
	private int[] level;
	private Integer[] sccNodes;

	public String check(int[] z0, int[] z1)
	{
		n = z0.length;
		this.z0 = z0;
		this.z1 = z1;

		makeRevGraph();
		getSCC();
		formSCCGraph();
		topSortSCC();

		// check we have a path
		for (int i = 0; i < sccN - 1; i++)
			if (!sccNext[sccNodes[i]].contains(sccNodes[i + 1]))
				return "Does not exist";
		return "Exists";
	}

	private void topSortSCC()
	{
		// top sort
		visited = new boolean[sccN];
		level = new int[sccN];
		currLevel = n;
		for (int node = 0; node < sccN; node++)
			if (!visited[node])
			{
				visited[node] = true;
				dfs(node);
			}
		sccNodes = new Integer[sccN];
		for (int i = 0; i < sccN; i++)
			sccNodes[i] = i;
		Arrays.sort(sccNodes, new Comparator<Integer>()
		{

			@Override
			public int compare(Integer o1, Integer o2)
			{
				return Integer.compare(level[o1], level[o2]);
			}
		});
	}

	private void formSCCGraph()
	{
		// form scc graph
		sccNext = new LinkedList[sccN];
		for (int i = 0; i < sccN; i++)
			sccNext[i] = new LinkedList<Integer>();
		for (int i = 0; i < n; i++)
		{
			sccNext[component[i]].add(component[z0[i]]);
			sccNext[component[i]].add(component[z1[i]]);
		}
	}

	private void getSCC()
	{
		// dfs for scc
		visited = new boolean[n];
		level = new int[n];
		currLevel = 0;
		for (int node = 0; node < n; node++)
			if (!visited[node])
			{
				visited[node] = true;
				dfsRev(node);
			}
		Integer initialNodes[] = new Integer[n];
		for (int i = 0; i < n; i++)
			initialNodes[i] = i;
		Arrays.sort(initialNodes, new Comparator<Integer>()
		{

			@Override
			public int compare(Integer o1, Integer o2)
			{
				return Integer.compare(level[o1], level[o2]);
			}
		});

		// get scc
		component = new int[n];
		Arrays.fill(component, -1);
		int currComponent = 0;
		for (Integer node : initialNodes)
			if (component[node] == -1)
				getComponent(node, currComponent++);
		sccN = currComponent;

	}

	private void makeRevGraph()
	{
		rev = new LinkedList[n];
		for (int i = 0; i < n; i++)
			rev[i] = new LinkedList<>();
		for (int i = 0; i < n; i++)
		{
			rev[z0[i]].add(i);
			rev[z1[i]].add(i);
		}
	}

	private void dfsRev(int node)
	{
		for (int prevNode : rev[node])
			if (!visited[prevNode])
			{
				visited[prevNode] = true;
				dfsRev(prevNode);
			}

		level[node] = currLevel--;
	}

	private void dfs(int node)
	{
		for (int nextNode : sccNext[node])
			if (!visited[nextNode])
			{
				visited[nextNode] = true;
				dfs(nextNode);
			}

		level[node] = currLevel--;

	}

	private void getComponent(int source, int currentComponent)
	{
		// bfs to get its component
		Queue<Integer> q = new LinkedList<>();
		q.add(source);
		component[source] = currentComponent;

		while (!q.isEmpty())
		{
			int node = q.poll();
			List<Integer> next = Arrays.asList(z0[node], z1[node]);
			for (int nextNode : next)
				if (component[nextNode] == -1)
				{
					component[nextNode] = currentComponent;
					q.add(nextNode);
				}
		}
	}

}
