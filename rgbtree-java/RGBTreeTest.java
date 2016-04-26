import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RGBTreeTest {

    protected RGBTree solution;

    @Before
    public void setUp() {
        solution = new RGBTree();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] G = new String[]{".RGB", "R...", "G...", "B..."};

        String expected = "Exist";
        String actual = solution.exist(G);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] G = new String[]{".RRB", "R...", "R...", "B..."};

        String expected = "Does not exist";
        String actual = solution.exist(G);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] G = new String[]{".R..BG..G..RG", "R...GG..BR.G.", "...G.GG.RR.BB", "..G.RR.B..GRB", "BG.R.G.BRRR.G", "GGGRG.R....RR", "..G..R.BGRR..", "...BB.B.RB.G.", "GBR.R.GR.B.R.", ".RR.R.RBB.BRB", "...GR.R..B...", "RGBR.R.GRR...", "G.BBGR...B..."};

        String expected = "Exist";
        String actual = solution.exist(G);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] G = new String[]{".............", ".......BB.R..", ".......RR....", ".....G.G....R", "........BB...", "...G.........", "........B...R", ".BRG.......G.", ".BR.B.B...GB.", "....B......GR", ".R......G....", ".......GBG..B", "...R..R..R.B."};

        String expected = "Does not exist";
        String actual = solution.exist(G);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] G = new String[]{"..B.BB...RB..", "......R..B.G.", "B.......BB...", ".......R...G.", "B....GRB..R..", "B...G.RG.R...", ".R..RR..B.RB.", "...RBG...G...", "..B...B......", "RBB..R.G....R", "B...R.R......", ".G.G..B.....R", ".........R.R."};

        String expected = "Exist";
        String actual = solution.exist(G);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] G = new String[]{"....", "....", "....", "...."};

        String expected = "Does not exist";
        String actual = solution.exist(G);

        Assert.assertEquals(expected, actual);
    }

}
