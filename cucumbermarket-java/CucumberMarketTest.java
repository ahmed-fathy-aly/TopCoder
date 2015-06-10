import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CucumberMarketTest {

    protected CucumberMarket solution;

    @Before
    public void setUp() {
        solution = new CucumberMarket();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] price = new int[]{1000, 1, 10, 100};
        int budget = 1110;
        int k = 3;

        String expected = "YES";
        String actual = solution.check(price, budget, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] price = new int[]{1000, 1, 10, 100};
        int budget = 1109;
        int k = 3;

        String expected = "NO";
        String actual = solution.check(price, budget, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] price = new int[]{33, 4};
        int budget = 33;
        int k = 1;

        String expected = "YES";
        String actual = solution.check(price, budget, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] price = new int[]{1, 1, 1, 1, 1, 1};
        int budget = 2;
        int k = 4;

        String expected = "NO";
        String actual = solution.check(price, budget, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] price = new int[]{1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000};
        int budget = 10000;
        int k = 9;

        String expected = "YES";
        String actual = solution.check(price, budget, k);

        Assert.assertEquals(expected, actual);
    }

}
