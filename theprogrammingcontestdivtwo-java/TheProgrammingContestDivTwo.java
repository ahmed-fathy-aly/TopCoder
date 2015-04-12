import java.util.Arrays;

public class TheProgrammingContestDivTwo
{

	public int[] find(int T, int[] requiredTime)
	{
		int count = 0;
		int penalty = 0;
		int currTime = 0;
		Arrays.sort(requiredTime);
		for (int i = 0; i < requiredTime.length; i++)
			if (currTime + requiredTime[i] <= T)
			{
				count++;
				currTime += requiredTime[i];
				penalty += currTime;
			} else
				break;

		return new int[]
		{ count, penalty };
	}

}
