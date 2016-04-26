import java.util.HashMap;

public class BearDartsDiv2
{

	public long count(int[] w)
	{
		long ans = 0;

		// acc count
		HashMap<Long, Integer> m = new HashMap<>();
		for (int k = w.length - 1; k >= 0; k--)
		{
			for (int i = 0; i < k; i++)
				for (int j = i + 1; j < k; j++)
				{
					long req = 1l * w[i] * w[j] * w[k];
					if (m.containsKey(req))
						ans += m.get(req);
				}
			long add = (long)w[k];
			
			if (m.containsKey(add))
				m.put(add, m.get(add) + 1);
			else
				m.put(add, 1);
		}

		return ans;
	}

}
