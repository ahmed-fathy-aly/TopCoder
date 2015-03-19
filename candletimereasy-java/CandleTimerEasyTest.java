import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CandleTimerEasyTest
{

	protected CandleTimerEasy solution;

	@Before
	public void setUp()
	{
		solution = new CandleTimerEasy();
	}

	@Test(timeout = 2000)
	public void testCase0()
	{
		int[] A = new int[]
		{ 0, 1 };
		int[] B = new int[]
		{ 1, 2 };
		int[] len = new int[]
		{ 10, 1 };

		int expected = 2;
		int actual = solution.differentTime(A, B, len);

		Assert.assertEquals(expected, actual);
	}

	 @Test(timeout = 2000)
	 public void testCase1() {
	 int[] A = new int[]{0, 0, 0};
	 int[] B = new int[]{1, 2, 3};
	 int[] len = new int[]{1, 1, 1};
	
	 int expected = 2;
	 int actual = solution.differentTime(A, B, len);
	
	 Assert.assertEquals(expected, actual);
	 }
	
	 @Test(timeout = 2000)
	 public void testCase2() {
	 int[] A = new int[]{0, 0, 0};
	 int[] B = new int[]{1, 2, 3};
	 int[] len = new int[]{1, 2, 3};
	
	 int expected = 4;
	 int actual = solution.differentTime(A, B, len);
	
	 Assert.assertEquals(expected, actual);
	 }
	
	 @Test(timeout = 2000)
	 public void testCase3() {
	 int[] A = new int[]{0, 1, 1, 2, 3, 3, 2, 4};
	 int[] B = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
	 int[] len = new int[]{5, 3, 2, 4, 6, 8, 7, 1};
	
	 int expected = 7;
	 int actual = solution.differentTime(A, B, len);
	
	 Assert.assertEquals(expected, actual);
	 }
	
	 @Test(timeout = 2000)
	 public void testCase4() {
	 int[] A = new int[]{0, 0, 0, 0};
	 int[] B = new int[]{1, 2, 3, 4};
	 int[] len = new int[]{123, 456, 789, 1000};
	
	 int expected = 8;
	 int actual = solution.differentTime(A, B, len);
	
	 Assert.assertEquals(expected, actual);
	 }
	
	 @Test(timeout = 2000)
	 public void testCase5() {
	 int[] A = new int[]{0};
	 int[] B = new int[]{1};
	 int[] len = new int[]{1000};
	
	 int expected = 2;
	 int actual = solution.differentTime(A, B, len);
	
	 Assert.assertEquals(expected, actual);
	 }

}
