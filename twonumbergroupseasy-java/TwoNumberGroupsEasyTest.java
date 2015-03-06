import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoNumberGroupsEasyTest
{

	protected TwoNumberGroupsEasy solution;

	@Before
	public void setUp()
	{
		solution = new TwoNumberGroupsEasy();
	}

	@Test(timeout = 2000)
	public void testCase0()
	{
		int[] A = new int[]
		{ 1, 2, 3, 4 };
		int[] numA = new int[]
		{ 2, 1, 1, 1 };
		int[] B = new int[]
		{ 5, 6, 7, 8 };
		int[] numB = new int[]
		{ 1, 1, 1, 2 };

		int expected = 2;
		int actual = solution.solve(A, numA, B, numB);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1()
	{
		int[] A = new int[]
		{ 5, 7 };
		int[] numA = new int[]
		{ 1, 1 };
		int[] B = new int[]
		{ 12, 14 };
		int[] numB = new int[]
		{ 1, 1 };

		int expected = 0;
		int actual = solution.solve(A, numA, B, numB);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2()
	{
		int[] A = new int[]
		{ 100 };
		int[] numA = new int[]
		{ 2 };
		int[] B = new int[]
		{ 1 };
		int[] numB = new int[]
		{ 1 };

		int expected = 1;
		int actual = solution.solve(A, numA, B, numB);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3()
	{
		int[] A = new int[]
		{ 1 };
		int[] numA = new int[]
		{ 1 };
		int[] B = new int[]
		{ 1 };
		int[] numB = new int[]
		{ 1 };

		int expected = 0;
		int actual = solution.solve(A, numA, B, numB);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4()
	{
		int[] A = new int[]
		{ 5 };
		int[] numA = new int[]
		{ 1 };
		int[] B = new int[]
		{ 6 };
		int[] numB = new int[]
		{ 1 };

		int expected = 2;
		int actual = solution.solve(A, numA, B, numB);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5()
	{
		int[] A = new int[]
		{ 733815053, 566264976, 984867861, 989991438, 407773802, 701974785, 599158121, 713333928,
				530987873, 702824160 };
		int[] numA = new int[]
		{ 8941, 4607, 1967, 2401, 495, 7654, 7078, 4213, 5485, 1026 };
		int[] B = new int[]
		{ 878175560, 125398919, 556001255, 570171347, 643069772, 787443662, 166157535, 480000834,
				754757229, 101000799 };
		int[] numB = new int[]
		{ 242, 6538, 7921, 2658, 1595, 3049, 655, 6945, 7350, 6915 };

		int expected = 7;
		int actual = solution.solve(A, numA, B, numB);

		Assert.assertEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase6()
	{
		int[] A = new int[]
		{ 733815053, 566264976, 984867861, 989991438, 407773802, 701974785, 599158121, 713333928,
				530987873, 702824160 };
		int[] numA = new int[]
		{ 8941, 4607, 1967, 2401, 495, 7654, 7078, 4213, 5485, 1026 };
		int[] B = new int[]
		{ 878175560, 125398919, 556001255, 570171347, 643069772, 787443662, 166157535, 480000834,
				754757229, 101000799 };
		int[] numB = new int[]
		{ 242, 6538, 7921, 2658, 1595, 3049, 655, 6945, 7350, 6915 };

		int expected = 7;
		int actual = solution.solve(	new int[]{430350320, 971879724, 819555822, 618069789, 820793969, 464877445, 107016554, 86390274, 391108280, 540258889}, new int[]{39731, 55729, 24214, 46461, 73810, 58578, 69484, 37782, 83709, 80782}, new int[]{530619812, 642378547, 778990645, 121421934, 736416946, 703439938, 430051618, 73608085}, new int[]{20738, 52738, 3407, 96305, 35120, 28629, 23211, 43461});

		Assert.assertEquals(expected, actual);
	}

}
