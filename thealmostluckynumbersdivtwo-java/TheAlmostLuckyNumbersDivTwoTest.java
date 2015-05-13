import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheAlmostLuckyNumbersDivTwoTest {

    protected TheAlmostLuckyNumbersDivTwo solution;

    @Before
    public void setUp() {
        solution = new TheAlmostLuckyNumbersDivTwo();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int a = 4;
        int b = 7;

        int expected = 4;
        int actual = solution.find(a, b);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int a = 8;
        int b = 19;

        int expected = 4;
        int actual = solution.find(a, b);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int a = 28;
        int b = 33;

        int expected = 0;
        int actual = solution.find(a, b);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int a = 1234;
        int b = 4321;

        int expected = 36;
        int actual = solution.find(a, b);

        Assert.assertEquals(expected, actual);
    }

}
