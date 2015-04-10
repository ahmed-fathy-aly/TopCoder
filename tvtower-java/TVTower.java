public class TVTower
{

	private int n;
	private Point[] points;

	public double minRadius(int[] x, int[] y)
	{
		// one point
		n = x.length;
		points = new Point[n];
		for (int i = 0; i < n; i++)
			points[i] = new Point(x[i], y[i]);

		if (x.length <= 1)
			return 0;

		// try all two points
		double ans = Double.MAX_VALUE;
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
			{
				Point center = getMidPoint(points[i], points[j]);
				ans = Math.min(ans, getRadius(center));
			}

		// try all three points
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				for (int k = j + 1; k < n; k++)
				{
					Point circleCenter = getCircleCenter(points[i], points[j], points[k]);
					if (circleCenter != null)
						ans = Math.min(ans, getRadius(circleCenter));
				}

		return ans;
	}

	private Point getCircleCenter(Point p1, Point p2, Point p3)
	{
		// first pependicular
		Line l1 = new Line(p1, p2);
		Point m1 = getMidPoint(p1, p2);
		Line pL1 = getPerpendicular(l1, m1);

		// second perpendicular
		Line l2 = new Line(p2, p3);
		Point m2 = getMidPoint(p2, p3);
		Line pL2 = getPerpendicular(l2, m2);

		// find intersection
		return lineIntersection(pL1, pL2);
	}

	private Point lineIntersection(Line l1, Line l2)
	{
		double det = l1.a * l2.b - l1.b * l2.a;
		if (det == 0)
			return null;
		else
		{
			double x = (l2.b * l1.c - l1.b * l2.c) / det;
			double y = (l1.a * l2.c - l2.a * l1.c) / det;
			return new Point(x, y);
		}

	}

	private Line getPerpendicular(Line l1, Point m1)
	{
		Line l = new Line();
		l.a = -l1.b;
		l.b = l1.a;
		l.c = l.a * m1.x + l.b * m1.y;
		return l;
	}

	private Point getMidPoint(Point p1, Point p2)
	{
		return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
	}

	private double getRadius(Point p)
	{
		double max = 0;
		for (int i = 0; i < n; i++)
			max = Math.max(max, p.dist(points[i]));
		return max;
	}

}

class Point
{
	double x;
	double y;

	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public double dist(Point point)
	{
		double dx = x - point.x;
		double dy = y - point.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
}

class Line
{
	double a, b, c;
	Point p1, p2;

	public Line()
	{
	}

	public Line(Point p1, Point p2)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.a = p2.y - p1.y;
		this.b = p1.x - p2.x;
		this.c = a * p1.x + b * p1.y;
	}
}