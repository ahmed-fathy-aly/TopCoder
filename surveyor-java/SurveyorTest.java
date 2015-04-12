import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SurveyorTest {

    protected Surveyor solution;

    @Before
    public void setUp() {
        solution = new Surveyor();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String direction = "NWWSE";
        int[] length = new int[]{10, 3, 7, 10, 10};

        int expected = 100;
        int actual = solution.area(direction, length);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String direction = "NESWNWSW";
        int[] length = new int[]{20, 200, 30, 100, 20, 30, 10, 70};

        int expected = 4700;
        int actual = solution.area(direction, length);

        Assert.assertEquals(expected, actual);
    }

}
