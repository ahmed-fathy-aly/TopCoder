import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DivFreed2Test {

    protected DivFreed2 solution;

    @Before
    public void setUp() {
        solution = new DivFreed2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int n = 2;
        int k = 2;

        int expected = 3;
        int actual = solution.count(n, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int n = 9;
        int k = 1;

        int expected = 1;
        int actual = solution.count(n, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int n = 3;
        int k = 3;

        int expected = 15;
        int actual = solution.count(n, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int n = 1;
        int k = 107;

        int expected = 107;
        int actual = solution.count(n, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int n = 2;
        int k = 10;

        int expected = 83;
        int actual = solution.count(n, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int n = 2;
        int k = 1234;

        int expected = 1515011;
        int actual = solution.count(n, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int n = 3;
        int k = 8;

        int expected = 326;
        int actual = solution.count(n, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase7() {
        int n = 10;
        int k = 100000;

        int expected = 526882214;
        int actual = solution.count(n, k);

        Assert.assertEquals(expected, actual);
    }

}
