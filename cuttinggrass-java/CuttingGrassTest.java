import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CuttingGrassTest {

    protected CuttingGrass solution;

    @Before
    public void setUp() {
        solution = new CuttingGrass();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] init = new int[]{5, 8, 58};
        int[] grow = new int[]{2, 1, 1};
        int H = 16;

        int expected = 1;
        int actual = solution.theMin(init, grow, H);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] init = new int[]{5, 8};
        int[] grow = new int[]{2, 1};
        int H = 58;

        int expected = 0;
        int actual = solution.theMin(init, grow, H);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] init = new int[]{5, 8};
        int[] grow = new int[]{2, 1};
        int H = 0;

        int expected = -1;
        int actual = solution.theMin(init, grow, H);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] init = new int[]{5, 1, 6, 5, 8, 4, 7};
        int[] grow = new int[]{2, 1, 1, 1, 4, 3, 2};
        int H = 33;

        int expected = 5;
        int actual = solution.theMin(init, grow, H);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] init = new int[]{49, 13, 62, 95, 69, 75, 62, 96, 97, 22, 69, 69, 52};
        int[] grow = new int[]{7, 2, 4, 3, 6, 5, 7, 6, 5, 4, 7, 7, 4};
        int H = 517;

        int expected = 8;
        int actual = solution.theMin(init, grow, H);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] init = new int[]{1231, 1536, 1519, 1940, 1539, 1385, 1599, 1613, 1394, 1803, 1763, 1706, 1863, 1452, 1818, 1914, 1386, 1954, 1496, 1722, 1616, 1862, 1755, 1215, 1233, 1078, 1448, 1241, 1732, 1561, 1633, 1307, 1844, 1911, 1371, 1338, 1989, 1789, 1656, 1413, 1929, 1182, 1815, 1474, 1540, 1797, 1586, 1427, 1996, 1202};
        int[] grow = new int[]{86, 55, 2, 86, 96, 71, 81, 53, 79, 22, 23, 8, 69, 32, 35, 39, 30, 18, 92, 64, 88, 1, 48, 81, 91, 75, 44, 77, 3, 33, 9, 52, 56, 4, 19, 73, 52, 18, 8, 77, 91, 59, 50, 62, 42, 87, 89, 24, 71, 67};
        int H = 63601;

        int expected = 36;
        int actual = solution.theMin(init, grow, H);

        Assert.assertEquals(expected, actual);
    }

}
