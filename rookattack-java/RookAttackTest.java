import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RookAttackTest {

    protected RookAttack solution;

    @Before
    public void setUp() {
        solution = new RookAttack();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int rows = 8;
        int cols = 8;
        String[] cutouts = new String[]{};

        int expected = 8;
        int actual = solution.howMany(rows, cols, cutouts);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int rows = 2;
        int cols = 2;
        String[] cutouts = new String[]{"0 0", "0 1", "1 1", "1 0"};

        int expected = 0;
        int actual = solution.howMany(rows, cols, cutouts);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int rows = 3;
        int cols = 3;
        String[] cutouts = new String[]{"0 0", "1 0", "1 1", "2 0", "2 1", "2 2"};

        int expected = 2;
        int actual = solution.howMany(rows, cols, cutouts);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int rows = 3;
        int cols = 3;
        String[] cutouts = new String[]{"0 0", "1 2", "2 2"};

        int expected = 3;
        int actual = solution.howMany(rows, cols, cutouts);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int rows = 200;
        int cols = 200;
        String[] cutouts = new String[]{};

        int expected = 200;
        int actual = solution.howMany(rows, cols, cutouts);

        Assert.assertEquals(expected, actual);
    }

}
