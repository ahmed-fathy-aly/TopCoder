import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortishDiv2Test {

    protected SortishDiv2 solution;

    @Before
    public void setUp() {
        solution = new SortishDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int sortedness = 5;
        int[] seq = new int[]{4, 0, 0, 2, 0};

        int expected = 2;
        int actual = solution.ways(sortedness, seq);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int sortedness = 4;
        int[] seq = new int[]{0, 0, 0, 0};

        int expected = 5;
        int actual = solution.ways(sortedness, seq);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int sortedness = 2;
        int[] seq = new int[]{1, 3, 2};

        int expected = 1;
        int actual = solution.ways(sortedness, seq);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int sortedness = 2;
        int[] seq = new int[]{1, 2, 0, 5, 0, 0};

        int expected = 0;
        int actual = solution.ways(sortedness, seq);

        Assert.assertEquals(expected, actual);
    }

}
