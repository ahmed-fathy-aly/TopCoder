import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GreaterGameDiv2Test {

    protected GreaterGameDiv2 solution;

    @Before
    public void setUp() {
        solution = new GreaterGameDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] snuke = new int[]{1, 3};
        int[] sothe = new int[]{4, 2};

        int expected = 1;
        int actual = solution.calc(snuke, sothe);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] snuke = new int[]{1, 3, 5, 7, 9};
        int[] sothe = new int[]{2, 4, 6, 8, 10};

        int expected = 0;
        int actual = solution.calc(snuke, sothe);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] snuke = new int[]{2};
        int[] sothe = new int[]{1};

        int expected = 1;
        int actual = solution.calc(snuke, sothe);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] snuke = new int[]{3, 5, 9, 16, 14, 20, 15, 17, 13, 2};
        int[] sothe = new int[]{6, 18, 1, 8, 7, 10, 11, 19, 12, 4};

        int expected = 6;
        int actual = solution.calc(snuke, sothe);

        Assert.assertEquals(expected, actual);
    }

}
