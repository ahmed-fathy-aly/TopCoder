import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SurroundingGameEasyTest {

    protected SurroundingGameEasy solution;

    @Before
    public void setUp() {
        solution = new SurroundingGameEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] cost = new String[]{"21", "12"};
        String[] benefit = new String[]{"21", "12"};
        String[] stone = new String[]{".o", "o."};

        int expected = 4;
        int actual = solution.score(cost, benefit, stone);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] cost = new String[]{"99", "99"};
        String[] benefit = new String[]{"11", "11"};
        String[] stone = new String[]{".o", "o."};

        int expected = -14;
        int actual = solution.score(cost, benefit, stone);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] cost = new String[]{"888", "888", "888"};
        String[] benefit = new String[]{"000", "090", "000"};
        String[] stone = new String[]{"...", ".o.", "..."};

        int expected = 1;
        int actual = solution.score(cost, benefit, stone);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] cost = new String[]{"4362", "4321"};
        String[] benefit = new String[]{"5329", "5489"};
        String[] stone = new String[]{"...o", "..o."};

        int expected = 22;
        int actual = solution.score(cost, benefit, stone);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] cost = new String[]{"5413", "4323", "8321", "5490"};
        String[] benefit = new String[]{"0432", "7291", "3901", "2310"};
        String[] stone = new String[]{"ooo.", "o..o", "...o", "oooo"};

        int expected = -12;
        int actual = solution.score(cost, benefit, stone);

        Assert.assertEquals(expected, actual);
    }

}
