import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetPartialOrderTest {

    protected SetPartialOrder solution;

    @Before
    public void setUp() {
        solution = new SetPartialOrder();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] a = new int[]{1, 2, 3, 5, 8};
        int[] b = new int[]{8, 5, 1, 3, 2};

        String expected = "EQUAL";
        String actual = solution.compareSets(a, b);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] a = new int[]{2, 3, 5, 7};
        int[] b = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        String expected = "LESS";
        String actual = solution.compareSets(a, b);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] a = new int[]{2, 4, 6, 8, 10, 12, 14, 16};
        int[] b = new int[]{2, 4, 8, 16};

        String expected = "GREATER";
        String actual = solution.compareSets(a, b);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] a = new int[]{42, 23, 17};
        int[] b = new int[]{15, 23, 31};

        String expected = "INCOMPARABLE";
        String actual = solution.compareSets(a, b);

        Assert.assertEquals(expected, actual);
    }

}
