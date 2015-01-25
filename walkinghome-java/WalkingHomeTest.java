import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WalkingHomeTest {

    protected WalkingHome solution;

    @Before
    public void setUp() {
        solution = new WalkingHome();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] map = new String[]{"S.|..", "..|.H"};

        int expected = 1;
        int actual = solution.fewestCrossings(map);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] map = new String[]{"S.|..", "..|.H", "..|..", "....."};

        int expected = 0;
        int actual = solution.fewestCrossings(map);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] map = new String[]{"S.||...", "..||...", "..||...", "..||..H"};

        int expected = 1;
        int actual = solution.fewestCrossings(map);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] map = new String[]{"S.....", "---*--", "...|..", "...|.H"};

        int expected = 1;
        int actual = solution.fewestCrossings(map);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] map = new String[]{"S.F..", "..F..", "--*--", "..|..", "..|.H"};

        int expected = 2;
        int actual = solution.fewestCrossings(map);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] map = new String[]{"H|.|.|.|.|.|.|.|.|.|.|.|.|.", "F|F|F|F|F|F|F|F|F|F|F|F|F|-", "S|.|.|.|.|.|.|.|.|.|.|.|.|."};

        int expected = 27;
        int actual = solution.fewestCrossings(map);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String[] map = new String[]{"S-H"};

        int expected = -1;
        int actual = solution.fewestCrossings(map);

        Assert.assertEquals(expected, actual);
    }

}
