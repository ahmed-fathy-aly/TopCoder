import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MonochromaticBoardTest {

    protected MonochromaticBoard solution;

    @Before
    public void setUp() {
        solution = new MonochromaticBoard();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] board = new String[]{"WBWBW", "BBBBB", "WBWBW", "WBWBW"};

        int expected = 3;
        int actual = solution.theMin(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] board = new String[]{"BBBB", "BBBB", "BBBB"};

        int expected = 3;
        int actual = solution.theMin(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] board = new String[]{"BBBBB", "BBBBB", "BBBBB", "BBBBB", "BBBBB", "BBBBB", "BBBBB", "BBBBB"};

        int expected = 5;
        int actual = solution.theMin(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] board = new String[]{"WW", "WW"};

        int expected = 0;
        int actual = solution.theMin(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] board = new String[]{"BBBBBBBB", "BBBBBBBB", "BBBBBBBB", "WBWBBBWB", "BBBBBBBB"};

        int expected = 9;
        int actual = solution.theMin(board);

        Assert.assertEquals(expected, actual);
    }

}
