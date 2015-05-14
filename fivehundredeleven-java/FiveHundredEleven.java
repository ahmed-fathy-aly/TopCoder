import java.sql.NClob;

public class FiveHundredEleven
{

	private int n;
	private int m;
	private boolean[][] dp;
	private boolean[][] solved;
	private int[] cards;

	public String theWinner(int[] cards)
	{
		// clear m
		n = cards.length;
		m = 511;
		dp = new boolean[m + 1][n + 1];
		solved = new boolean[m + 1][n + 1];
		this.cards = cards;
		return win(0, n) ? "Fox Ciel" : "Toastman";
	}

	private boolean win(int mem, int remCards)
	{
		// base case
		if (mem == 511)
			return true;
		if (remCards == 0)
			return false;
		if (solved[mem][remCards])
			return dp[mem][remCards];

		// select any card that hasn't been played
		boolean win = false;
		for (int card : cards)
			if ((card | mem) != mem)
				win |= !win(mem | card, remCards - 1);

		// select a card that may or maynot have been played, 
		// if count of those that wont affect is more than those player
		int count = 0;
		for (int card : cards) 
			if ((card | mem) == mem)
				count ++;
		if (count > n - remCards)
			win |= !win(mem, remCards-1);
		
		solved[mem][remCards] = true;
		dp[mem][remCards] = win;
		return win;
	}

}
