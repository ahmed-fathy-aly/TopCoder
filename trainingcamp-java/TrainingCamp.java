public class TrainingCamp
{

	public String[] determineSolvers(String[] attendance, String[] problemTopics)
	{
		int nStudents = attendance.length;
		int nDays = attendance[0].length();
		int nProblems = problemTopics.length;

		String[] ans = new String[nStudents];
		for (int i = 0; i < nStudents; i++)
		{
			String str = "";
			for (int j = 0; j < nProblems; j++)
			{
				boolean can = true;
				for (int d = 0; d < nDays; d++)
					if (problemTopics[j].charAt(d) == 'X')
						if (attendance[i].charAt(d) != 'X')
							can = false;
				if (can)
					str += "X";
				else
					str += "-";
			}

			ans[i] = str;
		}

		return ans;
	}

}
