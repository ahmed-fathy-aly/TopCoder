import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PuckShotTest {

    protected PuckShot solution;

    @Before
    public void setUp() {
        solution = new PuckShot();
    }

    public static void assertEquals(double expected, double actual) {
        if (Double.isNaN(expected)) {
            Assert.assertTrue("expected: <NaN> but was: <" + actual + ">", Double.isNaN(actual));
            return;
        }
        double delta = Math.max(1e-9, 1e-9 * Math.abs(expected));
        Assert.assertEquals(expected, actual, delta);
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int puckCoord = 2833;
        int[] xCoords = new int[]{1500, 1580};
        int[] yCoords = new int[]{1730, 1730};

        double expected = 47.022170720170784;
        double actual = solution.caromAngle(puckCoord, xCoords, yCoords);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int puckCoord = 2833;
        int[] xCoords = new int[]{2690};
        int[] yCoords = new int[]{500};

        double expected = 44.88563731851585;
        double actual = solution.caromAngle(puckCoord, xCoords, yCoords);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int puckCoord = 2833;
        int[] xCoords = new int[]{2690, 2676};
        int[] yCoords = new int[]{500, 500};

        double expected = -1.0;
        double actual = solution.caromAngle(puckCoord, xCoords, yCoords);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int puckCoord = 55;
        int[] xCoords = new int[]{1479, 1427, 2556, 2834, 2866, 2958, 2763, 2899, 2630};
        int[] yCoords = new int[]{1708, 1726, 487, 471, 121, 446, 473, 266, 380};

        double expected = 21.706043385046158;
        double actual = solution.caromAngle(puckCoord, xCoords, yCoords);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int puckCoord = 1809;
        int[] xCoords = new int[]{1571};
        int[] yCoords = new int[]{1730};

        double expected = 33.18726534329994;
        double actual = solution.caromAngle(puckCoord, xCoords, yCoords);

        assertEquals(expected, actual);
    }

}
