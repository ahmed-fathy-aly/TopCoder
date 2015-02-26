import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConnectingGameDiv2Test
{

	protected ConnectingGameDiv2 solution;

	@Before
	public void setUp()
	{
		solution = new ConnectingGameDiv2();
	}

	@Test(timeout = 2000)
	public void testCase0()
	{
		String[] board = new String[]
		{ "AA", "BC" };

		int expected = 2;
		int actual = solution.getmin(board);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1()
	{
		String[] board = new String[]
		{ "AAB", "ACD", "CCD" };

		int expected = 4;
		int actual = solution.getmin(board);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2()
	{
		String[] board = new String[]
		{ "iii", "iwi", "iii" };

		int expected = 8;
		int actual = solution.getmin(board);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3()
	{
		String[] board = new String[]
		{ "rng58", "Snuke", "Sothe" };

		int expected = 6;
		int actual = solution.getmin(board);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4()
	{
		String[] board = new String[]
		{ "yyAArJqjWTH5", "yyEEruYYWTHG", "hooEvutpkkb2", "OooNgFFF9sbi", "RRMNgFL99Vmm",
				"R76XgFF9dVVV", "SKnZUPf88Vee" };

		int expected = 14;
		int actual = solution.getmin(board);

		Assert.assertEquals(expected, actual);
	}

}
