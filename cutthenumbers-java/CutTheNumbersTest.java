import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CutTheNumbersTest {

    protected CutTheNumbers solution;

    @Before
    public void setUp() {
        solution = new CutTheNumbers();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] board = new String[]{"123", "312"};

        int expected = 435;
        int actual = solution.maximumSum(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] board = new String[]{"99", "11"};

        int expected = 182;
        int actual = solution.maximumSum(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] board = new String[]{"001", "010", "111", "100"};

        int expected = 1131;
        int actual = solution.maximumSum(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] board = new String[]{"8"};

        int expected = 8;
        int actual = solution.maximumSum(board);

        Assert.assertEquals(expected, actual);
    }

}
