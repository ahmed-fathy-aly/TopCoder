import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SlimeXSlimesCityTest {

    protected SlimeXSlimesCity solution;

    @Before
    public void setUp() {
        solution = new SlimeXSlimesCity();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] population = new int[]{2, 3, 4};

        int expected = 2;
        int actual = solution.merge(population);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] population = new int[]{1, 2, 3};

        int expected = 2;
        int actual = solution.merge(population);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] population = new int[]{8, 2, 3, 8};

        int expected = 2;
        int actual = solution.merge(population);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] population = new int[]{1000000000, 999999999, 999999998, 999999997};

        int expected = 3;
        int actual = solution.merge(population);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] population = new int[]{1, 1, 1};

        int expected = 3;
        int actual = solution.merge(population);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] population = new int[]{1, 2, 4, 6, 14, 16, 20};

        int expected = 3;
        int actual = solution.merge(population);

        Assert.assertEquals(expected, actual);
    }

}
