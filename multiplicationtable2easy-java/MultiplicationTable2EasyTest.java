import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MultiplicationTable2EasyTest {

    protected MultiplicationTable2Easy solution;

    @Before
    public void setUp() {
        solution = new MultiplicationTable2Easy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] table = new int[]{1, 1, 2, 3, 1, 0, 2, 3, 3, 3, 0, 3, 2, 2, 2, 0};
        int[] t = new int[]{1, 0};

        String expected = "Good";
        String actual = solution.isGoodSet(table, t);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] table = new int[]{1, 1, 2, 3, 1, 0, 2, 3, 3, 3, 0, 3, 2, 2, 2, 0};
        int[] t = new int[]{2, 3};

        String expected = "Not Good";
        String actual = solution.isGoodSet(table, t);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] table = new int[]{1, 1, 2, 3, 1, 0, 2, 3, 3, 3, 0, 3, 2, 2, 2, 0};
        int[] t = new int[]{0, 1, 2, 3};

        String expected = "Good";
        String actual = solution.isGoodSet(table, t);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] table = new int[]{1, 1, 2, 3, 1, 0, 2, 3, 3, 3, 0, 3, 2, 2, 2, 0};
        int[] t = new int[]{1};

        String expected = "Not Good";
        String actual = solution.isGoodSet(table, t);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] table = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int[] t = new int[]{2, 4, 5};

        String expected = "Good";
        String actual = solution.isGoodSet(table, t);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] table = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int[] t = new int[]{0, 1, 3, 4, 5};

        String expected = "Not Good";
        String actual = solution.isGoodSet(table, t);

        Assert.assertEquals(expected, actual);
    }

}
