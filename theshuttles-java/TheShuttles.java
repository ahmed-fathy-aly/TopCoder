public class TheShuttles
{

	public int getLeastCost(int[] cnt, int baseCost, int seatCost)
	{
		// try all number of seats
		int min = Integer.MAX_VALUE;
		for (int nSeats = 1; nSeats <= 100; nSeats++) 
		{
			int sum = 0;
			int costPerShuttle = baseCost + nSeats*seatCost;
			for (int station : cnt) 
				sum += Math.ceil(1.0 * station / nSeats) *costPerShuttle;
			min = Math.min(min, sum);
		}
		return min;
	}

}
