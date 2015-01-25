public class Time
{

	public String whatTime(int seconds)
	{
		int minutes = seconds / 60;
		int hours = minutes / 60;
		minutes %= 60;
		seconds %= 60;
		return hours + ":" + minutes + ":" + seconds;
	}

}
