import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SmartWordToyTest {

    protected SmartWordToy solution;

    @Before
    public void setUp() {
        solution = new SmartWordToy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String start = "aaaa";
        String finish = "zzzz";
        String[] forbid = new String[]{"a a a z", "a a z a", "a z a a", "z a a a", "a z z z", "z a z z", "z z a z", "z z z a"};

        int expected = 8;
        int actual = solution.minPresses(start, finish, forbid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String start = "aaaa";
        String finish = "bbbb";
        String[] forbid = new String[]{};

        int expected = 4;
        int actual = solution.minPresses(start, finish, forbid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String start = "aaaa";
        String finish = "mmnn";
        String[] forbid = new String[]{};

        int expected = 50;
        int actual = solution.minPresses(start, finish, forbid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String start = "aaaa";
        String finish = "zzzz";
        String[] forbid = new String[]{"bz a a a", "a bz a a", "a a bz a", "a a a bz"};

        int expected = -1;
        int actual = solution.minPresses(start, finish, forbid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String start = "aaaa";
        String finish = "zzzz";
        String[] forbid = new String[]{"cdefghijklmnopqrstuvwxyz a a a", "a cdefghijklmnopqrstuvwxyz a a", "a a cdefghijklmnopqrstuvwxyz a", "a a a cdefghijklmnopqrstuvwxyz"};

        int expected = 6;
        int actual = solution.minPresses(start, finish, forbid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String start = "aaaa";
        String finish = "bbbb";
        String[] forbid = new String[]{"b b b b"};

        int expected = -1;
        int actual = solution.minPresses(start, finish, forbid);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String start = "zzzz";
        String finish = "aaaa";
        String[] forbid = new String[]{"abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk", "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk"};

        int expected = -1;
        int actual = solution.minPresses(start, finish, forbid);

        Assert.assertEquals(expected, actual);
    }

}
