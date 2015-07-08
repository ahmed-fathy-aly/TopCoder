import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NetworkXMessageRecoveryTest {

    protected NetworkXMessageRecovery solution;

    @Before
    public void setUp() {
        solution = new NetworkXMessageRecovery();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] messages = new String[]{"acd", "bce"};

        String expected = "abcde";
        String actual = solution.recover(messages);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] messages = new String[]{"ed", "dc", "cb", "ba"};

        String expected = "edcba";
        String actual = solution.recover(messages);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] messages = new String[]{"Fox", "Ciel", "FoxCiel"};

        String expected = "FoxCiel";
        String actual = solution.recover(messages);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] messages = new String[]{"a", "A"};

        String expected = "Aa";
        String actual = solution.recover(messages);

        Assert.assertEquals(expected, actual);
    }


    @Test(timeout = 2000)
    public void testCase4() {
        String[] messages = new String[]{"ac", "bed", "aec", "cd"};

        String expected = "abecd";
        String actual = solution.recover(messages);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase5() {
        String[] messages = new String[]{"abc", "ad", "f", "deg"};

        String expected = "abcdefg";
        String actual = solution.recover(messages);

        Assert.assertEquals(expected, actual);
    }

}
