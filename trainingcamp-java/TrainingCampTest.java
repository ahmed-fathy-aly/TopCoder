import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrainingCampTest {

    protected TrainingCamp solution;

    @Before
    public void setUp() {
        solution = new TrainingCamp();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] attendance = new String[]{"XXX", "XXX", "XX-"};
        String[] problemTopics = new String[]{"---", "XXX", "-XX", "XX-"};

        String[] expected = new String[]{"XXXX", "XXXX", "X--X"};
        String[] actual = solution.determineSolvers(attendance, problemTopics);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] attendance = new String[]{"-XXXX", "----X", "XXX--", "X-X-X"};
        String[] problemTopics = new String[]{"X---X", "-X---", "XXX--", "--X--"};

        String[] expected = new String[]{"-X-X", "----", "-XXX", "X--X"};
        String[] actual = solution.determineSolvers(attendance, problemTopics);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] attendance = new String[]{"-----", "XXXXX"};
        String[] problemTopics = new String[]{"XXXXX", "-----", "--X-X"};

        String[] expected = new String[]{"-X-", "XXX"};
        String[] actual = solution.determineSolvers(attendance, problemTopics);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] attendance = new String[]{"-", "X", "X", "-", "X"};
        String[] problemTopics = new String[]{"-", "X"};

        String[] expected = new String[]{"X-", "XX", "XX", "X-", "XX"};
        String[] actual = solution.determineSolvers(attendance, problemTopics);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] attendance = new String[]{"X----X--X", "X--X-X---", "--X-X----", "XXXX-X-X-", "XXXX--XXX"};
        String[] problemTopics = new String[]{"X----X-X-", "-----X---", "-X----X-X", "-X-X-X---", "-----X---", "X-------X"};

        String[] expected = new String[]{"-X--XX", "-X--X-", "------", "XX-XX-", "--X--X"};
        String[] actual = solution.determineSolvers(attendance, problemTopics);

        Assert.assertArrayEquals(expected, actual);
    }

}
