import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FiveHundredElevenTest {

    protected FiveHundredEleven solution;

    @Before
    public void setUp() {
        solution = new FiveHundredEleven();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] cards = new int[]{3, 5, 7, 9, 510};

        String expected = "Fox Ciel";
        String actual = solution.theWinner(cards);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] cards = new int[]{0, 0, 0, 0};

        String expected = "Toastman";
        String actual = solution.theWinner(cards);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] cards = new int[]{511};

        String expected = "Toastman";
        String actual = solution.theWinner(cards);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] cards = new int[]{5, 58, 192, 256};

        String expected = "Fox Ciel";
        String actual = solution.theWinner(cards);

        Assert.assertEquals(expected, actual);
    }

}
