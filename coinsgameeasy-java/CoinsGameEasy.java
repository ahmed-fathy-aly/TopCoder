import java.util.ArrayList;
import java.util.LinkedList;

public class CoinsGameEasy
{

	int possDx[] = new int[]
	{ 1, -1, 0, 0 };
	int possDy[] = new int[]
	{ 0, 0, 1, -1 };
	private int R;
	private int C;
	private boolean[][] g;
	private Cell coin1;
	private Cell coin2;
	private int min;

	public int minimalSteps(String[] board)
	{
		// read board
		R = board.length;
		C = board[0].length();
		g = new boolean[R][C];
		for (int r = 0; r < R; r++)
			for (int c = 0; c < C; c++)
				if (board[r].charAt(c) == '#')
					g[r][c] = true;
				else if (board[r].charAt(c) == 'o')
				{
					if (coin1 == null)
						coin1 = new Cell(r, c);
					else
						coin2 = new Cell(r, c);
				}

		// backtrack
		min = Integer.MAX_VALUE;
		generate(coin1, coin2, 1);
		return min == Integer.MAX_VALUE ? -1 : min;
	}

	private Cell operate(Cell cell, Integer dx, Integer dy)
	{
		int x = cell.x + dx;
		int y = cell.y + dy;
		Cell newCell = new Cell(cell.x, cell.y);
		if (x < 0 || x >= R || y < 0 || y >= C)
		{
			newCell.x = -1;
			newCell.y = -1;
		} else if (!g[x][y])
		{
			newCell.x = x;
			newCell.y = y;
		}
		return newCell;

	}

	private void generate(Cell coin1, Cell coin2, int nMoves)
	{
		// base case
		if (nMoves > 10)
			return;

		// add all directions
		for (int i = 0; i < possDx.length; i++)
		{
			Cell newCoin1 = operate(coin1, possDx[i], possDy[i]);
			Cell newCoin2 = operate(coin2, possDx[i], possDy[i]);
			if (newCoin1.x == -1 && newCoin2.x == -1)
				;
			else if (newCoin1.x == -1 || newCoin2.x == -1)
			{
				min = Math.min(min, nMoves);
				return;
			} else
				generate(newCoin1, newCoin2, nMoves + 1);
		}

	}

}

class Cell
{
	int x, y;

	public Cell(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public String toString()
	{
		return x + " " + y;
	}
}
