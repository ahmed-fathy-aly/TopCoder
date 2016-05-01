import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParenthesesDiv2EasyTest {

    protected ParenthesesDiv2Easy solution;

    @Before
    public void setUp() {
        solution = new ParenthesesDiv2Easy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String s = "(())";

        int expected = 2;
        int actual = solution.getDepth(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String s = "()()()";

        int expected = 1;
        int actual = solution.getDepth(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String s = "(())()";

        int expected = 2;
        int actual = solution.getDepth(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String s = "((())())(((())(()))())";

        int expected = 4;
        int actual = solution.getDepth(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String s = "()";

        int expected = 1;
        int actual = solution.getDepth(s);

        Assert.assertEquals(expected, actual);
    }

}
