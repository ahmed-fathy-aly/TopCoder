import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LuckyRemainderTest {

    protected LuckyRemainder solution;

    @Before
    public void setUp() {
        solution = new LuckyRemainder();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String X = "123";

        int expected = 6;
        int actual = solution.getLuckyRemainder(X);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String X = "24816";

        int expected = 3;
        int actual = solution.getLuckyRemainder(X);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String X = "8";

        int expected = 8;
        int actual = solution.getLuckyRemainder(X);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String X = "11235813213455";

        int expected = 7;
        int actual = solution.getLuckyRemainder(X);

        Assert.assertEquals(expected, actual);
    }


    @Test(timeout = 2000)
    public void testCase4() {
        String X = "99999999999999999999999999999999999999999999999999";

        int expected = 7;
        int actual = solution.getLuckyRemainder(X);

        Assert.assertEquals(expected, actual);
    }

}
