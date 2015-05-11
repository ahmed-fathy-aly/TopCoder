import java.awt.geom.Area;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class PuckShot
{

	int width = 3000;
	int goalWidth = 183;
	int height = 1733;
	int playerWidth = 50;
	private int nPlayers;
	private Line[] players;
	private Vector2 start;
	private Line goal;
	private double e = 0;

	public double caromAngle(int puckCoord, int[] xCoords, int[] yCoords)
	{
		// read players
		start = new Vector2(puckCoord, 0);
		nPlayers = xCoords.length * 2;
		players = new Line[nPlayers];
		for (int i = 0; i < xCoords.length; i++)
		{
			int y = yCoords[i];
			int x1 = xCoords[i] - 25;
			int x2 = xCoords[i] + 25;
			players[i] = new Line(new Vector2(x1, y), new Vector2(x2, y));
			int x1m = width + width - x1;
			int x2m = width + width - x2;
			players[i + xCoords.length] = new Line(new Vector2(x2m, y), new Vector2(x1m, y));
		}

		// make goal
		double gl = 3000.0 / 2 - 183.0 / 2;
		double gr = 3000.0 / 2 + 183.0 / 2;
		double glm = 3000 + 3000 - gl;
		double grm = 3000 + 3000 - gr;
		goal = new Line(new Vector2(grm, height), new Vector2(glm, height));

		// check the straight line form start to right goal
		Line straight = new Line(start, goal.p1);
		if (isValid(straight))
			return straight.angle();

		System.out.println("not straight");
		// try left and right of each player
		double maxAngle = Double.MIN_VALUE;
		double startAngle = new Line(start, goal.p2).angle();
		double endAngle = new Line(start, goal.p1).angle();

		for (int i = 0; i < players.length; i++)
		{
			Line player = players[i];
			Line l1 = new Line(start, new Vector2(player.p1.x - 0.0000000001, player.p1.y));
			Line l2 = new Line(start, new Vector2(player.p1.x + 0.0000000001, player.p1.y));
			if (l1.angle() >= startAngle && l1.angle() <= endAngle)
				if (isValid(l1))
					maxAngle = Math.max(maxAngle, l1.angle());
			if (l2.angle() >= startAngle && l2.angle() <= endAngle)
				if (isValid(l2))
					maxAngle = Math.max(maxAngle, l2.angle());
			Line l3 = new Line(start, new Vector2(player.p2.x - 0.0000000001, player.p2.y));
			Line l4 = new Line(start, new Vector2(player.p2.x + 0.000000001, player.p2.y));
			if (l3.angle() >= startAngle && l3.angle() <= endAngle)
				if (isValid(l3))
					maxAngle = Math.max(maxAngle, l3.angle());
			if (l4.angle() >= startAngle && l4.angle() <= endAngle)
				if (isValid(l4))
					maxAngle = Math.max(maxAngle, l4.angle());
		}

		System.out.println(maxAngle);
		return maxAngle == Double.MIN_VALUE ? -1 : maxAngle;
	}

	private boolean isValid(Line l)
	{
		// check it doesn't intersect any of the players
		for (int i = 0; i < players.length; i++)
			if (instersects(l, players[i]))
				return false;
		return true;
	}

	private boolean instersects(Line l, Line player)
	{
		// get intersection point
		Vector2 intersection = intersection(l, player);
		if (intersection == null)
			return false;

		// check the point is within the player
		return onLine(intersection, player);
	}

	private boolean onLine(Vector2 point, Line line)
	{
		boolean onX = Math.min(line.p1.x, line.p2.x) <= point.x + e
				&& point.x <= Math.max(line.p1.x, line.p2.x) + e;
		return onX;
	}

	public Vector2 intersection(Line l1, Line l2)
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

class Vector2
{
	double x, y;

	public Vector2(double x, double y)
	{
		this.x = x;
		this.y = y;
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

	public double angle()
	{
		double dx = p2.x - p1.x;
		double dy = p2.y - p1.y;
		double angle = Math.atan2(dy, dx);
		while (angle < 0)
			angle += Math.PI * 2.0;
		return angle * 180.0 / Math.PI;
	}

	public String toString()
	{
		return p1 + "->" + p2;
	}
}
