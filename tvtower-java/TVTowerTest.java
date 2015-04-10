import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TVTowerTest {

    protected TVTower solution;

    @Before
    public void setUp() {
        solution = new TVTower();
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
        int[] x = new int[]{1, 0, -1, 0};
        int[] y = new int[]{0, 1, 0, -1};

        double expected = 1.0;
        double actual = solution.minRadius(x, y);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] x = new int[]{3};
        int[] y = new int[]{299};

        double expected = 0.0;
        double actual = solution.minRadius(x, y);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] x = new int[]{5, 3, -4, 2};
        int[] y = new int[]{0, 4, 3, 2};

        double expected = 4.743416490252569;
        double actual = solution.minRadius(x, y);

        assertEquals(expected, actual);
    }

}
