import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromePathTest {

    protected PalindromePath solution;

    @Before
    public void setUp() {
        solution = new PalindromePath();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int n = 5;
        int[] a = new int[]{2, 2, 0, 3, 4};
        int[] b = new int[]{0, 1, 3, 4, 1};
        String c = "abxyx";

        int expected = 3;
        int actual = solution.shortestLength(n, a, b, c);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int n = 5;
        int[] a = new int[]{2, 2, 0, 3, 4};
        int[] b = new int[]{0, 1, 3, 4, 1};
        String c = "abxyz";

        int expected = -1;
        int actual = solution.shortestLength(n, a, b, c);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int n = 7;
        int[] a = new int[]{0, 0, 3, 4, 5, 6};
        int[] b = new int[]{2, 3, 4, 5, 6, 1};
        String c = "abaaaa";

        int expected = 9;
        int actual = solution.shortestLength(n, a, b, c);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int n = 6;
        int[] a = new int[]{0, 0, 3, 4, 5};
        int[] b = new int[]{2, 3, 4, 5, 1};
        String c = "abaaa";

        int expected = -1;
        int actual = solution.shortestLength(n, a, b, c);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int n = 2;
        int[] a = new int[]{0};
        int[] b = new int[]{1};
        String c = "x";

        int expected = 1;
        int actual = solution.shortestLength(n, a, b, c);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int n = 20;
        int[] a = new int[]{18};
        int[] b = new int[]{19};
        String c = "z";

        int expected = -1;
        int actual = solution.shortestLength(n, a, b, c);

        Assert.assertEquals(expected, actual);
    }

}
