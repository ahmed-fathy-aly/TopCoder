import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AutohamilTest {

    protected Autohamil solution;

    @Before
    public void setUp() {
        solution = new Autohamil();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] z0 = new int[]{0, 1};
        int[] z1 = new int[]{0, 1};

        String expected = "Does not exist";
        String actual = solution.check(z0, z1);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] z0 = new int[]{1, 1};
        int[] z1 = new int[]{1, 1};

        String expected = "Exists";
        String actual = solution.check(z0, z1);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] z0 = new int[]{1, 2, 2};
        int[] z1 = new int[]{2, 2, 2};

        String expected = "Exists";
        String actual = solution.check(z0, z1);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] z0 = new int[]{2, 2, 2};
        int[] z1 = new int[]{2, 2, 2};

        String expected = "Does not exist";
        String actual = solution.check(z0, z1);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] z0 = new int[]{1, 2, 0, 3};
        int[] z1 = new int[]{3, 2, 0, 3};

        String expected = "Exists";
        String actual = solution.check(z0, z1);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] z0 = new int[]{1, 2, 0, 4, 3, 5};
        int[] z1 = new int[]{1, 2, 3, 5, 4, 5};

        String expected = "Exists";
        String actual = solution.check(z0, z1);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int[] z0 = new int[]{1, 2, 0, 4, 4, 5};
        int[] z1 = new int[]{1, 2, 3, 5, 4, 5};

        String expected = "Does not exist";
        String actual = solution.check(z0, z1);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase7() {
        int[] z0 = new int[]{33, 28, 16, 14, 30, 31, 31, 41, 5, 40, 24, 1, 16, 19, 33, 26, 38, 29, 27, 26, 41, 10, 30, 7, 42, 11, 33, 2, 4, 20, 18, 3, 24, 22, 8, 5, 29, 22, 25, 38, 43, 37, 43, 32};
        int[] z1 = new int[]
        	    {34, 32, 11, 19, 20, 5, 18, 19, 35, 17, 19, 19, 13, 6, 13, 36, 30, 21, 42, 24, 6, 16, 22, 42, 21, 14, 15, 6, 12, 31, 13, 26, 29, 27, 42, 29, 23, 20, 39, 9, 31, 23, 23, 40};

        String expected = "Exists";
        String actual = solution.check(z0, z1);

        Assert.assertEquals(expected, actual);
    }
}
