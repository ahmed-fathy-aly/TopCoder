import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValueHistogramTest {

    protected ValueHistogram solution;

    @Before
    public void setUp() {
        solution = new ValueHistogram();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] values = new int[]{2, 3, 5, 5, 5, 2, 0, 8};

        String[] expected = new String[]{"..........", ".....X....", "..X..X....", "X.XX.X..X."};
        String[] actual = solution.build(values);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] values = new int[]{9, 9, 9, 9};

        String[] expected = new String[]{"..........", ".........X", ".........X", ".........X", ".........X"};
        String[] actual = solution.build(values);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] values = new int[]{6, 4, 0, 0, 3, 9, 8, 8};

        String[] expected = new String[]{"..........", "X.......X.", "X..XX.X.XX"};
        String[] actual = solution.build(values);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] values = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        String[] expected = new String[]{"..........", "XXXXXXXXXX"};
        String[] actual = solution.build(values);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] values = new int[]{6, 2, 3, 3, 3, 7, 8, 1, 0, 9, 2, 2, 4, 3};

        String[] expected = new String[]{"..........", "...X......", "..XX......", "..XX......", "XXXXX.XXXX"};
        String[] actual = solution.build(values);

        Assert.assertArrayEquals(expected, actual);
    }

}
