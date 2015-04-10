import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LightSwitchingPuzzleTest {

    protected LightSwitchingPuzzle solution;

    @Before
    public void setUp() {
        solution = new LightSwitchingPuzzle();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String state = "YYYYYY";

        int expected = 1;
        int actual = solution.minFlips(state);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String state = "YNYNYNYNY";

        int expected = 2;
        int actual = solution.minFlips(state);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String state = "NNNNNNNNNN";

        int expected = 0;
        int actual = solution.minFlips(state);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String state = "YYYNYYYNYYYNYYNYYYYN";

        int expected = 4;
        int actual = solution.minFlips(state);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String state = "NYNNYNNNYNNNNYNNNNNYNNNNNNYNNNNNNNY";

        int expected = 12;
        int actual = solution.minFlips(state);

        Assert.assertEquals(expected, actual);
    }

}
