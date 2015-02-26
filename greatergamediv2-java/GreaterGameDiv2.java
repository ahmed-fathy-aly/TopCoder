public class GreaterGameDiv2
{

	public int calc(int[] snuke, int[] sothe)
	{
		int count  = 0;
		for (int i = 0; i < snuke.length; i++) 
			if (snuke[i] > sothe[i])
				count++;
		return count;
	}

}
