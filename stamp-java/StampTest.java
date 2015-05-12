import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StampTest {

    protected Stamp solution;

    @Before
    public void setUp() {
        solution = new Stamp();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String desiredColor = "RRGGBB";
        int stampCost = 1;
        int pushCost = 1;

        int expected = 5;
        int actual = solution.getMinimumCost(desiredColor, stampCost, pushCost);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String desiredColor = "R**GB*";
        int stampCost = 1;
        int pushCost = 1;

        int expected = 5;
        int actual = solution.getMinimumCost(desiredColor, stampCost, pushCost);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String desiredColor = "BRRB";
        int stampCost = 2;
        int pushCost = 7;

        int expected = 30;
        int actual = solution.getMinimumCost(desiredColor, stampCost, pushCost);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String desiredColor = "R*RR*GG";
        int stampCost = 10;
        int pushCost = 58;

        int expected = 204;
        int actual = solution.getMinimumCost(desiredColor, stampCost, pushCost);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String desiredColor = "*B**B**B*BB*G*BBB**B**B*";
        int stampCost = 5;
        int pushCost = 2;

        int expected = 33;
        int actual = solution.getMinimumCost(desiredColor, stampCost, pushCost);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String desiredColor = "*R*RG*G*GR*RGG*G*GGR***RR*GG";
        int stampCost = 7;
        int pushCost = 1;

        int expected = 30;
        int actual = solution.getMinimumCost(desiredColor, stampCost, pushCost);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase6() {
        String desiredColor = "RR*GG";
        int stampCost = 1;
        int pushCost = 100000;

        int expected = 300002;
        int actual = solution.getMinimumCost(desiredColor, stampCost, pushCost);

        Assert.assertEquals(expected, actual);
    }

}
