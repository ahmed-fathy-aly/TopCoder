import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IdentifyingWoodTest {

    protected IdentifyingWood solution;

    @Before
    public void setUp() {
        solution = new IdentifyingWood();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String s = "absdefgh";
        String t = "asdf";

        String expected = "Yep, it's wood.";
        String actual = solution.check(s, t);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String s = "oxoxoxox";
        String t = "ooxxoo";

        String expected = "Nope.";
        String actual = solution.check(s, t);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String s = "oxoxoxox";
        String t = "xxx";

        String expected = "Yep, it's wood.";
        String actual = solution.check(s, t);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String s = "qwerty";
        String t = "qwerty";

        String expected = "Yep, it's wood.";
        String actual = solution.check(s, t);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String s = "string";
        String t = "longstring";

        String expected = "Nope.";
        String actual = solution.check(s, t);

        Assert.assertEquals(expected, actual);
    }

}
