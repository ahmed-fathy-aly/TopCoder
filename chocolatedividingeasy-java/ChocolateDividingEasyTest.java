import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChocolateDividingEasyTest {

    protected ChocolateDividingEasy solution;

    @Before
    public void setUp() {
        solution = new ChocolateDividingEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] chocolate = new String[]{"9768", "6767", "5313"};

        int expected = 3;
        int actual = solution.findBest(chocolate);

        Assert.assertEquals(expected, actual);
    }

//    @Test(timeout = 2000)
//    public void testCase1() {
//        String[] chocolate = new String[]{"36753562", "91270936", "06261879", "20237592", "28973612", "93194784"};
//
//        int expected = 15;
//        int actual = solution.findBest(chocolate);
//
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test(timeout = 2000)
//    public void testCase2() {
//        String[] chocolate = new String[]{"012", "345", "678"};
//
//        int expected = 0;
//        int actual = solution.findBest(chocolate);
//
//        Assert.assertEquals(expected, actual);
//    }

}
