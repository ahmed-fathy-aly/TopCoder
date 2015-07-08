import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NetworkXOneTimePadTest {

    protected NetworkXOneTimePad solution;

    @Before
    public void setUp() {
        solution = new NetworkXOneTimePad();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] plaintexts = new String[]{"110", "001"};
        String[] ciphertexts = new String[]{"101", "010"};

        int expected = 2;
        int actual = solution.crack(plaintexts, ciphertexts);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] plaintexts = new String[]{"00", "01", "10", "11"};
        String[] ciphertexts = new String[]{"00", "01", "10", "11"};

        int expected = 4;
        int actual = solution.crack(plaintexts, ciphertexts);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] plaintexts = new String[]{"01", "10"};
        String[] ciphertexts = new String[]{"00"};

        int expected = 2;
        int actual = solution.crack(plaintexts, ciphertexts);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] plaintexts = new String[]{"000", "111", "010", "101", "110", "001"};
        String[] ciphertexts = new String[]{"011", "100"};

        int expected = 6;
        int actual = solution.crack(plaintexts, ciphertexts);

        Assert.assertEquals(expected, actual);
    }

}
