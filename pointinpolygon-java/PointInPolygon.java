import java.util.StringTokenizer;

public class PointInPolygon
{

	private int nPoints;
	private Point[] points;
	private int nLines;
	private Line[] lines;
	private Object cente;

	public String testPoint(String[] vertices, int testPointX, int testPointY)
	{
		// make points
		nPoints = vertices.length;
		points = new Point[nPoints];
		for (int i = 0; i < nPoints; i++)
		{
			StringTokenizer tok = new StringTokenizer(vertices[i]);
			int x = Integer.parseInt(tok.nextToken());
			int y = Integer.parseInt(tok.nextToken());
			points[i] = new Point(x, y);
		}
	
			
		// make lines
		nLines = nPoints;
		lines = new Line[nLines];
		for (int i = 0; i < nLines; i++)
			lines[i] = new Line(points[i], points[(i + 1) % nLines]);

		// check boundary
		Point center = new Point(testPointX, testPointY);
		for (Line line : lines)
			if (isCollinear(center, line) && isOnSegment(center, line))
				return "BOUNDARY";

		// count intersections
		Point far = new Point(-20007, -30003);
		Line mainLine = new Line(center, far);
		int count = 0;
		for (Line line : lines)
			if (isIntersects(mainLine, line))
			{
				System.out.println(line.p1 + "->" + line.p2);
				count++;
			}

		return count % 2 == 1 ? "INTERIOR" : "EXTERIOR";
	}

	private boolean isIntersects(Line l1, Line l2)
	{
		Point intersection = lineIntersection(l1, l2);
		return intersection != null && isOnSegment(intersection, l1) && isOnSegment(intersection, l2);
	}

	private Point lineIntersection(Line l1, Line l2)
	{
		double det = l1.a * l2.b - l2.a * l1.b;
		if (det == 0)
			return null;
		else
		{
			double x = (l2.b * l1.c - l1.b * l2.c) / det;
			double y = (l1.a * l2.c - l2.a * l1.c) / det;
			return new Point(x, y);
		}
	}

	private boolean isOnSegment(Point point, Line line)
	{
		boolean onX = Math.min(line.p1.x, line.p2.x) <= point.x
				&& point.x <= Math.max(line.p1.x, line.p2.x);
		boolean onY = Math.min(line.p1.y, line.p2.y) <= point.y
				&& point.y <= Math.max(line.p1.y, line.p2.y);
		return onX && onY;
	}

	private boolean isCollinear(Point x, Line l)
	{
		Point xa = l.p1.subtract(x);
		Point ab = l.p2.subtract(l.p1);
		double cross = xa.x * ab.y - xa.y * ab.x;
		return Math.abs(cross) < 0.0000001;
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
	
	public String toString()
	{
		return x + ":" + y;
	}
}

class Line
{
	Point p1, p2;
	double a, b, c;

	public Line(Point p1, Point p2)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.a = p2.y - p1.y;
		this.b = p1.x - p2.x;
		this.c = a * p1.x + b * p1.y;
	}
}