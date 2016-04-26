import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BearPaintsTest {

    protected BearPaints solution;

    @Before
    public void setUp() {
        solution = new BearPaints();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int W = 3;
        int H = 5;
        long M = 14L;

        long expected = 12L;
        long actual = solution.maxArea(W, H, M);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int W = 4;
        int H = 4;
        long M = 10L;

        long expected = 9L;
        long actual = solution.maxArea(W, H, M);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int W = 1000000;
        int H = 12345;
        long M = 1000000000000L;

        long expected = 12345000000L;
        long actual = solution.maxArea(W, H, M);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int W = 1000000;
        int H = 1000000;
        long M = 720000000007L;

        long expected = 720000000000L;
        long actual = solution.maxArea(W, H, M);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int W = 1000000;
        int H = 1000000;
        long M = 999999999999L;

        long expected = 999999000000L;
        long actual = solution.maxArea(W, H, M);

        Assert.assertEquals(expected, actual);
    }

}
