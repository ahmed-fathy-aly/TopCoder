import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParallelSpeedupTest {

    protected ParallelSpeedup solution;

    @Before
    public void setUp() {
        solution = new ParallelSpeedup();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int k = 12;
        int overhead = 1;

        int expected = 2;
        int actual = solution.numProcessors(k, overhead);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int k = 50;
        int overhead = 3;

        int expected = 3;
        int actual = solution.numProcessors(k, overhead);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int k = 9;
        int overhead = 10;

        int expected = 1;
        int actual = solution.numProcessors(k, overhead);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int k = 3333;
        int overhead = 2;

        int expected = 12;
        int actual = solution.numProcessors(k, overhead);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int k = 1000000;
        int overhead = 4;

        int expected = 63;
        int actual = solution.numProcessors(k, overhead);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase5() {
        int k = 1000000;
        int overhead = 2;

        int expected = 80;
        int actual = solution.numProcessors(k, overhead);

        Assert.assertEquals(expected, actual);
    }

}
