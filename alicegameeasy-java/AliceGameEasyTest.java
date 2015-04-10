import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AliceGameEasyTest {

    protected AliceGameEasy solution;

    @Before
    public void setUp() {
        solution = new AliceGameEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        long x = 7L;
        long y = 14L;

        long expected = 2L;
        long actual = solution.findMinimumValue(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        long x = 10L;
        long y = 0L;

        long expected = 4L;
        long actual = solution.findMinimumValue(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        long x = 932599670050L;
        long y = 67400241741L;

        long expected = 1047062L;
        long actual = solution.findMinimumValue(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        long x = 7L;
        long y = 13L;

        long expected = -1L;
        long actual = solution.findMinimumValue(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        long x = 0L;
        long y = 0L;

        long expected = 0L;
        long actual = solution.findMinimumValue(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        long x = 100000L;
        long y = 400500L;

        long expected = 106L;
        long actual = solution.findMinimumValue(x, y);

        Assert.assertEquals(expected, actual);
    }

}
