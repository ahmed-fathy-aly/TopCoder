import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheAlmostLuckyNumbersDivOneTest {

    protected TheAlmostLuckyNumbersDivOne solution;

    @Before
    public void setUp() {
        solution = new TheAlmostLuckyNumbersDivOne();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        long a = 4L;
        long b = 7L;

        long expected = 4L;
        long actual = solution.find(a, b);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        long a = 8L;
        long b = 19L;

        long expected = 4L;
        long actual = solution.find(a, b);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        long a = 28L;
        long b = 33L;

        long expected = 0L;
        long actual = solution.find(a, b);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        long a = 12345678900L;
        long b = 98765432100L;

        long expected = 91136L;
        long actual = solution.find(a, b);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase4() {
        long a = 1;
        long b = 1000000000000l;

        long expected = 91136L;
        long actual = solution.find(a, b);

        Assert.assertEquals(expected, actual);
    }

}
