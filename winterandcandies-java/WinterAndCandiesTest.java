import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WinterAndCandiesTest {

    protected WinterAndCandies solution;

    @Before
    public void setUp() {
        solution = new WinterAndCandies();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] type = new int[]{1, 3, 2};

        int expected = 3;
        int actual = solution.getNumber(type);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] type = new int[]{1, 1, 2};

        int expected = 4;
        int actual = solution.getNumber(type);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] type = new int[]{1, 3, 2, 5, 7, 4, 5, 4};

        int expected = 9;
        int actual = solution.getNumber(type);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] type = new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5};

        int expected = 62;
        int actual = solution.getNumber(type);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] type = new int[]{2};

        int expected = 0;
        int actual = solution.getNumber(type);

        Assert.assertEquals(expected, actual);
    }

}
