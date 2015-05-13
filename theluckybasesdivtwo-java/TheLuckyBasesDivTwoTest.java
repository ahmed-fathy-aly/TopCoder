import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheLuckyBasesDivTwoTest {

    protected TheLuckyBasesDivTwo solution;

    @Before
    public void setUp() {
        solution = new TheLuckyBasesDivTwo();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        long n = 255L;

        long expected = 1L;
        long actual = solution.find(n);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        long n = 4L;

        long expected = -1L;
        long actual = solution.find(n);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        long n = 13L;

        long expected = 0L;
        long actual = solution.find(n);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        long n = 60L;

        long expected = 2L;
        long actual = solution.find(n);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        long n = 23;

        long expected = 0l;
        long actual = solution.find(n);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 9000)
    public void testCase5() {
        long n = 474747477747l;

        long expected = 3l;
        long actual = solution.find(n);

        Assert.assertEquals(expected, actual);
    }

    
}
