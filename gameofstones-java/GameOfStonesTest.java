import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameOfStonesTest {

    protected GameOfStones solution;

    @Before
    public void setUp() {
        solution = new GameOfStones();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] stones = new int[]{7, 15, 9, 5};

        int expected = 3;
        int actual = solution.count(stones);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] stones = new int[]{10, 16};

        int expected = -1;
        int actual = solution.count(stones);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] stones = new int[]{2, 8, 4};

        int expected = -1;
        int actual = solution.count(stones);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] stones = new int[]{17};

        int expected = 0;
        int actual = solution.count(stones);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] stones = new int[]{10, 15, 20, 12, 1, 20};

        int expected = -1;
        int actual = solution.count(stones);

        Assert.assertEquals(expected, actual);
    }

}
