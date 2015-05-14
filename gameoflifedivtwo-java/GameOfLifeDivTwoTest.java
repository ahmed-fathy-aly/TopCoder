import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameOfLifeDivTwoTest {

    protected GameOfLifeDivTwo solution;

    @Before
    public void setUp() {
        solution = new GameOfLifeDivTwo();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String init = "01010";
        int T = 2;

        String expected = "00000";
        String actual = solution.theSimulation(init, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String init = "010101";
        int T = 5;

        String expected = "101010";
        String actual = solution.theSimulation(init, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String init = "111010";
        int T = 58;

        String expected = "111111";
        String actual = solution.theSimulation(init, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String init = "111111111";
        int T = 511;

        String expected = "111111111";
        String actual = solution.theSimulation(init, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String init = "110010000010111110010100001001";
        int T = 1000;

        String expected = "110000000001111110000000000001";
        String actual = solution.theSimulation(init, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String init = "00101110011";
        int T = 0;

        String expected = "00101110011";
        String actual = solution.theSimulation(init, T);

        Assert.assertEquals(expected, actual);
    }

}
