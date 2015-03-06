import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChristmasTreeDecorationTest {

    protected ChristmasTreeDecoration solution;

    @Before
    public void setUp() {
        solution = new ChristmasTreeDecoration();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] col = new int[]{1, 1, 2, 2};
        int[] x = new int[]{1, 2, 3, 4};
        int[] y = new int[]{2, 3, 4, 1};

        int expected = 1;
        int actual = solution.solve(col, x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] col = new int[]{1, 1, 2, 2};
        int[] x = new int[]{1, 2, 3, 4, 1, 2};
        int[] y = new int[]{2, 3, 4, 1, 3, 4};

        int expected = 0;
        int actual = solution.solve(col, x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] col = new int[]{50, 50, 50, 50};
        int[] x = new int[]{1, 2, 3, 1, 1, 2};
        int[] y = new int[]{2, 3, 4, 4, 3, 4};

        int expected = 3;
        int actual = solution.solve(col, x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] col = new int[]{1, 4, 2, 3};
        int[] x = new int[]{1, 2, 3};
        int[] y = new int[]{2, 3, 4};

        int expected = 0;
        int actual = solution.solve(col, x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] col = new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4};
        int[] x = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 1, 1, 1, 1, 1};
        int[] y = new int[]{2, 3, 1, 5, 6, 4, 8, 9, 7, 11, 12, 10, 5, 7, 12, 11, 6, 4};

        int expected = 5;
        int actual = solution.solve(col, x, y);

        Assert.assertEquals(expected, actual);
    }

}
