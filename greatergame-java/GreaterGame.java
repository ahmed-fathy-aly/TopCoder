import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class GreaterGame
{

	public double calc(int[] hand, int[] sothe)
	{
		// all cards
		HashSet<Integer> allCards = new HashSet<>();
		int n = hand.length;
		for (int i = 1; i <= 2*n; i++) 
			allCards.add(i);
			
		// my hand
		ArrayList<Integer> myCards = new ArrayList<>();
		for (Integer x : hand) 
			myCards.add(x);
		Collections.sort(myCards);
		

		
		// count guaranteed 
		double result = 0;
		for (int i = 0; i < n; i++) 
			if (sothe[i] != -1)
			{
				// use first one that's bigger or smallest one
				int idx = -1;
				for (int j = 0; j < myCards.size(); j++) 
					if (myCards.get(j) > sothe[i])
					{
						idx = j;
						break;
					}
				if (idx != -1 )
				{
					result += 1;
					int dummy = myCards.remove(idx);
				}
				else
					myCards.remove(0);
			}
		
		// find remaining cards
		for (Integer x: hand) 
			allCards.remove(x);
		for (Integer x : sothe) 
			allCards.remove(x);
		ArrayList<Integer> hisRemainingCards = new ArrayList<>(allCards);	

		// count the random expected
		int randomExpected = 0;
		for (int i = 0; i < n; i++) 
			if (sothe[i] == -1)
			{
				int myCard = myCards.remove(0);
				int countLower = 0;
				for (Integer hisCard : hisRemainingCards) 
					if (myCard > hisCard)
						countLower++;
				randomExpected += countLower;
			}
		if (hisRemainingCards.size() > 0)
			result += 1.0 * randomExpected / hisRemainingCards.size();
		return result;
	}

}
