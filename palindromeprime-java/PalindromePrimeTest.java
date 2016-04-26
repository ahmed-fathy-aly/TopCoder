import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromePrimeTest {

    protected PalindromePrime solution;

    @Before
    public void setUp() {
        solution = new PalindromePrime();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int L = 100;
        int R = 150;

        int expected = 2;
        int actual = solution.count(L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int L = 1;
        int R = 9;

        int expected = 4;
        int actual = solution.count(L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int L = 929;
        int R = 929;

        int expected = 1;
        int actual = solution.count(L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int L = 1;
        int R = 1;

        int expected = 0;
        int actual = solution.count(L, R);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int L = 1;
        int R = 1000;

        int expected = 20;
        int actual = solution.count(L, R);

        Assert.assertEquals(expected, actual);
    }

  

}
