import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SlimeXSlimeRancher2Test {

    protected SlimeXSlimeRancher2 solution;

    @Before
    public void setUp() {
        solution = new SlimeXSlimeRancher2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] attributes = new int[]{1, 2, 3};

        int expected = 3;
        int actual = solution.train(attributes);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] attributes = new int[]{5, 5};

        int expected = 0;
        int actual = solution.train(attributes);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] attributes = new int[]{900, 500, 100};

        int expected = 1200;
        int actual = solution.train(attributes);

        Assert.assertEquals(expected, actual);
    }

}
