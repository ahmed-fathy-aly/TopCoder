import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FoxAndHandleEasyTest {

    protected FoxAndHandleEasy solution;

    @Before
    public void setUp() {
        solution = new FoxAndHandleEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String S = "Ciel";
        String T = "CieCiell";

        String expected = "Yes";
        String actual = solution.isPossible(S, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String S = "Ciel";
        String T = "FoxCiel";

        String expected = "No";
        String actual = solution.isPossible(S, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String S = "FoxCiel";
        String T = "FoxFoxCielCiel";

        String expected = "Yes";
        String actual = solution.isPossible(S, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String S = "FoxCiel";
        String T = "FoxCielCielFox";

        String expected = "No";
        String actual = solution.isPossible(S, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String S = "Ha";
        String T = "HaHaHaHa";

        String expected = "No";
        String actual = solution.isPossible(S, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String S = "TheHandleCanBeVeryLong";
        String T = "TheHandleCanBeVeryLong";

        String expected = "No";
        String actual = solution.isPossible(S, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String S = "Long";
        String T = "LongLong";

        String expected = "Yes";
        String actual = solution.isPossible(S, T);

        Assert.assertEquals(expected, actual);
    }

}
