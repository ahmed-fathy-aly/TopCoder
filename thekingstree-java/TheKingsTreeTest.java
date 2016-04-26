import java.util.Random;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheKingsTreeTest {

    protected TheKingsTree solution;

    @Before
    public void setUp() {
        solution = new TheKingsTree();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] parent = new int[]{0, 0, 0};

        int expected = 4;
        int actual = solution.getNumber(parent);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] parent = new int[]{0, 1, 2, 3, 4};

        int expected = 12;
        int actual = solution.getNumber(parent);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] parent = new int[]{0, 1, 2, 3, 1};

        int expected = 10;
        int actual = solution.getNumber(parent);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] parent = new int[]{0, 0, 1, 0, 4, 3, 5, 2, 0, 7, 9, 2, 4, 5, 3, 1};

        int expected = 26;
        int actual = solution.getNumber(parent);

        Assert.assertEquals(expected, actual);
    }


    @Test(timeout = 2000)
    public void testCase4() {
        int[] parent = new int[]{};

        int expected = 1;
        int actual = solution.getNumber(parent);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase5() {
        int[] parent = new int[10];
        for (int i = 1; i <= parent.length; i++) 
        	parent[i-1] = new Random().nextInt(i);
		for (int i = 0; i < parent.length; i++) 
			System.out.println(parent[i]);
			
        int expected = 1;
        int actual = solution.getNumber(parent);

        Assert.assertEquals(expected, actual);
    }



}
