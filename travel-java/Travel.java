import java.util.StringTokenizer;

public class Travel
{

	private int n;
	private Vector3[] points;
	private double[][] g;
	private double[][] dp;

	public int shortest(String[] cities, int radius)
	{
		// convert to x, y, z
		n = cities.length;
		points = new Vector3[n];
		for (int i = 0; i < n; i++)
		{
			StringTokenizer tok = new StringTokenizer(cities[i]);
			double latidute = Integer.parseInt(tok.nextToken());
			double longitude = Integer.parseInt(tok.nextToken());
			latidute = Math.toRadians(latidute);
			longitude = Math.toRadians(longitude);
			double x = radius * Math.cos(latidute) * Math.cos(longitude);
			double y = radius * Math.cos(latidute) * Math.sin(longitude);
			double z = radius * Math.sin(latidute);
			points[i] = new Vector3(x, y, z);
		}

		// find all pairs distances
		g = new double[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				g[i][j] = getDistance(points[i], points[j], radius);
		double angle = getAngle(points[0], points[1], radius);

		// dp
		dp = new double[(1 << n)][n];
		for (int i = 0; i < (1 << n); i++)
			for (int j = 0; j < n; j++)
				dp[i][j] = -1;
		return (int) Math.round(f(1, 0));
	}

	private double f(int mask, int curr)
	{
		// base case
		if (mask == (1 << n) - 1)
			return g[curr][0];
		if (dp[mask][curr] != -1)
			return dp[mask][curr];

		// try all unvisited cities
		double ans = Double.MAX_VALUE;
		for (int i = 0; i < n; i++)
			if ((mask & (1 << i)) == 0)
				ans = Math.min(ans, g[curr][i]+ f(mask | (1 << i), i));
		dp[mask][curr] = ans;
		return ans;
	}

	private double getDistance(Vector3 v1, Vector3 v2, double radius)
	{
		return radius *  getAngle(v1, v2, radius);
	}

	private double getAngle(Vector3 v1, Vector3 v2, double radius)
	{
		double dot = v1.dot(v2);
		return Math.acos(dot / (radius * radius));
	}

}

class Vector3
{
	double x, y, z;

	public Vector3(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double distance(Vector3 v2)
	{
		double dx = x - v2.x;
		double dy = y - v2.y;
		double dz = z - v2.z;
		return Math.sqrt(dx * dx + dy * dy + dz * dz);
	}

	public double dot(Vector3 v2)
	{
		return x * v2.x + y * v2.y + z * v2.z;
	}

	public String toString()
	{
		return x + "," + y + "," + z;
	}
}