import java.util.LinkedList;
import java.util.Queue;

public class ShadowSculpture
{

	private int n;
	private boolean[][][] g;
	private int dx[] = new int[]
	{ 1, -1, 0, 0, 0, 0 };
	private int dy[] = new int[]
	{ 0, 0, 1, -1, 0, 0 };
	private int dz[] = new int[]
	{ 0, 0, 0, 0, 1, -1 };

	public String possible(String[] XY, String[] YZ, String[] ZX)
	{
		// full cube
		n = XY.length;
		g = new boolean[n][n][n];
		for (int x = 0; x < n; x++)
			for (int y = 0; y < n; y++)
				for (int z = 0; z < n; z++)
					g[x][y][z] = true;

		// sculp
		for (int x = 0; x < n; x++)
			for (int y = 0; y < n; y++)
				if (XY[x].charAt(y) == 'N')
					for (int z = 0; z < n; z++)
						g[x][y][z] = false;
		for (int y = 0; y < n; y++)
			for (int z = 0; z < n; z++)
				if (YZ[y].charAt(z) == 'N')
					for (int x = 0; x < n; x++)
						g[x][y][z] = false;
		for (int z = 0; z < n; z++)
			for (int x = 0; x < n; x++)
				if (ZX[z].charAt(x) == 'N')
					for (int y = 0; y < n; y++)
						g[x][y][z] = false;

		// dfs on what we have
		Cube source = null;
		for (int z = 0; z < n; z++)
			for (int y = 0; y < n; y++)
				for (int x = 0; x < n; x++)
					if (g[x][y][z])
					{
						source = new Cube(x, y, z);
						break;
					}
		boolean g2[][][];
		if (source == null)
			g2 = new boolean[n][n][n];
		else
			g2 = dfs(source);

		// check valid shadows
		boolean valid = true;
		for (int x = 0; x < n; x++)
			for (int y = 0; y < n; y++)
				if (XY[x].charAt(y) == 'Y')
				{
					boolean found = false;
					for (int z = 0; z < n; z++)
						if (g2[x][y][z])
							found = true;
					if (!found)
						valid = false;
				}
		for (int y = 0; y < n; y++)
			for (int z = 0; z < n; z++)
				if (YZ[y].charAt(z) == 'Y')
				{
					boolean found = false;
					for (int x = 0; x < n; x++)
						if (g2[x][y][z])
							found = true;
					if (!found)
						valid = false;
				}
		for (int z = 0; z < n; z++)
			for (int x = 0; x < n; x++)
				if (ZX[z].charAt(x) == 'Y')
				{
					boolean found = false;
					for (int y = 0; y < n; y++)
						if (g2[x][y][z])
							found = true;
					if (!found)
						valid = false;
				}
		if (valid)
			return "Possible";
		else
			return "Impossible";
	}

	private boolean[][][] dfs(Cube source)
	{
		// invariants
		Queue<Cube> q = new LinkedList<>();
		boolean visited[][][] = new boolean[n][n][n];
		q.add(source);
		visited[source.x][source.y][source.z] = true;

		// bfs
		while (!q.isEmpty())
		{
			Cube cube = q.poll();
			for (int i = 0; i < dx.length; i++)
			{
				int newX = cube.x + dx[i];
				int newY = cube.y + dy[i];
				int newZ = cube.z + dz[i];
				if (valid(newX, newY, newZ))
					if (!visited[newX][newY][newZ])
					{
						visited[newX][newY][newZ] = true;
						q.add(new Cube(newX, newY, newZ));
					}
			}

		}

		return visited;
	}

	private boolean valid(int x, int y, int z)
	{
		return x >= 0 && x < n && y >= 0 && y < n && z >= 0 && z < n && g[x][y][z];
	}

}

class Cube
{
	int x, y, z;

	public Cube(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
}