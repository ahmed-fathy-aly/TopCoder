import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GeneralChessTest {

    protected GeneralChess solution;

    @Before
    public void setUp() {
        solution = new GeneralChess();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] pieces = new String[]{"0,0"};

        String[] expected = new String[]{"-2,-1", "-2,1", "-1,-2", "-1,2", "1,-2", "1,2", "2,-1", "2,1"};
        String[] actual = solution.attackPositions(pieces);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] pieces = new String[]{"2,1", "-1,-2"};

        String[] expected = new String[]{"0,0", "1,-1"};
        String[] actual = solution.attackPositions(pieces);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] pieces = new String[]{"0,0", "2,1"};

        String[] expected = new String[]{};
        String[] actual = solution.attackPositions(pieces);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] pieces = new String[]{"-1000,1000", "-999,999", "-999,997"};

        String[] expected = new String[]{"-1001,998"};
        String[] actual = solution.attackPositions(pieces);

        Assert.assertArrayEquals(expected, actual);
    }

}
