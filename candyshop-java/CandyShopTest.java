import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CandyShopTest {

    protected CandyShop solution;

    @Before
    public void setUp() {
        solution = new CandyShop();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] X = new int[]{0};
        int[] Y = new int[]{0};
        int[] R = new int[]{1};

        int expected = 5;
        int actual = solution.countProbablePlaces(X, Y, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] X = new int[]{0};
        int[] Y = new int[]{0};
        int[] R = new int[]{2};

        int expected = 13;
        int actual = solution.countProbablePlaces(X, Y, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] X = new int[]{2, 3};
        int[] Y = new int[]{1, -1};
        int[] R = new int[]{2, 2};

        int expected = 4;
        int actual = solution.countProbablePlaces(X, Y, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] X = new int[]{2, 3, 5};
        int[] Y = new int[]{1, -1, 0};
        int[] R = new int[]{2, 2, 3};

        int expected = 3;
        int actual = solution.countProbablePlaces(X, Y, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] X = new int[]{-100, -100, -100, 0, 0, 0, 100, 100, 100};
        int[] Y = new int[]{-100, 0, 100, -100, 0, 100, -100, 0, 100};
        int[] R = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};

        int expected = 0;
        int actual = solution.countProbablePlaces(X, Y, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] X = new int[]{-3, 3, 5, 5};
        int[] Y = new int[]{4, 5, -2, 0};
        int[] R = new int[]{10, 11, 8, 6};

        int expected = 33;
        int actual = solution.countProbablePlaces(X, Y, R);

        Assert.assertEquals(expected, actual);
    }

}
