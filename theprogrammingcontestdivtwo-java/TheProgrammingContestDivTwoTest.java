import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheProgrammingContestDivTwoTest {

    protected TheProgrammingContestDivTwo solution;

    @Before
    public void setUp() {
        solution = new TheProgrammingContestDivTwo();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int T = 74;
        int[] requiredTime = new int[]{47};

        int[] expected = new int[]{1, 47};
        int[] actual = solution.find(T, requiredTime);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int T = 74;
        int[] requiredTime = new int[]{4747};

        int[] expected = new int[]{0, 0};
        int[] actual = solution.find(T, requiredTime);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int T = 47;
        int[] requiredTime = new int[]{8, 5};

        int[] expected = new int[]{2, 18};
        int[] actual = solution.find(T, requiredTime);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int T = 47;
        int[] requiredTime = new int[]{12, 3, 21, 6, 4, 13};

        int[] expected = new int[]{5, 86};
        int[] actual = solution.find(T, requiredTime);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int T = 58;
        int[] requiredTime = new int[]{4, 5, 82, 3, 4, 65, 7, 6, 8, 7, 6, 4, 8, 7, 6, 37, 8};

        int[] expected = new int[]{10, 249};
        int[] actual = solution.find(T, requiredTime);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int T = 100000;
        int[] requiredTime = new int[]{100000};

        int[] expected = new int[]{1, 100000};
        int[] actual = solution.find(T, requiredTime);

        Assert.assertArrayEquals(expected, actual);
    }

}
