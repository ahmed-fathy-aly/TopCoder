import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrianglesContainOriginEasyTest {

    protected TrianglesContainOriginEasy solution;

    @Before
    public void setUp() {
        solution = new TrianglesContainOriginEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] x = new int[]{-1, -1, 1};
        int[] y = new int[]{1, -1, 0};

        int expected = 1;
        int actual = solution.count(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] x = new int[]{-1, -1, 1, 2};
        int[] y = new int[]{1, -1, 2, -1};

        int expected = 2;
        int actual = solution.count(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] x = new int[]{-1, -2, 3, 3, 2, 1};
        int[] y = new int[]{-2, -1, 1, 2, 3, 3};

        int expected = 8;
        int actual = solution.count(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] x = new int[]{1, 5, 10, 5, -5, 7, -9, -6, -3, 0, 8, 8, 1, -4, 7, -3, 10, 9, -6};
        int[] y = new int[]{5, -6, -3, 4, -2, -8, -7, 2, 7, 4, 2, 0, -4, -8, 7, 5, -5, -2, -9};

        int expected = 256;
        int actual = solution.count(x, y);

        Assert.assertEquals(expected, actual);
    }

}
