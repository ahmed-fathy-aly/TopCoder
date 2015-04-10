import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElectronicPetEasyTest {

    protected ElectronicPetEasy solution;

    @Before
    public void setUp() {
        solution = new ElectronicPetEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int st1 = 3;
        int p1 = 3;
        int t1 = 3;
        int st2 = 5;
        int p2 = 2;
        int t2 = 3;

        String expected = "Difficult";
        String actual = solution.isDifficult(st1, p1, t1, st2, p2, t2);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int st1 = 3;
        int p1 = 3;
        int t1 = 3;
        int st2 = 5;
        int p2 = 2;
        int t2 = 2;

        String expected = "Easy";
        String actual = solution.isDifficult(st1, p1, t1, st2, p2, t2);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int st1 = 1;
        int p1 = 4;
        int t1 = 7;
        int st2 = 1;
        int p2 = 4;
        int t2 = 7;

        String expected = "Difficult";
        String actual = solution.isDifficult(st1, p1, t1, st2, p2, t2);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int st1 = 1;
        int p1 = 1000;
        int t1 = 1000;
        int st2 = 2;
        int p2 = 1000;
        int t2 = 1000;

        String expected = "Easy";
        String actual = solution.isDifficult(st1, p1, t1, st2, p2, t2);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int st1 = 1;
        int p1 = 1;
        int t1 = 1;
        int st2 = 2;
        int p2 = 2;
        int t2 = 2;

        String expected = "Easy";
        String actual = solution.isDifficult(st1, p1, t1, st2, p2, t2);

        Assert.assertEquals(expected, actual);
    }

}
