import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShadowSculptureTest
{

	protected ShadowSculpture solution;

	@Before
	public void setUp()
	{
		solution = new ShadowSculpture();
	}

	@Test(timeout = 2000)
	public void testCase0()
	{
		String[] XY = new String[]
		{ "YN", "NN" };
		String[] YZ = new String[]
		{ "YN", "NN" };
		String[] ZX = new String[]
		{ "YN", "NN" };

		String expected = "Possible";
		String actual = solution.possible(XY, YZ, ZX);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1()
	{
		String[] XY = new String[]
		{ "YN", "NY" };
		String[] YZ = new String[]
		{ "YN", "NY" };
		String[] ZX = new String[]
		{ "YN", "NY" };

		String expected = "Impossible";
		String actual = solution.possible(XY, YZ, ZX);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2()
	{
		String[] XY = new String[]
		{ "YYY", "YNY", "YYY" };
		String[] YZ = new String[]
		{ "YYY", "YNY", "YYY" };
		String[] ZX = new String[]
		{ "YYY", "YNY", "YYY" };

		String expected = "Possible";
		String actual = solution.possible(XY, YZ, ZX);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3()
	{
		String[] XY = new String[]
		{ "YYY", "YNY", "YYY" };
		String[] YZ = new String[]
		{ "NYY", "YNY", "YYY" };
		String[] ZX = new String[]
		{ "YYY", "YNY", "YYN" };

		String expected = "Impossible";
		String actual = solution.possible(XY, YZ, ZX);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4()
	{
		String[] XY = new String[]
		{ "Y" };
		String[] YZ = new String[]
		{ "N" };
		String[] ZX = new String[]
		{ "N" };

		String expected = "Impossible";
		String actual = solution.possible(XY, YZ, ZX);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5()
	{

		String expected = "Possible";
		String actual = solution.possible(new String[]
		{ "YYYYY", "YYNYY", "YYYYY", "YYNYY", "YYYYY" }, new String[]
		{ "YYYYY", "YYNYY", "YYYYY", "YYNYY", "YYYYY" }, new String[]
		{ "YYYYY", "YYNYY", "YYYYY", "YYNYY", "YYYYY" });

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase6()
	{

		String expected = "Possible";
		String actual = solution.possible(new String[]
		{ "NYYYYYYY", "NYYYYYYY", "YNYYYNYY", "YYYYYYYN", "YYYYYYNY", "YYNYYYYY", "YYYYYNYN",
				"YYNNYYYY" }, new String[]
		{ "YYYYYYYY", "YNYYNYYY", "YNYYYYYY", "NYYYYYYY", "YYYYYNYY", "YYNYYYYY", "YYYNYNYN",
				"YYYYYYYY" }, new String[]
		{ "YNYYYYYY", "YNYYNYYY", "YYYNYYNN", "YYNYNYNY", "YNYYNYYY", "YYYYYYYN", "YYYYYYNN",
				"NNYYYYYY" });

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase7()
	{

		String expected = "Possible";
		String actual = solution.possible(new String[]
		{ "YYY", "YYY", "YNY" }, new String[]
		{ "YYY", "YYY", "YNY" }, new String[]
		{ "YNY", "YYY", "YYY" });

		Assert.assertEquals(expected, actual);
	}

}
