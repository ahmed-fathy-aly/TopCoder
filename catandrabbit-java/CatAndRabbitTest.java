import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatAndRabbitTest {

    protected CatAndRabbit solution;

    @Before
    public void setUp() {
        solution = new CatAndRabbit();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String tiles = "#..";

        String expected = "Cat";
        String actual = solution.getWinner(tiles);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String tiles = ".#.";

        String expected = "Rabbit";
        String actual = solution.getWinner(tiles);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String tiles = "###";

        String expected = "Rabbit";
        String actual = solution.getWinner(tiles);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String tiles = "#..##.#";

        String expected = "Cat";
        String actual = solution.getWinner(tiles);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String tiles = "...";

        String expected = "Rabbit";
        String actual = solution.getWinner(tiles);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String tiles = "###...####....###...####....";

        String expected = "Rabbit";
        String actual = solution.getWinner(tiles);

        Assert.assertEquals(expected, actual);
    }

}
