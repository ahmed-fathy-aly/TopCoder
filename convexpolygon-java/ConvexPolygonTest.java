import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConvexPolygonTest {

    protected ConvexPolygon solution;

    @Before
    public void setUp() {
        solution = new ConvexPolygon();
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
        int[] x = new int[]{0, 0, 1};
        int[] y = new int[]{0, 1, 0};

        double expected = 0.5;
        double actual = solution.findArea(x, y);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] x = new int[]{-10000, -10000, 10000, 10000};
        int[] y = new int[]{10000, -10000, -10000, 10000};

        double expected = 4.0E8;
        double actual = solution.findArea(x, y);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] x = new int[]{100, 80, 30, -30, -80, -100, -80, -30, 30, 80};
        int[] y = new int[]{0, 58, 95, 95, 58, 0, -58, -95, -95, -58};

        double expected = 29020.0;
        double actual = solution.findArea(x, y);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] x = new int[]{-1646, -9172, -9830, -9802, -9749, -9474, -8668, -6832, 120, 8380, 9338, 9307, 8042};
        int[] y = new int[]{-9998, -8619, -7863, 3976, 4541, 5975, 8127, 9500, 9612, 8734, 5216, -9042, -9689};

        double expected = 3.55115104E8;
        double actual = solution.findArea(x, y);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] x = new int[]{-6010, -7937, -8782, -9506, -9654, -9852, -9854, -9998, -9999, -9996, -9901, -9811, -9444, -8798, -8580, -2085, 6842, 8339, 9827, 9946, 9993, 9959, 9940, 9855, 9657, 8504, 8262, 7552, 6326, 5537, 4723};
        int[] y = new int[]{-9976, -9947, -9873, -9739, -9654, -8501, -8475, -5009, 475, 4926, 7078, 8673, 9417, 9785, 9820, 9974, 9986, 9979, 9862, 9211, -5070, -6599, -7121, -8624, -8912, -9710, -9766, -9863, -9914, -9941, -9962};

        double expected = 3.939960635E8;
        double actual = solution.findArea(x, y);

        assertEquals(expected, actual);
    }

}
