import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheLotteryBothDivsTest {

    protected TheLotteryBothDivs solution;

    @Before
    public void setUp() {
        solution = new TheLotteryBothDivs();
    }

    public static void assertEquals(double expected, double actual) {
        if (Double.isNaN(expected)) {
            Assert.assertTrue("expected: <NaN> but was: <" + actual + ">", Double.isNaN(actual));
            return;
        }
        double delta = Math.max(1e-9, 1e-9 * Math.abs(expected));
        Assert.assertEquals(expected, actual, delta);
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] goodSuffixes = new String[]{"4"};

        double expected = 0.1;
        double actual = solution.find(goodSuffixes);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] goodSuffixes = new String[]{"4", "7"};

        double expected = 0.2;
        double actual = solution.find(goodSuffixes);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] goodSuffixes = new String[]{"47", "47"};

        double expected = 0.01;
        double actual = solution.find(goodSuffixes);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] goodSuffixes = new String[]{"47", "58", "4747", "502"};

        double expected = 0.021;
        double actual = solution.find(goodSuffixes);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] goodSuffixes = new String[]{"8542861", "1954", "6", "523", "000000000", "5426", "8"};

        double expected = 0.201100101;
        double actual = solution.find(goodSuffixes);

        assertEquals(expected, actual);
    }

}
