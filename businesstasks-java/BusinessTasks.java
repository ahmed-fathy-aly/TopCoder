import java.util.ArrayList;

public class BusinessTasks
{

	public String getTask(String[] list, int n)
	{
		// make a list with the tasks
		ArrayList<String> tasks = new ArrayList<>();
		for (String task : list) 
			tasks.add(task);
		
		// simulate
		int curr = 0;
		while (tasks.size() > 1)
		{
			int idx = (curr + n-1) % tasks.size();
			curr = idx;
			tasks.remove(idx);
		}
		return tasks.get(0);
	}

}
