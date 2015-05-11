import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MirrorsTest {

    protected Mirrors solution;

    @Before
    public void setUp() {
        solution = new Mirrors();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] mirrors = new String[]{"0 0 100 100"};
        String[] objects = new String[]{"a 15 10"};
        int[] start = new int[]{10, 5, 90};

        String expected = "a";
        String actual = solution.seen(mirrors, objects, start);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] mirrors = new String[]{"0 0 100 100"};
        String[] objects = new String[]{"a 15 10"};
        int[] start = new int[]{10, 5, 180};

        String expected = "space";
        String actual = solution.seen(mirrors, objects, start);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] mirrors = new String[]{"0 0 100 100"};
        String[] objects = new String[]{"a 15 10"};
        int[] start = new int[]{20, 5, 135};

        String expected = "a";
        String actual = solution.seen(mirrors, objects, start);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] mirrors = new String[]{"0 0 0 1000", "1000 0 999 1000"};
        String[] objects = new String[]{"a 500 152"};
        int[] start = new int[]{2, 0, 1};

        String expected = "a";
        String actual = solution.seen(mirrors, objects, start);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] mirrors = new String[]{"10 0 20 0"};
        String[] objects = new String[]{"a 30 0"};
        int[] start = new int[]{0, 0, 0};

        String expected = "a";
        String actual = solution.seen(mirrors, objects, start);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase5() {
        String[] mirrors = new String[]{"-50 50 50 50"};
        String[] objects = new String[]{"a 0 100"};
        int[] start = new int[]{0, 0, 90};

        String expected = "me";
        String actual = solution.seen(mirrors, objects, start);

        Assert.assertEquals(expected, actual);
    }

}
