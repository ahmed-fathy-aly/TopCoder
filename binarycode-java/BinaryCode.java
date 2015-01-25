public class BinaryCode
{

	public String[] decode(String message)
	{
		String[] result = new String[2];

		// put the message in an aray
		int n = message.length();
		int encrypted[] = new int[n];
		for (int i = 0; i < n; i++)
			encrypted[i] = Integer.parseInt(message.charAt(i) + "");

		// beings with zero
		StringBuilder ans = new StringBuilder();
		ans.append("0");
		boolean failed = false;
		int prev = 0;
		int curr = 0;
		for (int i = 0; i < n - 1; i++)
		{
			int newCurr = encrypted[i] - prev - curr;
			if (newCurr != 0 && newCurr != 1)
				failed = true;
			ans.append(newCurr);
			prev = curr;
			curr = newCurr;
		}
		if (encrypted[n - 1] != prev + curr)
			failed = true;
		if (failed)
			result[0] = "NONE";
		else
			result[0] = ans.toString();

		// beings with one
		ans = new StringBuilder();
		ans.append("1");
		failed = false;
		prev = 0;
		curr = 1;
		for (int i = 0; i < n - 1; i++)
		{
			int newCurr = encrypted[i] - prev - curr;
			if (newCurr != 0 && newCurr != 1)
				failed = true;
			ans.append(newCurr);
			prev = curr;
			curr = newCurr;
		}
		if (encrypted[n - 1] != prev + curr)
			failed = true;
		if (failed)
			result[1] = "NONE";
		else
			result[1] = ans.toString();

		return result;
	}

}
