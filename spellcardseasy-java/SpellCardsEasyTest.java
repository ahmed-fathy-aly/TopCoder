import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SpellCardsEasyTest {

    protected SpellCardsEasy solution;

    @Before
    public void setUp() {
        solution = new SpellCardsEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] level = new int[]{1, 1, 1};
        int[] damage = new int[]{10, 20, 30};

        int expected = 60;
        int actual = solution.maxDamage(level, damage);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] level = new int[]{3, 3, 3};
        int[] damage = new int[]{10, 20, 30};

        int expected = 10;
        int actual = solution.maxDamage(level, damage);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] level = new int[]{4, 4, 4};
        int[] damage = new int[]{10, 20, 30};

        int expected = 0;
        int actual = solution.maxDamage(level, damage);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] level = new int[]{50, 1, 50, 1, 50};
        int[] damage = new int[]{10, 20, 30, 40, 50};

        int expected = 60;
        int actual = solution.maxDamage(level, damage);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] level = new int[]{2, 1, 1};
        int[] damage = new int[]{40, 40, 10};

        int expected = 80;
        int actual = solution.maxDamage(level, damage);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] level = new int[]{1, 2, 1, 1, 3, 2, 1};
        int[] damage = new int[]{10, 40, 10, 10, 90, 40, 10};

        int expected = 150;
        int actual = solution.maxDamage(level, damage);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int[] level = new int[]{1, 2, 2, 3, 1, 4, 2};
        int[] damage = new int[]{113, 253, 523, 941, 250, 534, 454};

        int expected = 1577;
        int actual = solution.maxDamage(level, damage);

        Assert.assertEquals(expected, actual);
    }

}
