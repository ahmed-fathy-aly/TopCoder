import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberGameAgainTest
{

	protected NumberGameAgain solution;

	@Before
	public void setUp()
	{
		solution = new NumberGameAgain();
	}

	@Test(timeout = 2000)
	public void testCase0()
	{
		int k = 3;
		long[] table = new long[]
		{ 2L, 4L, 6L };

		long expected = 2L;
		long actual = solution.solve(k, table);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1()
	{
		int k = 5;
		long[] table = new long[]
		{ 2L, 3L };

		long expected = 0L;
		long actual = solution.solve(k, table);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2()
	{
		int k = 5;
		long[] table = new long[]
		{};

		long expected = 30L;
		long actual = solution.solve(k, table);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3()
	{
		int k = 40;
		long[] table = new long[]
		{ 2L, 4L, 8L, 16L, 32141531L, 2324577L, 1099511627775L, 2222222222L, 33333333333L,
				4444444444L, 2135L };

		long expected = 549755748288L;
		long actual = solution.solve(k, table);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4()
	{
		int k = 40;
		long[] table = new long[]
		{};

		long expected = 1099511627774L;
		long actual = solution.solve(k, table);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
    public void testCase5() {
        int k = 40;
        long[] table = new long[]{};

        long expected = 2842555;
        long actual = solution.solve(    22, new long[]{456, 1369504, 22, 1023, 29, 759570, 3120819, 21, 1369469, 31, 2899250, 898, 10, 77851, 392, 518634, 2720592, 1208313, 2066001});

        Assert.assertEquals(expected, actual);
    }
}
