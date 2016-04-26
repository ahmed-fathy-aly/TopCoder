import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FourStringsTest {

    protected FourStrings solution;

    @Before
    public void setUp() {
        solution = new FourStrings();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String a = "abc";
        String b = "ab";
        String c = "bc";
        String d = "b";

        int expected = 3;
        int actual = solution.shortestLength(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String a = "a";
        String b = "bc";
        String c = "def";
        String d = "ghij";

        int expected = 10;
        int actual = solution.shortestLength(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String a = "top";
        String b = "coder";
        String c = "opco";
        String d = "pcode";

        int expected = 8;
        int actual = solution.shortestLength(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String a = "thereare";
        String b = "arelots";
        String c = "lotsof";
        String d = "ofcases";

        int expected = 19;
        int actual = solution.shortestLength(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String a = "aba";
        String b = "b";
        String c = "b";
        String d = "b";

        int expected = 3;
        int actual = solution.shortestLength(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String a = "x";
        String b = "x";
        String c = "x";
        String d = "x";

        int expected = 1;
        int actual = solution.shortestLength(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }
    @Test(timeout = 2000)
    public void testCase6() {
        String a = "aaabab";
        String b = "ba";
        String c = "bbabab";
        String d = "bbbbab";

        int expected = 13;
        int actual = solution.shortestLength(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }
    


}
