import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class YetAnotherIncredibleMachineTest {

    protected YetAnotherIncredibleMachine solution;

    @Before
    public void setUp() {
        solution = new YetAnotherIncredibleMachine();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] platformMount = new int[]{7};
        int[] platformLength = new int[]{10};
        int[] balls = new int[]{3, 4};

        int expected = 3;
        int actual = solution.countWays(platformMount, platformLength, balls);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] platformMount = new int[]{1, 4};
        int[] platformLength = new int[]{3, 3};
        int[] balls = new int[]{2, 7};

        int expected = 1;
        int actual = solution.countWays(platformMount, platformLength, balls);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] platformMount = new int[]{4, 4, 4};
        int[] platformLength = new int[]{10, 9, 8};
        int[] balls = new int[]{1, 100};

        int expected = 27;
        int actual = solution.countWays(platformMount, platformLength, balls);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] platformMount = new int[]{0};
        int[] platformLength = new int[]{1};
        int[] balls = new int[]{0};

        int expected = 0;
        int actual = solution.countWays(platformMount, platformLength, balls);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] platformMount = new int[]{100, -4215, 251};
        int[] platformLength = new int[]{400, 10000, 2121};
        int[] balls = new int[]{5000, 2270, 8512, 6122};

        int expected = 250379170;
        int actual = solution.countWays(platformMount, platformLength, balls);

        Assert.assertEquals(expected, actual);
    }

}
