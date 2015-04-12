import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComparerInatorTest {

    protected ComparerInator solution;

    @Before
    public void setUp() {
        solution = new ComparerInator();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] A = new int[]{1};
        int[] B = new int[]{2};
        int[] wanted = new int[]{2};

        int expected = 1;
        int actual = solution.makeProgram(A, B, wanted);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] A = new int[]{1, 3};
        int[] B = new int[]{2, 1};
        int[] wanted = new int[]{2, 3};

        int expected = 7;
        int actual = solution.makeProgram(A, B, wanted);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] A = new int[]{1, 3, 5};
        int[] B = new int[]{2, 1, 7};
        int[] wanted = new int[]{2, 3, 5};

        int expected = -1;
        int actual = solution.makeProgram(A, B, wanted);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] A = new int[]{1, 3, 5};
        int[] B = new int[]{2, 1, 7};
        int[] wanted = new int[]{1, 3, 5};

        int expected = 1;
        int actual = solution.makeProgram(A, B, wanted);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] A = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] B = new int[]{5, 4, 7, 8, 3, 1, 1, 2, 3, 4, 6};
        int[] wanted = new int[]{1, 2, 3, 4, 3, 1, 1, 2, 3, 4, 6};

        int expected = 7;
        int actual = solution.makeProgram(A, B, wanted);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] A = new int[]{1, 5, 6, 7, 8};
        int[] B = new int[]{1, 5, 6, 7, 8};
        int[] wanted = new int[]{1, 5, 6, 7, 8};

        int expected = 1;
        int actual = solution.makeProgram(A, B, wanted);

        Assert.assertEquals(expected, actual);
    }

}
