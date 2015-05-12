import java.util.ArrayList;

public class CatAndRabbit
{

	public String getWinner(String tiles)
	{
		// find white tiles
		ArrayList<Integer> whites = new ArrayList<>();
		int acc = 0;
		for (int i = 0; i < tiles.length(); i++)
			if (tiles.charAt(i) == '#')
			{
				if (acc != 0)
					whites.add(acc);
				acc = 0;
			} else
				acc++;
		if (acc != 0)
			whites.add(acc);

		// find the magic xor
		int magic = 0;
		for (Integer x : whites)
			magic ^= x;

		return magic == 0 || !tiles.contains("#") ? "Rabbit" : "Cat";
	}

}
