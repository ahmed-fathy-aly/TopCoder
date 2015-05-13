import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromizationDiv2Test {

    protected PalindromizationDiv2 solution;

    @Before
    public void setUp() {
        solution = new PalindromizationDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int X = 25;

        int expected = 3;
        int actual = solution.getMinimumCost(X);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int X = 12321;

        int expected = 0;
        int actual = solution.getMinimumCost(X);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int X = 40;

        int expected = 4;
        int actual = solution.getMinimumCost(X);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int X = 2011;

        int expected = 9;
        int actual = solution.getMinimumCost(X);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int X = 0;

        int expected = 0;
        int actual = solution.getMinimumCost(X);

        Assert.assertEquals(expected, actual);
    }

}
