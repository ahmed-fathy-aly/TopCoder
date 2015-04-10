import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PointInPolygonTest {

    protected PointInPolygon solution;

    @Before
    public void setUp() {
        solution = new PointInPolygon();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] vertices = new String[]{"0 0", "0 10", "10 10", "10 0"};
        int testPointX = 5;
        int testPointY = 5;

        String expected = "INTERIOR";
        String actual = solution.testPoint(vertices, testPointX, testPointY);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] vertices = new String[]{"0 0", "0 10", "10 10", "10 0"};
        int testPointX = 10;
        int testPointY = 15;

        String expected = "EXTERIOR";
        String actual = solution.testPoint(vertices, testPointX, testPointY);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] vertices = new String[]{"0 0", "0 10", "10 10", "10 0"};
        int testPointX = 5;
        int testPointY = 10;

        String expected = "BOUNDARY";
        String actual = solution.testPoint(vertices, testPointX, testPointY);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] vertices = new String[]{"-100 -90", "-100 100", "100 100", "100 -100", "-120 -100", "-120 100", "-130 100", "-130 -110", "110 -110", "110 110", "-110 110", "-110 -90"};
        int testPointX = 0;
        int testPointY = 0;

        String expected = "EXTERIOR";
        String actual = solution.testPoint(vertices, testPointX, testPointY);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] vertices = new String[]{"0 0", "0 1000", "1000 1000", "1000 800", "200 800", "200 600", "600 600", "600 400", "200 400", "200 200", "1000 200", "1000 0"};
        int testPointX = 100;
        int testPointY = 500;

        String expected = "INTERIOR";
        String actual = solution.testPoint(vertices, testPointX, testPointY);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] vertices = new String[]{"0 1000", "1000 1000", "1000 800", "200 800", "200 600", "600 600", "600 400", "200 400", "200 200", "1000 200", "1000 0", "0 0"};
        int testPointX = 322;
        int testPointY = 333;

        String expected = "EXTERIOR";
        String actual = solution.testPoint(vertices, testPointX, testPointY);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String[] vertices = new String[]{"500 0", "500 100", "400 100", "400 200", "300 200", "300 300", "200 300", "200 400", "100 400", "100 500", "0 500", "0 400", "-100 400", "-100 300", "-200 300", "-200 200", "-300 200", "-300 100", "-400 100", "-400 0", "-500 0", "-500 -100", "-400 -100", "-400 -200", "-300 -200", "-300 -300", "-200 -300", "-200 -400", "-100 -400", "-100 -500", "0 -500", "0 -400", "100 -400", "100 -300", "200 -300", "200 -200", "300 -200", "300 -100", "400 -100", "400 0"};
        int testPointX = 200;
        int testPointY = 200;

        String expected = "INTERIOR";
        String actual = solution.testPoint(vertices, testPointX, testPointY);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase7() {
        String[] vertices = new String[]{"1 0", "2 0", "2 1", "3 1", "3 0", "4 0", "4 -1", "5 -1", "5 0", "6 0", "6 2", "0 2", "0 3", "-1 3", "-1 4", "0 4", "0 6", "1 6", "1 7", "0 7", "0 8", "-2 8", "-2 2", "-8 2", "-8 0", "-7 0", "-7 -1", "-6 -1", "-6 0", "-4 0", "-4 1", "-3 1", "-3 0", "-2 0", "-2 -6", "0 -6", "0 -5", "1 -5", "1 -4", "0 -4", "0 -3", "-1 -3", "-1 -2", "0 -2", "0 -1", "1 -1"};
        int testPointX = 0;
        int testPointY = 0;

        String expected = "INTERIOR";
        String actual = solution.testPoint(vertices, testPointX, testPointY);

        Assert.assertEquals(expected, actual);
    }

}
