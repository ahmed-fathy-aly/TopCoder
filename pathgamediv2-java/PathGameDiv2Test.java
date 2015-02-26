import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PathGameDiv2Test {

    protected PathGameDiv2 solution;

    @Before
    public void setUp() {
        solution = new PathGameDiv2();
    }

//    @Test(timeout = 2000)
//    public void testCase0() {
//        String[] board = new String[]{"#....", "...#."};
//
//        int expected = 2;
//        int actual = solution.calc(board);
//
//        Assert.assertEquals(expected, actual);
//    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] board = new String[]{"#", "."};

        int expected = 0;
        int actual = solution.calc(board);

		Assert.assertEquals(expected, actual);
    }

//    @Test(timeout = 2000)
//    public void testCase2() {
//        String[] board = new String[]{".", "."};
//
//        int expected = 1;
//        int actual = solution.calc(board);
//
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test(timeout = 2000)
//    public void testCase3() {
//        String[] board = new String[]{"....#.##.....#...........", "..#......#.......#..#...."};
//
//        int expected = 13;
//        int actual = solution.calc(board);
//
//        Assert.assertEquals(expected, actual);
//    }

}
