import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DoubleWeights
{

	private String[] weight1;
	private String[] weight2;
	private int n;

	public int minimalCost(String[] weight1, String[] weight2)
	{
		this.weight1 = weight1;
		this.weight2 = weight2;
		n = weight1.length;
		
		
		boolean[][][] visited = new boolean[n][n*11][n*11];
		visited[0][0][0] = true;
		Queue<Integer> qNode = new LinkedList<>();
		Queue<Integer> qW1= new LinkedList<>();
		Queue<Integer> qW2 = new LinkedList<>();
		qNode.add(0);
		qW1.add(0);
		qW2.add(0);
		
		while(!qNode.isEmpty())
		{
			int node = qNode.poll();
			int w1 = qW1.poll();
			int w2 = qW2.poll();
			
			for (int next = 0; next < n; next++) 
				if (getWeight1(node, next) != -1) 
				{
					int nextW1 = w1 + getWeight1(node, next);
					int nextW2 = w2 + getWeight2(node, next);
					if (nextW1 < n*11 && nextW2 < n*11) 
						if (!visited[next][nextW1][nextW2]) 
						{
							visited[next][nextW1][nextW2] = true;
							qNode.add(next);
							qW1.add(nextW1);
							qW2.add(nextW2);
						}
				}
		}

		// find shortest path
		int min = Integer.MAX_VALUE;
		for (int w1 = 0; w1 < n*11; w1++) 
			for (int w2 = 0; w2 < n*11; w2++) 
				if (visited[1][w1][w2]) 
					min = Math.min(min, w1*w2); 
					
				
			
		return min == Integer.MAX_VALUE  ? -1 : min;
	}

	private int getWeight1(int i, int j)
	{
		if (weight1[i].charAt(j) == '.') 
			return -1;
			
		return Integer.parseInt(weight1[i].charAt(j) + "");
	}

	private int getWeight2(int i, int j)
	{
		if (weight2[i].charAt(j) == '.') 
			return -1;
		return Integer.parseInt(weight2[i].charAt(j) + "");
	}
}
