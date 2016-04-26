import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IstrTest {

    protected Istr solution;

    @Before
    public void setUp() {
        solution = new Istr();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String s = "aba";
        int k = 1;

        int expected = 2;
        int actual = solution.count(s, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String s = "abacaba";
        int k = 0;

        int expected = 21;
        int actual = solution.count(s, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String s = "abacaba";
        int k = 1;

        int expected = 14;
        int actual = solution.count(s, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String s = "abacaba";
        int k = 3;

        int expected = 6;
        int actual = solution.count(s, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String s = "abc";
        int k = 3;

        int expected = 0;
        int actual = solution.count(s, k);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String s = "wersrsresesrsesrawsdsw";
        int k = 11;

        int expected = 23;
        int actual = solution.count(s, k);

        Assert.assertEquals(expected, actual);
    }

}
