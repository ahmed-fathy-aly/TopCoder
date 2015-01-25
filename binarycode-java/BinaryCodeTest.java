import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryCodeTest {

    protected BinaryCode solution;

    @Before
    public void setUp() {
        solution = new BinaryCode();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String message = "123210122";

        String[] expected = new String[]{"011100011", "NONE"};
        String[] actual = solution.decode(message);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String message = "11";

        String[] expected = new String[]{"01", "10"};
        String[] actual = solution.decode(message);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String message = "22111";

        String[] expected = new String[]{"NONE", "11001"};
        String[] actual = solution.decode(message);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String message = "123210120";

        String[] expected = new String[]{"NONE", "NONE"};
        String[] actual = solution.decode(message);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String message = "3";

        String[] expected = new String[]{"NONE", "NONE"};
        String[] actual = solution.decode(message);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String message = "12221112222221112221111111112221111";

        String[] expected = new String[]{"01101001101101001101001001001101001", "10110010110110010110010010010110010"};
        String[] actual = solution.decode(message);

        Assert.assertArrayEquals(expected, actual);
    }

}
