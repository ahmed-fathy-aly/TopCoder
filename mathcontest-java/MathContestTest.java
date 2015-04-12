import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathContestTest {

    protected MathContest solution;

    @Before
    public void setUp() {
        solution = new MathContest();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String ballSequence = "BBWWB";
        int repetitions = 1;

        int expected = 2;
        int actual = solution.countBlack(ballSequence, repetitions);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String ballSequence = "BBB";
        int repetitions = 10;

        int expected = 1;
        int actual = solution.countBlack(ballSequence, repetitions);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String ballSequence = "BW";
        int repetitions = 10;

        int expected = 20;
        int actual = solution.countBlack(ballSequence, repetitions);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String ballSequence = "WWWWWWWBWWWWWWWWWWWWWW";
        int repetitions = 1;

        int expected = 2;
        int actual = solution.countBlack(ballSequence, repetitions);

        Assert.assertEquals(expected, actual);
    }

}
