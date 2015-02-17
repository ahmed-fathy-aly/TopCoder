import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuadraticLawTest {

    protected QuadraticLaw solution;

    @Before
    public void setUp() {
        solution = new QuadraticLaw();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        long d = 1L;

        long expected = 0L;
        long actual = solution.getTime(d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        long d = 2L;

        long expected = 1L;
        long actual = solution.getTime(d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        long d = 5L;

        long expected = 1L;
        long actual = solution.getTime(d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        long d = 6L;

        long expected = 2L;
        long actual = solution.getTime(d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        long d = 7L;

        long expected = 2L;
        long actual = solution.getTime(d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        long d = 1482L;

        long expected = 38L;
        long actual = solution.getTime(d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        long d = 1000000000000000000L;

        long expected = 999999999L;
        long actual = solution.getTime(d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase7() {
        long d = 31958809614643170L;

        long expected = 178770270L;
        long actual = solution.getTime(d);

        Assert.assertEquals(expected, actual);
    }

}
