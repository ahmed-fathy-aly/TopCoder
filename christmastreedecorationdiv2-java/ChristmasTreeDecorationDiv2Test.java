import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChristmasTreeDecorationDiv2Test {

    protected ChristmasTreeDecorationDiv2 solution;

    @Before
    public void setUp() {
        solution = new ChristmasTreeDecorationDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] col = new int[]{1, 2, 3, 3};
        int[] x = new int[]{1, 2, 3};
        int[] y = new int[]{2, 3, 4};

        int expected = 2;
        int actual = solution.solve(col, x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] col = new int[]{1, 3, 5};
        int[] x = new int[]{1, 3};
        int[] y = new int[]{2, 2};

        int expected = 2;
        int actual = solution.solve(col, x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] col = new int[]{1, 1, 3, 3};
        int[] x = new int[]{1, 3, 2};
        int[] y = new int[]{2, 1, 4};

        int expected = 2;
        int actual = solution.solve(col, x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] col = new int[]{5, 5, 5, 5};
        int[] x = new int[]{1, 2, 3};
        int[] y = new int[]{2, 3, 4};

        int expected = 0;
        int actual = solution.solve(col, x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] col = new int[]{9, 1, 1};
        int[] x = new int[]{3, 2};
        int[] y = new int[]{2, 1};

        int expected = 1;
        int actual = solution.solve(col, x, y);

        Assert.assertEquals(expected, actual);
    }

}
