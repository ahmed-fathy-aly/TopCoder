import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DoubleWeightsTest {

    protected DoubleWeights solution;

    @Before
    public void setUp() {
        solution = new DoubleWeights();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] weight1 = new String[]{"..14", "..94", "19..", "44.."};
        String[] weight2 = new String[]{"..94", "..14", "91..", "44.."};

        int expected = 64;
        int actual = solution.minimalCost(weight1, weight2);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] weight1 = new String[]{"..14", "..14", "11..", "44.."};
        String[] weight2 = new String[]{"..94", "..94", "99..", "44.."};

        int expected = 36;
        int actual = solution.minimalCost(weight1, weight2);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] weight1 = new String[]{"..", ".."};
        String[] weight2 = new String[]{"..", ".."};

        int expected = -1;
        int actual = solution.minimalCost(weight1, weight2);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] weight1 = new String[]{".....9", "..9...", ".9.9..", "..9.9.", "...9.9", "9...9."};
        String[] weight2 = new String[]{".....9", "..9...", ".9.9..", "..9.9.", "...9.9", "9...9."};

        int expected = 2025;
        int actual = solution.minimalCost(weight1, weight2);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] weight1 = new String[]{".4...1", "4.1...", ".1.1..", "..1.1.", "...1.1", "1...1."};
        String[] weight2 = new String[]{".4...1", "4.1...", ".1.1..", "..1.1.", "...1.1", "1...1."};

        int expected = 16;
        int actual = solution.minimalCost(weight1, weight2);

        Assert.assertEquals(expected, actual);
    }

}
