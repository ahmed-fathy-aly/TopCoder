import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberLabyrinthDiv2Test {

    protected NumberLabyrinthDiv2 solution;

    @Before
    public void setUp() {
        solution = new NumberLabyrinthDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] board = new String[]{"...2", "....", "3..."};
        int r1 = 0;
        int c1 = 0;
        int r2 = 2;
        int c2 = 3;
        int K = 0;

        int expected = -1;
        int actual = solution.getMinimumNumberOfMoves(board, r1, c1, r2, c2, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] board = new String[]{"...2", "....", "3..."};
        int r1 = 0;
        int c1 = 0;
        int r2 = 2;
        int c2 = 3;
        int K = 1;

        int expected = 2;
        int actual = solution.getMinimumNumberOfMoves(board, r1, c1, r2, c2, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] board = new String[]{"...3", "....", "2..."};
        int r1 = 0;
        int c1 = 0;
        int r2 = 2;
        int c2 = 3;
        int K = 3;

        int expected = 3;
        int actual = solution.getMinimumNumberOfMoves(board, r1, c1, r2, c2, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] board = new String[]{"55255", ".0.0.", "..9..", "..3..", "3.9.3", "44.44"};
        int r1 = 3;
        int c1 = 2;
        int r2 = 4;
        int c2 = 2;
        int K = 10;

        int expected = 6;
        int actual = solution.getMinimumNumberOfMoves(board, r1, c1, r2, c2, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] board = new String[]{"920909949", "900020000", "009019039", "190299149", "999990319", "940229120", "000409399", "999119320", "009939999"};
        int r1 = 7;
        int c1 = 3;
        int r2 = 1;
        int c2 = 1;
        int K = 50;

        int expected = 10;
        int actual = solution.getMinimumNumberOfMoves(board, r1, c1, r2, c2, K);

        Assert.assertEquals(expected, actual);
    }

}
