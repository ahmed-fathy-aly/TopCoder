public class ConvexPolygon
{

	public double findArea(int[] x, int[] y)
	{
		// make points
		int n = x.length;
		Point points[] = new Point[n];
		for (int i = 0; i < n; i++)
			points[i] = new Point(x[i], y[i]);

		// compute area
		double sum = 0;
		for (int i = 1; i < n - 1; i++)
		{
			Point side1 = points[0].subtract(points[i]);
			Point side2 = points[0].subtract(points[i + 1]);
			double cross = side1.x * side2.y - side1.y * side2.x;
			sum += cross / 2;
		}

		return Math.abs(sum);
	}

}

class Point
{
	double x, y;

	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public Point subtract(Point p)
	{
		return new Point(x - p.x, y - p.y);
	}
}