import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoinsGameEasyTest {

    protected CoinsGameEasy solution;

    @Before
    public void setUp() {
        solution = new CoinsGameEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] board = new String[]{"oo"};

        int expected = 1;
        int actual = solution.minimalSteps(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] board = new String[]{".#", ".#", ".#", "o#", "o#", "##"};

        int expected = 4;
        int actual = solution.minimalSteps(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] board = new String[]{"..", "..", "..", "o#", "o#", "##"};

        int expected = 3;
        int actual = solution.minimalSteps(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] board = new String[]{"###", ".o.", "###", ".o.", "###"};

        int expected = -1;
        int actual = solution.minimalSteps(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] board = new String[]{"###", ".o.", "#.#", ".o.", "###"};

        int expected = 3;
        int actual = solution.minimalSteps(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] board = new String[]{"###########", "........#o#", "###########", ".........o#", "###########"};

        int expected = 10;
        int actual = solution.minimalSteps(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String[] board = new String[]{"############", ".........#o#", "############", "..........o#", "############"};

        int expected = -1;
        int actual = solution.minimalSteps(board);

        Assert.assertEquals(expected, actual);
    }

}
