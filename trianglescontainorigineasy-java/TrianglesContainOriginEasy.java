public class TrianglesContainOriginEasy
{

	public int count(int[] x, int[] y)
	{
		int count = 0;
		int n = x.length;
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				for (int k = j + 1; k < n; k++)
				{
					// real area
					Vector2 a = new Vector2(x[i] - x[j], y[i] - y[j]);
					Vector2 b = new Vector2(x[i] - x[k], y[i] - y[k]);
					double area = Math.abs(a.cross(b));

					// area around zero
					double area2 = 0;
					area2 += Math.abs(new Vector2(-x[i], -y[i]).cross(new Vector2(-x[j], -y[j])));
					area2 += Math.abs(new Vector2(-x[i], -y[i]).cross(new Vector2(-x[k], -y[k])));
					area2 += Math.abs(new Vector2(-x[k], -y[k]).cross(new Vector2(-x[j], -y[j])));

					if (Math.abs(area - area2) < 0.00001)
						count++;
				}

		return count;
	}

}

class Vector2
{
	int x, y;

	public Vector2(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	double cross(Vector2 other)
	{
		return 1.0 * (x * other.y - y * other.x);
	}
}