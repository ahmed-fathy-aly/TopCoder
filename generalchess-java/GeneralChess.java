import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class GeneralChess
{

	int[] dx = new int[]
	{ 2, 2, 1, 1, -2, -2, -1, -1 };
	int[] dy = new int[]
	{ 1, -1, 2, -2, 1, -1, 2, -2 };

	public String[] attackPositions(String[] pieces)
	{
		// parse the pieces
		ArrayList<Cell> knights = new ArrayList<>();
		for (String str : pieces) 
		{
			StringTokenizer tok = new StringTokenizer(str, ",");
			int r = Integer.parseInt(tok.nextToken());
			int c = Integer.parseInt(tok.nextToken());
			knights.add(new Cell(r, c));
		}
		
		// get the peices that threaten the first one
		Cell first = knights.get(0);
		ArrayList<Cell> possible = new ArrayList<>();
		for (int i = 0; i < 8; i++) 
		{
			int r = first.r + dx[i];
			int c = first.c + dy[i];
			possible.add(new Cell(r, c));
		}
		
		// check which of them threatens all
		ArrayList<Cell> result = new ArrayList<>();
		for (Cell cell : possible) 
		{
			boolean threatAll = true;
			for (Cell knight : knights) 
			{
				boolean threats = false;
				for (int i = 0; i < 8; i++) 
					if (cell.r - knight.r == dx[i] && cell.c - knight.c == dy[i])
						threats = true;
				if (!threats)
					threatAll = false;
			}
			if (threatAll)
				result.add(cell);
		}
		
			// sort
		Collections.sort(result, new Comparator<Cell>()
		{

			@Override
			public int compare(Cell c1, Cell c2)
			{
				if (Integer.compare(c1.r, c2.r) != 0)
					return Integer.compare(c1.r, c2.r);
				else
					return Integer.compare(c1.c, c2.c);
			}
		});
		
		// output
		String resultStrs[] = new String[result.size()];
		for (int i = 0; i < result.size(); i++) 
			resultStrs[i] = result.get(i).r + "," + result.get(i).c;
		return resultStrs;
	}



}

class Cell
{
	int r, c;

	public Cell(int r, int c)
	{
		this.r = r;
		this.c = c;
	}
}