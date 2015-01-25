import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CaptureThemAllTest {

    protected CaptureThemAll solution;

    @Before
    public void setUp() {
        solution = new CaptureThemAll();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String knight = "a1";
        String rook = "b3";
        String queen = "c5";

        int expected = 2;
        int actual = solution.fastKnight(knight, rook, queen);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String knight = "b1";
        String rook = "c3";
        String queen = "a3";

        int expected = 3;
        int actual = solution.fastKnight(knight, rook, queen);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String knight = "a1";
        String rook = "a2";
        String queen = "b2";

        int expected = 6;
        int actual = solution.fastKnight(knight, rook, queen);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String knight = "a5";
        String rook = "b7";
        String queen = "e4";

        int expected = 3;
        int actual = solution.fastKnight(knight, rook, queen);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String knight = "h8";
        String rook = "e2";
        String queen = "d2";

        int expected = 6;
        int actual = solution.fastKnight(knight, rook, queen);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String knight = "b6";
        String rook = "d3";
        String queen = "a5";

        int expected = 5;
        int actual = solution.fastKnight(knight, rook, queen);

        Assert.assertEquals(expected, actual);
    }

}
