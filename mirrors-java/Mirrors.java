import java.util.StringTokenizer;

public class Mirrors
{

	private int nMirrors;
	private Line[] mirrors;
	private int nObjects;
	private Vector2[] objects;
	private String[] objectsNames;

	public String seen(String[] mirrorsS, String[] objectsS, int[] startS)
	{
		readInput(mirrorsS, objectsS);

		// make starting ray
		Vector2 startPoint = new Vector2(startS[0], startS[1]);
		double degrees = Math.toRadians(startS[2]);
		Line ray = new Line(startPoint, degrees);

		// keep searhing for stuff
		int prevMirror = -1;
		while (true)
		{
			// see the nearest object
			double minObjectDist = Double.MAX_VALUE;
			int minObject = -1;
			for (int i = 0; i < nObjects; i++)
				if (intersects(ray, objects[i]))
					if (inDirection(ray, objects[i]))
					{
						double dist = ray.p1.dist(objects[i]);
						if (dist < minObjectDist)
						{
							minObjectDist = dist;
							minObject = i;
						}
					}
			if (prevMirror != -1)
				if (intersects(ray, startPoint))
					if (inDirection(ray, startPoint))
					{
						double dist = ray.p1.dist(startPoint);
						if (dist < minObjectDist)
						{
							minObjectDist = dist;
							minObject = nObjects;
						}
					}

			// see nearest mirror
			double minMirrorDist = Double.MAX_VALUE;
			int minMirror = -1;
			for (int i = 0; i < nMirrors; i++)
				if (i != prevMirror)
				{
					Vector2 intersection = intersection(ray, mirrors[i]);
					if (intersection != null && isOnSegment(intersection, mirrors[i]))
						if (inDirection(ray, intersection))
						{
							double dist = ray.p1.dist(intersection);
							if (dist < minMirrorDist)
							{
								minMirrorDist = dist;
								minMirror = i;
							}
						}
				}

			// see which is nearest
			if (minMirror == -1 && minObject == -1)
				return "space";
			else if (minObjectDist < minMirrorDist)
				return objectsNames[minObject];
			else
			{
				ray = mirrorRay(ray, mirrors[minMirror]);
				prevMirror = minMirror;
			}

		}

	}

	private boolean inDirection(Line l, Vector2 c)
	{
		Vector2 ba = l.p2.to(l.p1);
		Vector2 ac = l.p1.to(c);

		return ba.dot(ac) < 0;
	}

	private Line mirrorRay(Line ray, Line mirror)
	{
		// get the point on the other side
		Vector2 b = intersection(ray, mirror);
		Vector2 ab = ray.p1.to(b);
		Vector2 c = b.add(ab);

		// intersect the perpendicular line with the mirror
		Line perpLine = getPerpendicular(mirror, c);
		Vector2 d = intersection(perpLine, mirror);
		Vector2 cd = c.to(d);
		Vector2 e = d.add(cd);

		// make the new ray
		return new Line(b, e);
	}

	private Line getPerpendicular(Line l1, Vector2 m1)
	{
		Line l = new Line();
		l.a = -l1.b;
		l.b = l1.a;
		l.c = l.a * m1.x + l.b * m1.y;
		return l;
	}

	private boolean isOnSegment(Vector2 point, Line line)
	{
		boolean onX = Math.min(line.p1.x, line.p2.x) <= point.x
				&& point.x <= Math.max(line.p1.x, line.p2.x);
		boolean onY = Math.min(line.p1.y, line.p2.y) <= point.y
				&& point.y <= Math.max(line.p1.y, line.p2.y);
		return onX && onY;
	}

	private Vector2 intersection(Line l1, Line l2)
	{
		{
			double det = l1.a * l2.b - l1.b * l2.a;
			if (det == 0)
				return null;
			else
			{
				double x = (l2.b * l1.c - l1.b * l2.c) / det;
				double y = (l1.a * l2.c - l2.a * l1.c) / det;
				return new Vector2(x, y);
			}
		}

	}

	private boolean intersects(Line l, Vector2 p)
	{
		// find perpendicular distance
		Vector2 ab = l.p1.to(l.p2);
		Vector2 bp = l.p2.to(p);
		double perpDistance = ab.cross(bp) / l.p1.dist(l.p2);
		return Math.abs(perpDistance) <= 1;
	}

	private void readInput(String[] mirrorsS, String[] objectsS)
	{
		// read mirrors
		nMirrors = mirrorsS.length;
		mirrors = new Line[nMirrors];
		for (int i = 0; i < nMirrors; i++)
		{
			StringTokenizer tok = new StringTokenizer(mirrorsS[i]);
			int x1 = Integer.parseInt(tok.nextToken());
			int y1 = Integer.parseInt(tok.nextToken());
			int x2 = Integer.parseInt(tok.nextToken());
			int y2 = Integer.parseInt(tok.nextToken());
			mirrors[i] = new Line(new Vector2(x1, y1), new Vector2(x2, y2));
		}

		// read object
		nObjects = objectsS.length;
		objects = new Vector2[nObjects];
		objectsNames = new String[nObjects + 1];
		objectsNames[nObjects] = "me";
		for (int i = 0; i < nObjects; i++)
		{
			StringTokenizer tok = new StringTokenizer(objectsS[i]);
			objectsNames[i] = tok.nextToken();
			int x = Integer.parseInt(tok.nextToken());
			int y = Integer.parseInt(tok.nextToken());
			objects[i] = new Vector2(x, y);
		}
	}

}

class Vector2
{
	double x, y;

	public Vector2(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public double dot(Vector2 v)
	{
		return x * v.x + y * v.y;
	}

	public Vector2 add(Vector2 v)
	{
		return new Vector2(x + v.x, y + v.y);
	}

	public double cross(Vector2 v)
	{
		return x * v.y - y * v.x;
	}

	public Vector2 to(Vector2 v)
	{
		return new Vector2(v.x - x, v.y - y);
	}

	public double dist(Vector2 v)
	{
		double dx = x - v.x;
		double dy = y - v.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	public String toString()
	{
		return x + ":" + y;
	}
}

class Line
{
	Vector2 p1, p2;
	double a, b, c;

	public Line(Vector2 p1, Vector2 p2)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.a = p2.y - p1.y;
		this.b = p1.x - p2.x;
		this.c = a * p1.x + b * p1.y;
	}

	public Line(Vector2 p, double degrees)
	{
		// compute a point at distance 100
		double dx = 100.0 * Math.cos(degrees);
		double dy = 100.0 * Math.sin(degrees);
		Vector2 p2 = new Vector2(p.x + dx, p.y + dy);

		this.p1 = p;
		this.p2 = p2;
		this.a = p2.y - p1.y;
		this.b = p1.x - p2.x;
		this.c = a * p1.x + b * p1.y;
	}

	public Line()
	{
	}

	public String toString()
	{
		return p1 + "->" + p2;
	}
}
