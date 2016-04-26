import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BearDartsTest
{

	protected BearDarts solution;

	@Before
	public void setUp()
	{
		solution = new BearDarts();
	}

	@Test(timeout = 2000)
	public void testCase0()
	{
		int[] w = new int[]
		{ 6, 8, 4, 3, 6 };

		long expected = 2L;
		long actual = solution.count(w);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1()
	{
		int[] w = new int[]
		{ 3, 4, 12, 1 };

		long expected = 0L;
		long actual = solution.count(w);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2()
	{
		int[] w = new int[]
		{ 42, 1000000, 1000000, 42, 1000000, 1000000 };

		long expected = 3L;
		long actual = solution.count(w);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3()
	{
		int[] w = new int[]
		{ 1, 1, 1, 1, 1 };

		long expected = 5L;
		long actual = solution.count(w);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4()
	{
		int[] w = new int[]
		{ 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1 };

		long expected = 22L;
		long actual = solution.count(w);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5()
	{
		int[] w = new int[]
		{ 33554432, 33554432, 67108864, 134217728 };

		long expected = 0L;
		long actual = solution.count(w);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 6000)
	public void testCase6()
	{
		int[] w = new int[]
		{ 279417600, 167650560, 119750400, 419126400, 419126400, 279417600, 209563200, 419126400, 419126400, 419126400,
				76204800, 76204800, 167650560, 119750400, 167650560, 209563200, 279417600, 76204800, 419126400,
				119750400, 76204800, 119750400, 419126400, 76204800, 419126400, 279417600, 76204800, 209563200,
				76204800, 167650560, 419126400, 419126400, 76204800, 279417600, 119750400, 76204800, 167650560,
				209563200, 279417600, 209563200, 419126400, 419126400, 419126400, 209563200, 119750400, 419126400,
				419126400, 419126400, 76204800, 419126400, 76204800, 76204800, 209563200, 167650560, 76204800,
				279417600, 76204800, 119750400, 76204800, 167650560, 76204800, 419126400, 76204800, 209563200, 76204800,
				167650560, 76204800, 167650560, 209563200, 279417600, 167650560, 279417600, 119750400, 119750400,
				209563200, 76204800, 419126400, 119750400, 209563200, 167650560, 119750400, 279417600, 209563200,
				209563200, 279417600, 76204800, 419126400, 38102400, 209563200, 76204800, 167650560, 76204800,
				419126400, 209563200, 119750400, 76204800, 419126400, 76204800, 279417600, 119750400, 119750400,
				119750400, 76204800, 119750400, 279417600, 419126400, 167650560, 167650560, 279417600, 419126400,
				167650560, 279417600, 209563200, 419126400, 76204800, 419126400, 167650560, 76204800, 419126400,
				76204800, 167650560, 419126400, 209563200, 119750400, 209563200, 419126400, 279417600, 279417600,
				119750400, 119750400, 167650560, 167650560, 119750400, 119750400, 119750400, 76204800, 209563200,
				76204800, 279417600, 279417600, 119750400, 209563200, 76204800, 119750400, 279417600, 76204800,
				279417600, 209563200, 167650560, 209563200, 279417600, 119750400, 119750400, 279417600, 167650560,
				167650560, 279417600, 209563200, 76204800, 119750400, 419126400, 167650560, 279417600, 209563200,
				419126400, 119750400, 167650560, 119750400, 209563200, 419126400, 279417600, 209563200, 119750400,
				119750400, 209563200, 167650560, 119750400, 119750400, 119750400, 167650560, 419126400, 76204800,
				76204800, 209563200, 76204800, 167650560, 419126400, 279417600, 167650560, 279417600, 209563200,
				419126400, 209563200, 209563200, 279417600, 167650560, 209563200, 279417600, 419126400, 279417600,
				419126400, 209563200, 419126400, 419126400, 209563200, 279417600, 279417600, 167650560, 119750400,
				209563200, 119750400, 419126400, 209563200, 209563200, 279417600, 279417600, 209563200, 209563200,
				419126400, 76204800, 119750400, 419126400, 76204800, 209563200, 279417600, 419126400, 167650560,
				279417600, 167650560, 167650560, 119750400, 76204800, 209563200, 76204800, 119750400, 419126400,
				76204800, 419126400, 119750400, 76204800, 167650560, 419126400, 279417600, 209563200, 279417600,
				279417600, 419126400, 25401600, 209563200, 209563200, 419126400, 419126400, 279417600, 209563200,
				209563200, 76204800, 119750400, 419126400, 76204800, 76204800, 419126400, 279417600, 76204800,
				167650560, 119750400, 76204800, 119750400, 279417600, 167650560, 167650560, 209563200, 279417600,
				209563200, 119750400, 419126400, 209563200, 119750400, 279417600, 209563200, 279417600, 209563200,
				167650560, 209563200, 209563200, 209563200, 419126400, 76204800, 419126400, 83825280, 209563200,
				279417600, 279417600, 209563200, 76204800, 279417600, 76204800, 119750400, 119750400, 279417600,
				167650560, 167650560, 119750400, 76204800, 119750400, 167650560, 76204800, 279417600, 167650560,
				209563200, 76204800, 119750400, 119750400, 419126400, 279417600, 167650560, 279417600, 419126400,
				209563200, 167650560, 76204800, 209563200, 279417600, 167650560, 167650560, 167650560, 209563200,
				119750400, 419126400, 167650560, 167650560, 167650560, 119750400, 279417600, 209563200, 279417600,
				279417600, 279417600, 76204800, 279417600, 76204800, 279417600, 119750400, 119750400, 119750400,
				167650560, 119750400, 76204800, 279417600, 119750400, 76204800, 167650560, 279417600, 119750400,
				279417600, 419126400, 76204800, 76204800, 279417600, 167650560, 209563200, 167650560, 76204800,
				167650560, 279417600, 279417600, 119750400, 419126400, 279417600, 119750400, 119750400, 209563200,
				167650560, 119750400, 419126400, 419126400, 419126400, 419126400, 279417600, 167650560, 279417600,
				167650560, 167650560, 167650560, 419126400, 419126400, 167650560, 209563200, 76204800, 119750400,
				76204800, 167650560, 279417600, 76204800, 76204800, 279417600, 209563200, 119750400, 419126400,
				119750400, 419126400, 76204800, 76204800, 419126400, 279417600, 76204800, 55883520, 119750400,
				279417600, 76204800, 119750400, 119750400, 209563200, 279417600, 76204800, 59875200, 167650560,
				76204800, 209563200, 167650560, 76204800, 209563200, 119750400, 167650560, 209563200, 167650560,
				167650560, 76204800, 76204800, 167650560, 209563200, 419126400, 76204800, 419126400, 419126400,
				419126400, 209563200, 419126400, 167650560, 76204800, 76204800, 279417600, 167650560, 419126400,
				279417600, 279417600, 279417600, 167650560, 167650560, 419126400, 167650560, 419126400, 419126400,
				419126400, 209563200, 76204800, 119750400, 209563200, 279417600, 279417600, 279417600, 167650560,
				209563200, 167650560, 419126400, 167650560, 279417600, 167650560, 279417600, 209563200, 209563200,
				167650560, 167650560, 76204800, 279417600, 209563200, 76204800, 119750400, 167650560, 76204800,
				279417600, 279417600, 167650560, 167650560, 76204800, 209563200, 209563200, 119750400, 167650560,
				279417600, 279417600, 419126400, 119750400, 167650560, 119750400, 419126400, 167650560, 209563200,
				167650560, 119750400, 119750400, 279417600, 119750400, 279417600, 419126400, 119750400, 167650560,
				419126400, 76204800, 419126400, 119750400, 419126400, 119750400, 119750400, 209563200, 209563200,
				167650560, 209563200, 167650560, 419126400, 76204800, 119750400, 76204800, 279417600, 119750400,
				419126400, 209563200, 209563200, 167650560, 167650560, 76204800, 76204800, 167650560, 119750400,
				209563200, 119750400, 279417600, 76204800, 209563200, 119750400, 209563200, 209563200, 419126400,
				119750400, 419126400, 167650560, 419126400, 279417600, 209563200, 119750400, 119750400, 209563200,
				76204800, 167650560, 167650560, 76204800, 209563200, 76204800, 209563200, 419126400, 279417600,
				119750400, 419126400, 279417600, 119750400, 209563200, 76204800, 119750400, 119750400, 167650560,
				209563200, 119750400, 76204800, 419126400, 279417600, 167650560, 119750400, 167650560, 209563200,
				76204800, 167650560, 167650560, 76204800, 119750400, 419126400, 209563200, 119750400, 419126400,
				119750400, 419126400, 119750400, 279417600, 119750400, 279417600, 279417600, 419126400, 419126400,
				167650560, 119750400, 279417600, 119750400, 119750400, 419126400, 167650560, 279417600, 279417600,
				209563200, 209563200, 419126400, 279417600, 209563200, 167650560, 167650560, 279417600, 76204800,
				279417600, 419126400, 279417600, 419126400, 167650560, 209563200, 419126400, 419126400, 419126400,
				209563200, 119750400, 209563200, 209563200, 76204800, 279417600, 167650560, 167650560, 119750400,
				279417600, 209563200, 279417600, 419126400, 76204800, 419126400, 279417600, 167650560, 209563200,
				76204800, 76204800, 209563200, 119750400, 209563200, 119750400, 76204800, 209563200, 167650560,
				209563200, 167650560, 419126400, 209563200, 279417600, 119750400, 209563200, 209563200, 167650560,
				76204800, 167650560, 209563200, 209563200, 76204800, 167650560, 167650560, 209563200, 167650560,
				279417600, 419126400, 119750400, 119750400, 419126400, 119750400, 419126400, 209563200, 419126400,
				419126400, 209563200, 279417600, 167650560, 167650560, 279417600, 209563200, 119750400, 419126400,
				279417600, 167650560, 279417600, 167650560, 209563200, 419126400, 209563200, 119750400, 279417600,
				119750400, 279417600, 209563200, 76204800, 167650560, 76204800, 209563200, 119750400, 167650560,
				119750400, 76204800, 279417600, 279417600, 76204800, 209563200, 167650560, 76204800, 279417600,
				167650560, 419126400, 419126400, 279417600, 419126400, 167650560, 76204800, 209563200, 419126400,
				119750400, 167650560, 76204800, 167650560, 279417600, 167650560, 209563200, 209563200, 209563200,
				167650560, 419126400, 279417600, 279417600, 76204800, 419126400, 167650560, 419126400, 119750400,
				119750400, 209563200, 209563200, 209563200, 76204800, 419126400, 119750400, 419126400, 76204800,
				76204800, 279417600, 167650560, 119750400, 167650560, 119750400, 279417600, 10886400, 167650560,
				76204800, 167650560, 279417600, 119750400, 419126400, 419126400, 119750400, 279417600, 167650560,
				167650560, 167650560, 167650560, 167650560, 279417600, 209563200, 167650560, 419126400, 419126400,
				167650560, 167650560, 279417600, 167650560, 119750400, 167650560, 76204800, 119750400, 76204800,
				209563200, 279417600, 167650560, 419126400, 76204800, 279417600, 419126400, 419126400, 119750400,
				76204800, 279417600, 279417600, 279417600, 167650560, 209563200, 76204800, 76204800, 279417600,
				209563200, 76204800, 419126400, 39916800, 119750400, 76204800, 209563200, 76204800, 76204800, 76204800,
				419126400, 119750400, 209563200, 76204800, 76204800, 209563200, 167650560, 419126400, 119750400,
				209563200, 419126400, 209563200, 167650560, 167650560, 209563200, 209563200, 119750400, 419126400,
				209563200, 41912640, 279417600, 76204800, 279417600, 76204800, 167650560, 76204800, 76204800, 76204800,
				279417600, 76204800, 419126400, 76204800, 76204800, 279417600, 119750400, 119750400, 167650560,
				76204800, 167650560, 167650560, 119750400, 279417600, 76204800, 419126400, 279417600, 279417600,
				119750400, 167650560, 279417600, 279417600, 209563200, 167650560, 76204800, 76204800, 83825280,
				279417600, 209563200, 279417600, 119750400, 167650560, 119750400, 119750400, 209563200, 76204800,
				209563200, 119750400, 209563200, 279417600, 76204800, 76204800, 209563200, 119750400, 76204800,
				279417600, 209563200, 167650560, 209563200, 419126400, 119750400, 76204800, 419126400, 167650560,
				209563200, 167650560, 119750400, 76204800, 119750400, 167650560, 209563200, 167650560, 209563200,
				209563200, 167650560, 119750400, 279417600, 119750400, 119750400, 119750400, 167650560, 167650560,
				119750400, 167650560, 167650560, 167650560, 167650560, 279417600, 209563200, 167650560, 419126400,
				279417600, 76204800, 119750400, 119750400, 76204800, 279417600, 76204800, 167650560, 76204800,
				279417600, 419126400, 167650560, 209563200, 209563200, 119750400, 419126400, 167650560, 167650560,
				279417600, 279417600, 209563200, 279417600, 209563200, 167650560, 279417600, 76204800, 419126400,
				167650560, 279417600, 119750400, 119750400, 76204800, 167650560, 76204800, 279417600, 76204800,
				279417600, 119750400, 167650560, 279417600, 167650560, 76204800, 209563200, 209563200, 167650560,
				209563200, 119750400, 419126400, 419126400, 419126400, 419126400, 419126400, 76204800, 119750400,
				209563200, 167650560, 76204800, 119750400, 76204800, 76204800, 167650560, 209563200, 167650560,
				279417600, 167650560, 119750400, 76204800, 119750400, 119750400, 279417600, 419126400, 419126400,
				119750400, 167650560, 167650560, 167650560, 419126400, 167650560 };

		long expected = 2035894458L;
		long actual = solution.count(w);

		Assert.assertEquals(expected, actual);
	}

}
