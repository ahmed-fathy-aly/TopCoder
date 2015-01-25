import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WinterAndMandarinsTest {

    protected WinterAndMandarins solution;

    @Before
    public void setUp() {
        solution = new WinterAndMandarins();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] bags = new int[]{10, 20, 30};
        int K = 2;

        int expected = 10;
        int actual = solution.getNumber(bags, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] bags = new int[]{4, 7, 4};
        int K = 3;

        int expected = 3;
        int actual = solution.getNumber(bags, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] bags = new int[]{4, 1, 2, 3};
        int K = 3;

        int expected = 2;
        int actual = solution.getNumber(bags, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] bags = new int[]{5, 4, 6, 1, 9, 4, 2, 7, 5, 6};
        int K = 4;

        int expected = 1;
        int actual = solution.getNumber(bags, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] bags = new int[]{47, 1000000000, 1, 74};
        int K = 2;

        int expected = 27;
        int actual = solution.getNumber(bags, K);

        Assert.assertEquals(expected, actual);
    }

}
