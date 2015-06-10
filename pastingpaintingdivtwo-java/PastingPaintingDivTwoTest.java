import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PastingPaintingDivTwoTest
{

	protected PastingPaintingDivTwo solution;

	@Before
	public void setUp()
	{
		solution = new PastingPaintingDivTwo();
	}

	@Test(timeout = 2000)
	public void testCase0()
	{
		String[] clipboard = new String[]
		{ "..B", "B..", "BB." };
		int T = 3;

		long expected = 10L;
		long actual = solution.countColors(clipboard, T);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1()
	{
		String[] clipboard = new String[]
		{ "B...", "....", "....", "...B" };
		int T = 2;

		long expected = 4L;
		long actual = solution.countColors(clipboard, T);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2()
	{
		String[] clipboard = new String[]
		{ "BBB" };
		int T = 10000;

		long expected = 30000L;
		long actual = solution.countColors(clipboard, T);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3()
	{
		String[] clipboard = new String[]
		{ "." };
		int T = 1000000000;

		long expected = 0L;
		long actual = solution.countColors(clipboard, T);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4()
	{
		String[] clipboard = new String[]
		{ "BB.", ".B." };
		int T = 100;

		long expected = 201L;
		long actual = solution.countColors(clipboard, T);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5()
	{
		String[] clipboard = new String[]
		{ "..........B..........", ".........B.B.........", "........B...B........",
				".......B.....B.......", "......B..B.B..B......", ".....B...B.B...B.....",
				"....B...........B....", "...B...B.....B...B...", "..B.....BBBBBB....B..",
				".B..........BB.....B.", "BBBBBBBBBBBBBBBBBBBBB" };
		int T = 1000000000;

		long expected = 21000000071L;
		long actual = solution.countColors(clipboard, T);

		Assert.assertEquals(expected, actual);
	}

}
