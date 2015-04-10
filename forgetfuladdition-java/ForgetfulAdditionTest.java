import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ForgetfulAdditionTest {

    protected ForgetfulAddition solution;

    @Before
    public void setUp() {
        solution = new ForgetfulAddition();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String expression = "22";

        int expected = 4;
        int actual = solution.minNumber(expression);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String expression = "123";

        int expected = 15;
        int actual = solution.minNumber(expression);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String expression = "1289";

        int expected = 101;
        int actual = solution.minNumber(expression);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String expression = "31415926";

        int expected = 9067;
        int actual = solution.minNumber(expression);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String expression = "98765";

        int expected = 863;
        int actual = solution.minNumber(expression);

        Assert.assertEquals(expected, actual);
    }

}
