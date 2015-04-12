import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheCowDivTwoTest {

    protected TheCowDivTwo solution;

    @Before
    public void setUp() {
        solution = new TheCowDivTwo();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 7;
        int K = 4;

        int expected = 5;
        int actual = solution.find(N, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 1;
        int K = 1;

        int expected = 1;
        int actual = solution.find(N, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 58;
        int K = 4;

        int expected = 7322;
        int actual = solution.find(N, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 502;
        int K = 7;

        int expected = 704466492;
        int actual = solution.find(N, K);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 10000)
    public void testCase4() {
        int N = 1000;
        int K = 47;

        int expected = 219736903;
        int actual = solution.find(N, K);

        Assert.assertEquals(expected, actual);
    }

}
