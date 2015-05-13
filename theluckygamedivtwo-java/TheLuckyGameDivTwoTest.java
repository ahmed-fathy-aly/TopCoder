import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheLuckyGameDivTwoTest {

    protected TheLuckyGameDivTwo solution;

    @Before
    public void setUp() {
        solution = new TheLuckyGameDivTwo();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int a = 1;
        int b = 10;
        int jLen = 2;
        int bLen = 1;

        int expected = 0;
        int actual = solution.find(a, b, jLen, bLen);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int a = 1;
        int b = 100;
        int jLen = 100;
        int bLen = 100;

        int expected = 6;
        int actual = solution.find(a, b, jLen, bLen);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int a = 4;
        int b = 8;
        int jLen = 3;
        int bLen = 2;

        int expected = 1;
        int actual = solution.find(a, b, jLen, bLen);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int a = 1;
        int b = 100;
        int jLen = 75;
        int bLen = 50;

        int expected = 2;
        int actual = solution.find(a, b, jLen, bLen);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase4() {
        int a = 160;
        int b = 2650;
        int jLen = 1563;
        int bLen = 1480;

        int expected = 8;
        int actual = solution.find(a, b, jLen, bLen);

        Assert.assertEquals(expected, actual);
    }

}
