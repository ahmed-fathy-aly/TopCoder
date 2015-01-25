import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TimeTest {

    protected Time solution;

    @Before
    public void setUp() {
        solution = new Time();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int seconds = 0;

        String expected = "0:0:0";
        String actual = solution.whatTime(seconds);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int seconds = 3661;

        String expected = "1:1:1";
        String actual = solution.whatTime(seconds);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int seconds = 5436;

        String expected = "1:30:36";
        String actual = solution.whatTime(seconds);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int seconds = 86399;

        String expected = "23:59:59";
        String actual = solution.whatTime(seconds);

        Assert.assertEquals(expected, actual);
    }

}
