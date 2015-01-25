import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Boxing
{

	private int[][] arr;
	private ArrayList<Interval> intervals;

	public int maxCredit(int[] a, int[] b, int[] c, int[] d, int[] e)
	{
		// input
		arr = new int[][]
		{ a, b, c, d, e };

		// create all possible intervals
		HashSet<Integer> starts = new HashSet<>();
		for (int[] list : arr) 
			for (int start : list) 
				starts.add(start);
		intervals = new ArrayList<Interval>();
		for (Integer start : starts) 
			for (int length = 0; length <= 1000; length++)
			{
				// find the number of judges who have presses in that period
				int nJudges = 0;
				for (int i = 0; i < 5; i++)
					if (contains(start, start + length, i))
						nJudges++;
				if (nJudges >= 3)
					intervals.add(new Interval(start, start + length));
			}
		
		// sort intervals be earliest finish
		Collections.sort(intervals, new Comparator<Interval>()
		{
			public int compare(Interval i1, Interval i2)
			{
				return Integer.compare(i1.end, i2.end);
			}
		});
		
		// find max number of intervals
		int answer  = 0;
		int currEnd = -1;
		for (Interval interval : intervals) 
			if (interval.start > currEnd)
			{
				answer ++;
				currEnd = interval.end;
			}
		return answer;
	}

	private boolean contains(int start, int end, int idx)
	{
		int[] list = arr[idx];
		if (list.length == 0)
			return false;
		int l = 0;
		int r = list.length - 1;
		while (l <= r)
		{
			int mid = (l + r) / 2;
			if (list[mid] >= start && list[mid] <= end)
				return true;
			else if (list[mid] < start)
				l = mid + 1;
			else
				r = mid - 1;
		}

		return false;
	}


}

class Interval
{
	int start;
	int end;

	public Interval(int start, int end)
	{
		this.start = start;
		this.end = end;
	}

	public String toString()
	{
		return start + "->" + end;
	}
}