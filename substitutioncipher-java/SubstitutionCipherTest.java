import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubstitutionCipherTest
{

	protected SubstitutionCipher solution;

	@Before
	public void setUp()
	{
		solution = new SubstitutionCipher();
	}

	@Test(timeout = 2000)
	public void testCase0()
	{
		String a = "CAT";
		String b = "DOG";
		String y = "GOD";

		String expected = "TAC";
		String actual = solution.decode(a, b, y);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1()
	{
		String a = "BANANA";
		String b = "METETE";
		String y = "TEMP";

		String expected = "";
		String actual = solution.decode(a, b, y);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2()
	{
		String a = "THEQUICKBROWNFOXJUMPSOVERTHELAZYHOG";
		String b = "UIFRVJDLCSPXOGPYKVNQTPWFSUIFMBAZIPH";
		String y = "DIDYOUNOTICESKIPPEDLETTER";

		String expected = "CHCXNTMNSHBDRJHOODCKDSSDQ";
		String actual = solution.decode(a, b, y);

		Assert.assertEquals(expected, actual);
	}

}
