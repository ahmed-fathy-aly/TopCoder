import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DivideAndShiftTest {

    protected DivideAndShift solution;

    @Before
    public void setUp() {
        solution = new DivideAndShift();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 56;
        int M = 14;

        int expected = 3;
        int actual = solution.getLeast(N, M);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 49;
        int M = 5;

        int expected = 2;
        int actual = solution.getLeast(N, M);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 256;
        int M = 7;

        int expected = 6;
        int actual = solution.getLeast(N, M);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 6;
        int M = 1;

        int expected = 0;
        int actual = solution.getLeast(N, M);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int N = 77777;
        int M = 11111;

        int expected = 2;
        int actual = solution.getLeast(N, M);

        Assert.assertEquals(expected, actual);
    }

}
