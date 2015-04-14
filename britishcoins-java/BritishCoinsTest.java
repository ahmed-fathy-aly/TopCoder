import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BritishCoinsTest {

    protected BritishCoins solution;

    @Before
    public void setUp() {
        solution = new BritishCoins();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int pence = 533;

        int[] expected = new int[]{2, 4, 5};
        int[] actual = solution.coins(pence);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int pence = 0;

        int[] expected = new int[]{0, 0, 0};
        int[] actual = solution.coins(pence);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int pence = 6;

        int[] expected = new int[]{0, 0, 6};
        int[] actual = solution.coins(pence);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int pence = 4091;

        int[] expected = new int[]{17, 0, 11};
        int[] actual = solution.coins(pence);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int pence = 10000;

        int[] expected = new int[]{41, 13, 4};
        int[] actual = solution.coins(pence);

        Assert.assertArrayEquals(expected, actual);
    }

}
