import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MostProfitableTest {

    protected MostProfitable solution;

    @Before
    public void setUp() {
        solution = new MostProfitable();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] costs = new int[]{100, 120, 150, 1000};
        int[] prices = new int[]{110, 110, 200, 2000};
        int[] sales = new int[]{20, 100, 50, 3};
        String[] items = new String[]{"Video Card", "256M Mem", "CPU/Mobo combo", "Complete machine"};

        String expected = "Complete machine";
        String actual = solution.bestItem(costs, prices, sales, items);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] costs = new int[]{100};
        int[] prices = new int[]{100};
        int[] sales = new int[]{134};
        String[] items = new String[]{"Service, at cost"};

        String expected = "";
        String actual = solution.bestItem(costs, prices, sales, items);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] costs = new int[]{38, 24};
        int[] prices = new int[]{37, 23};
        int[] sales = new int[]{1000, 643};
        String[] items = new String[]{"Letter", "Postcard"};

        String expected = "";
        String actual = solution.bestItem(costs, prices, sales, items);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] costs = new int[]{10, 10};
        int[] prices = new int[]{11, 12};
        int[] sales = new int[]{2, 1};
        String[] items = new String[]{"A", "B"};

        String expected = "A";
        String actual = solution.bestItem(costs, prices, sales, items);

        Assert.assertEquals(expected, actual);
    }

}
