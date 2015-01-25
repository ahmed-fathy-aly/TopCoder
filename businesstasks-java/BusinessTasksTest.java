import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BusinessTasksTest {

    protected BusinessTasks solution;

    @Before
    public void setUp() {
        solution = new BusinessTasks();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] list = new String[]{"a", "b", "c", "d"};
        int n = 2;

        String expected = "a";
        String actual = solution.getTask(list, n);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] list = new String[]{"a", "b", "c", "d", "e"};
        int n = 3;

        String expected = "d";
        String actual = solution.getTask(list, n);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] list = new String[]{"alpha", "beta", "gamma", "delta", "epsilon"};
        int n = 1;

        String expected = "epsilon";
        String actual = solution.getTask(list, n);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] list = new String[]{"a", "b"};
        int n = 1000;

        String expected = "a";
        String actual = solution.getTask(list, n);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] list = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int n = 17;

        String expected = "n";
        String actual = solution.getTask(list, n);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] list = new String[]{"zlqamum", "yjsrpybmq", "tjllfea", "fxjqzznvg", "nvhekxr", "am", "skmazcey", "piklp", "olcqvhg", "dnpo", "bhcfc", "y", "h", "fj", "bjeoaxglt", "oafduixsz", "kmtbaxu", "qgcxjbfx", "my", "mlhy", "bt", "bo", "q"};
        int n = 9000000;

        String expected = "fxjqzznvg";
        String actual = solution.getTask(list, n);

        Assert.assertEquals(expected, actual);
    }

}
