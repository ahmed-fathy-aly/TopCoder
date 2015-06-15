import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DivisibleSequenceTest {

    protected DivisibleSequence solution;

    @Before
    public void setUp() {
        solution = new DivisibleSequence();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 5;
        int H = 3;

        int expected = 3;
        int actual = solution.count(N, H);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 6;
        int H = 3;

        int expected = 9;
        int actual = solution.count(N, H);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 10;
        int H = 2;

        int expected = 4;
        int actual = solution.count(N, H);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 1;
        int H = 10000;

        int expected = 1;
        int actual = solution.count(N, H);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int N = 30;
        int H = 4;

        int expected = 64;
        int actual = solution.count(N, H);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int N = 25883;
        int H = 100000;

        int expected = 991000009;
        int actual = solution.count(N, H);

        Assert.assertEquals(expected, actual);
    }
    @Test(timeout = 2000)
    public void testCase6() {
        int N = 12;
        int H = 18;

        int expected = 18;
        int actual = solution.count(N, H);

        Assert.assertEquals(expected, actual);
    }

}
