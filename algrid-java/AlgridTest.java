import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlgridTest {

    protected Algrid solution;

    @Before
    public void setUp() {
        solution = new Algrid();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] output = new String[]{"WWWWWWW", "WWWWWWB", "BBBBBWW"};

        String[] expected = new String[]{"WWWWWWW", "WWWWWWB", "BBBBBBB"};
        String[] actual = solution.makeProgram(output);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] output = new String[]{"BBBBB", "WBWBW"};

        String[] expected = new String[]{"BBBBB", "WWBWB"};
        String[] actual = solution.makeProgram(output);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] output = new String[]{"BBBB", "BBBB", "BBWB", "WWBB", "BWBB"};

        String[] expected = new String[]{};
        String[] actual = solution.makeProgram(output);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] output = new String[]{"WWBBBBW", "BWBBWBB", "BWBBWBW", "BWWBWBB"};

        String[] expected = new String[]{"WWBBBBW", "BBBBBWB", "BBBBBBB", "BBBWBBB"};
        String[] actual = solution.makeProgram(output);

        Assert.assertArrayEquals(expected, actual);
    }

}
