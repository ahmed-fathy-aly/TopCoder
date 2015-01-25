import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChessMetricTest {

    protected ChessMetric solution;

    @Before
    public void setUp() {
        solution = new ChessMetric();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int size = 3;
        int[] start = new int[]{0, 0};
        int[] end = new int[]{1, 0};
        int numMoves = 1;

        long expected = 1L;
        long actual = solution.howMany(size, start, end, numMoves);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int size = 3;
        int[] start = new int[]{0, 0};
        int[] end = new int[]{1, 2};
        int numMoves = 1;

        long expected = 1L;
        long actual = solution.howMany(size, start, end, numMoves);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int size = 3;
        int[] start = new int[]{0, 0};
        int[] end = new int[]{2, 2};
        int numMoves = 1;

        long expected = 0L;
        long actual = solution.howMany(size, start, end, numMoves);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int size = 3;
        int[] start = new int[]{0, 0};
        int[] end = new int[]{0, 0};
        int numMoves = 2;

        long expected = 5L;
        long actual = solution.howMany(size, start, end, numMoves);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int size = 100;
        int[] start = new int[]{0, 0};
        int[] end = new int[]{0, 99};
        int numMoves = 50;

        long expected = 243097320072600L;
        long actual = solution.howMany(size, start, end, numMoves);

        Assert.assertEquals(expected, actual);
    }

}
