public class Surveyor
{

	public int area(String direction, int[] length)
	{
		// make the points
		int nPoints = length.length;
		Point points[] = new Point[nPoints];
		points[0] = new Point(0, 0);
		for (int i = 0; i < nPoints - 1; i++)
		{
			points[i + 1] = new Point(points[i].x, points[i].y);
			char c = direction.charAt(i);
			if (c == 'N')
				points[i + 1].y += length[i];
			else if (c == 'S')
				points[i + 1].y -= length[i];
			else if (c == 'E')
				points[i + 1].x += length[i];
			else if (c == 'W')
				points[i + 1].x -= length[i];
		}

		// calculate area
		double area = 0;
		for (int i =1; i < nPoints-1; i++) 
		{
			Point v1 = points[0].subtract(points[i]);
			Point v2 = points[0].subtract(points[i+1]);
			double cross = v1.x * v2.y - v1.y *v2.x;
			area += cross / 2;
		}
			
		return (int) Math.round(Math.abs(area));
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