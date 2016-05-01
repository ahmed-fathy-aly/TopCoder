import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParenthesesDiv2MediumTest {

    protected ParenthesesDiv2Medium solution;

    @Before
    public void setUp() {
        solution = new ParenthesesDiv2Medium();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String s = ")(";

        int[] expected = new int[]{0, 1};
        int[] actual = solution.correct(s);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String s = ")))))(((((";

        int[] expected = new int[]{0, 2, 4, 5, 7, 9};
        int[] actual = solution.correct(s);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String s = "((()";

        int[] expected = new int[]{1};
        int[] actual = solution.correct(s);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String s = ")))(()(())))))";

        int[] expected = new int[]{0, 1, 2};
        int[] actual = solution.correct(s);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String s = "()()()()()()()()()()()()()";

        int[] expected = new int[]{};
        int[] actual = solution.correct(s);

        Assert.assertArrayEquals(expected, actual);
    }

}
