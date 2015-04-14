public class QuizShow
{

	public int wager(int[] scores, int wager1, int wager2)
	{
		int bestProbability = -1;
		int bestWager = -1;
		for (int x = 0; x <= scores[0]; x++)
		{
			int p = probability(x, scores, wager1, wager2);
			if (p > bestProbability)
			{

				bestWager = x;
				bestProbability = p;
			}
		}

		return bestWager;

	}

	private int probability(int x, int[] scores, int wager1, int wager2)
	{
		// try all cases
		int countWin = 0;
		for (int meRight = 0; meRight < 2; meRight++)
			for (int secondRight = 0; secondRight < 2; secondRight++)
				for (int thirdRight = 0; thirdRight < 2; thirdRight++)
				{
					int myScore = meRight == 1 ? scores[0] + x : scores[0] - x;
					int secondScore = secondRight == 1 ? scores[1] + wager1 : scores[1] - wager1;
					int thirdScore = thirdRight == 1 ? scores[2] + wager2 : scores[2] - wager2;
					if (myScore > secondScore && myScore > thirdScore)
						countWin++;
				}
		return countWin;
	}

}
