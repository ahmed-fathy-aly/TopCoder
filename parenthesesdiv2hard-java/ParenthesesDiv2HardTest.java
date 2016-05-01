import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParenthesesDiv2HardTest {

    protected ParenthesesDiv2Hard solution;

    @Before
    public void setUp() {
        solution = new ParenthesesDiv2Hard();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String s = ")(";
        int[] L = new int[]{0};
        int[] R = new int[]{1};

        int expected = 1;
        int actual = solution.minSwaps(s, L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String s = "(())";
        int[] L = new int[]{0, 2};
        int[] R = new int[]{1, 3};

        int expected = 1;
        int actual = solution.minSwaps(s, L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String s = "(((())";
        int[] L = new int[]{0, 2};
        int[] R = new int[]{1, 3};

        int expected = 2;
        int actual = solution.minSwaps(s, L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String s = "(((((((((";
        int[] L = new int[]{0, 2};
        int[] R = new int[]{1, 3};

        int expected = -1;
        int actual = solution.minSwaps(s, L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String s = "))()())((()()()()()())))((((((";
        int[] L = new int[]{1, 6, 13, 17, 23, 25};
        int[] R = new int[]{4, 7, 16, 20, 24, 28};

        int expected = 5;
        int actual = solution.minSwaps(s, L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String s = "(";
        int[] L = new int[]{0};
        int[] R = new int[]{0};

        int expected = -1;
        int actual = solution.minSwaps(s, L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String s = "(()(((((((((((()";
        int[] L = new int[]{11,6};
        int[] R = new int[]{14,7};

        int expected = -1;
        int actual = solution.minSwaps(s, L, R);

        Assert.assertEquals(expected, actual);
    }


}
