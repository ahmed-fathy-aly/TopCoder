import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TravelTest {

    protected Travel solution;

    @Before
    public void setUp() {
        solution = new Travel();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] cities = new String[]{"0 0", "0 1"};
        int radius = 1000;

        int expected = 35;
        int actual = solution.shortest(cities, radius);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] cities = new String[]{"0 0", "0 1", "0 -1", "-1 0", "1 0", "-1 -1", "1 1", "1 -1", "-1 1"};
        int radius = 1;

        int expected = 0;
        int actual = solution.shortest(cities, radius);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] cities = new String[]{"40 -82", "-27 -59", "-40 48", "26 -12", "-31 -37", "-30 42", "-36 -23", "-26 71", "-19 83", "8 63"};
        int radius = 698;

        int expected = 4505;
        int actual = solution.shortest(cities, radius);

        Assert.assertEquals(expected, actual);
    }

}
