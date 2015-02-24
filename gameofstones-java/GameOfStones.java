public class GameOfStones
{

	public int count(int[] stones)
	{
		// target number
		int n = stones.length;
		int sum = 0;
		for (int x : stones) 
			sum += x;
		if (sum % n != 0)
			return -1;
		int target = sum / n;

		// count moves
		int moves = 0;
		for (int x : stones) 
		{
			int diff = Math.abs(x - target);
			if (diff % 2 != 0)
				return -1;
			moves += diff / 2;
		}
		
		System.out.println(moves);
		if (moves % 2 != 0)
			return - 1;
		else
			return moves / 2;
	}

}
