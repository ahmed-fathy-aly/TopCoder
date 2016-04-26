import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BearCriesTest {

    protected BearCries solution;

    @Before
    public void setUp() {
        solution = new BearCries();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String message = ";_;;_____;";

        int expected = 2;
        int actual = solution.count(message);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String message = ";;;___;;;";

        int expected = 36;
        int actual = solution.count(message);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String message = "_;__;";

        int expected = 0;
        int actual = solution.count(message);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String message = ";_____________________________________;";

        int expected = 1;
        int actual = solution.count(message);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String message = ";__;____;";

        int expected = 0;
        int actual = solution.count(message);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String message = ";_;;__;_;;";

        int expected = 52;
        int actual = solution.count(message);

        Assert.assertEquals(expected, actual);
    }

}
