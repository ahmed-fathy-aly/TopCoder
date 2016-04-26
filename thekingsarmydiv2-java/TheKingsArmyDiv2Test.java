import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheKingsArmyDiv2Test {

    protected TheKingsArmyDiv2 solution;

    @Before
    public void setUp() {
        solution = new TheKingsArmyDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] state = new String[]{"SSSSS", "SSHHS", "SSSSS"};

        int expected = 0;
        int actual = solution.getNumber(state);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] state = new String[]{"SSSSS", "SSHSH", "HSSSS"};

        int expected = 1;
        int actual = solution.getNumber(state);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] state = new String[]{"SSS", "SSS", "SSS"};

        int expected = 2;
        int actual = solution.getNumber(state);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] state = new String[]{"HSHSHSH", "SSSHSSS", "SSHSHSS", "SHSHSHS"};

        int expected = 1;
        int actual = solution.getNumber(state);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] state = new String[]{"HHSH", "HHHS", "HSSS", "SHSH", "HHHS", "HSHH", "SSSH"};

        int expected = 0;
        int actual = solution.getNumber(state);

        Assert.assertEquals(expected, actual);
    }

}
