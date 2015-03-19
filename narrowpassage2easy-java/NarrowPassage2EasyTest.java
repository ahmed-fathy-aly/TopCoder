import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NarrowPassage2EasyTest {

    protected NarrowPassage2Easy solution;

    @Before
    public void setUp() {
        solution = new NarrowPassage2Easy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] size = new int[]{1, 2, 3};
        int maxSizeSum = 3;

        int expected = 2;
        int actual = solution.count(size, maxSizeSum);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] size = new int[]{1, 2, 3};
        int maxSizeSum = 1000;

        int expected = 6;
        int actual = solution.count(size, maxSizeSum);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] size = new int[]{1, 2, 3};
        int maxSizeSum = 4;

        int expected = 3;
        int actual = solution.count(size, maxSizeSum);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] size = new int[]{1, 1, 1, 1, 1, 1};
        int maxSizeSum = 2;

        int expected = 720;
        int actual = solution.count(size, maxSizeSum);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] size = new int[]{2, 4, 6, 1, 3, 5};
        int maxSizeSum = 8;

        int expected = 60;
        int actual = solution.count(size, maxSizeSum);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] size = new int[]{1000};
        int maxSizeSum = 1000;

        int expected = 1;
        int actual = solution.count(size, maxSizeSum);

        Assert.assertEquals(expected, actual);
    }

}
