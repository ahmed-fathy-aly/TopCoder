import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NetworkXZeroOneTest {

    protected NetworkXZeroOne solution;

    @Before
    public void setUp() {
        solution = new NetworkXZeroOne();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String message = "x?x?";

        String expected = "xoxo";
        String actual = solution.reconstruct(message);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String message = "?xo?";

        String expected = "oxox";
        String actual = solution.reconstruct(message);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String message = "xo";

        String expected = "xo";
        String actual = solution.reconstruct(message);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String message = "o??x??o";

        String expected = "oxoxoxo";
        String actual = solution.reconstruct(message);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String message = "???????x";

        String expected = "oxoxoxox";
        String actual = solution.reconstruct(message);

        Assert.assertEquals(expected, actual);
    }

}
