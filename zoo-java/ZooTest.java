import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZooTest {

    protected Zoo solution;

    @Before
    public void setUp() {
        solution = new Zoo();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] answers = new int[]{0, 1, 2, 3, 4};

        long expected = 2L;
        long actual = solution.theCount(answers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] answers = new int[]{5, 8};

        long expected = 0L;
        long actual = solution.theCount(answers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] answers = new int[]{0, 0, 0, 0, 0, 0};

        long expected = 0L;
        long actual = solution.theCount(answers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] answers = new int[]{1, 0, 2, 0, 1};

        long expected = 8L;
        long actual = solution.theCount(answers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] answers = new int[]{1, 0, 1};

        long expected = 0L;
        long actual = solution.theCount(answers);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase5() {
        int[] answers = new int[]{0, 1, 0, 1};

        long expected = 4L;
        long actual = solution.theCount(answers);

        Assert.assertEquals(expected, actual);
    }

}
