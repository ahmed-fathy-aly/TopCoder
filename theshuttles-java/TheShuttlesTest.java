import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheShuttlesTest {

    protected TheShuttles solution;

    @Before
    public void setUp() {
        solution = new TheShuttles();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] cnt = new int[]{9};
        int baseCost = 30;
        int seatCost = 5;

        int expected = 75;
        int actual = solution.getLeastCost(cnt, baseCost, seatCost);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] cnt = new int[]{9, 4};
        int baseCost = 30;
        int seatCost = 5;

        int expected = 150;
        int actual = solution.getLeastCost(cnt, baseCost, seatCost);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] cnt = new int[]{9, 4};
        int baseCost = 10;
        int seatCost = 5;

        int expected = 105;
        int actual = solution.getLeastCost(cnt, baseCost, seatCost);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] cnt = new int[]{51, 1, 77, 14, 17, 10, 80};
        int baseCost = 32;
        int seatCost = 40;

        int expected = 12096;
        int actual = solution.getLeastCost(cnt, baseCost, seatCost);

        Assert.assertEquals(expected, actual);
    }

}
