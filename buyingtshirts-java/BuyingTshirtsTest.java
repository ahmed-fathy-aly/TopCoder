import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuyingTshirtsTest {

    protected BuyingTshirts solution;

    @Before
    public void setUp() {
        solution = new BuyingTshirts();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int T = 5;
        int[] Q = new int[]{1, 2, 3, 4, 5};
        int[] P = new int[]{5, 4, 3, 2, 1};

        int expected = 2;
        int actual = solution.meet(T, Q, P);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int T = 10;
        int[] Q = new int[]{10, 10, 10};
        int[] P = new int[]{10, 10, 10};

        int expected = 3;
        int actual = solution.meet(T, Q, P);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int T = 2;
        int[] Q = new int[]{1, 2, 1, 2, 1, 2, 1, 2};
        int[] P = new int[]{1, 1, 1, 1, 2, 2, 2, 2};

        int expected = 5;
        int actual = solution.meet(T, Q, P);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int T = 100;
        int[] Q = new int[]{1, 2, 3};
        int[] P = new int[]{4, 5, 6};

        int expected = 0;
        int actual = solution.meet(T, Q, P);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int T = 10;
        int[] Q = new int[]{10, 1, 10, 1};
        int[] P = new int[]{1, 10, 1, 10};

        int expected = 0;
        int actual = solution.meet(T, Q, P);

        Assert.assertEquals(expected, actual);
    }

}
