import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BearDestroysDiv2Test {

    protected BearDestroysDiv2 solution;

    @Before
    public void setUp() {
        solution = new BearDestroysDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int W = 4;
        int H = 3;
        int MOD = 999999937;

        int expected = 24064;
        int actual = solution.sumUp(W, H, MOD);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int W = 3;
        int H = 4;
        int MOD = 999999937;

        int expected = 24576;
        int actual = solution.sumUp(W, H, MOD);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int W = 2;
        int H = 20;
        int MOD = 584794877;

        int expected = 190795689;
        int actual = solution.sumUp(W, H, MOD);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int W = 5;
        int H = 10;
        int MOD = 3;

        int expected = 2;
        int actual = solution.sumUp(W, H, MOD);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int W = 1;
        int H = 1;
        int MOD = 19;

        int expected = 0;
        int actual = solution.sumUp(W, H, MOD);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int W = 7;
        int H = 40;
        int MOD = 312880987;

        int expected = 256117818;
        int actual = solution.sumUp(W, H, MOD);

        Assert.assertEquals(expected, actual);
    }

}
