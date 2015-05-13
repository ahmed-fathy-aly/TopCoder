import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class YetAnotherORProblem2Test {

    protected YetAnotherORProblem2 solution;

    @Before
    public void setUp() {
        solution = new YetAnotherORProblem2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 2;
        int R = 2;

        int expected = 7;
        int actual = solution.countSequences(N, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 2;
        int R = 3;

        int expected = 9;
        int actual = solution.countSequences(N, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 3;
        int R = 3;

        int expected = 16;
        int actual = solution.countSequences(N, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 7;
        int R = 1023;

        int expected = 73741815;
        int actual = solution.countSequences(N, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int N = 2;
        int R = 1;

        int expected = 3;
        int actual = solution.countSequences(N, R);

        Assert.assertEquals(expected, actual);
    }

}
