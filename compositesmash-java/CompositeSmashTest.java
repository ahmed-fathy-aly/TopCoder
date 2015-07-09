import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CompositeSmashTest {

    protected CompositeSmash solution;

    @Before
    public void setUp() {
        solution = new CompositeSmash();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int N = 517;
        int target = 47;

        String expected = "Yes";
        String actual = solution.thePossible(N, target);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int N = 8;
        int target = 4;

        String expected = "Yes";
        String actual = solution.thePossible(N, target);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int N = 12;
        int target = 6;

        String expected = "No";
        String actual = solution.thePossible(N, target);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int N = 5;
        int target = 8;

        String expected = "No";
        String actual = solution.thePossible(N, target);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int N = 100000;
        int target = 100000;

        String expected = "Yes";
        String actual = solution.thePossible(N, target);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int N = 5858;
        int target = 2;

        String expected = "Yes";
        String actual = solution.thePossible(N, target);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int N = 81461;
        int target = 2809;

        String expected = "No";
        String actual = solution.thePossible(N, target);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase7() {
        int N = 65536;
        int target = 256;

        String expected = "No";
        String actual = solution.thePossible(N, target);

        Assert.assertEquals(expected, actual);
    }

}
