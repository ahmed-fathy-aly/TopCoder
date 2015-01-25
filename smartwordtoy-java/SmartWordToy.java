import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SmartWordToy
{

	private boolean[][][][] visited;

	public int minPresses(String start, String finish, String[] forbid)
	{
		// make the forbidden states
		visited = new boolean[26][26][26][26];
		for (String forbidden : forbid)
			removeState(forbidden);

		// bfs from start to end
		int ans = bfs(start, finish);
		return ans;
	}

	private int bfs(String start, String finish)
	{
		// convert the states and add to queue
		State source = toState(start);
		source.dist = 0;
		State dest = toState(finish);
		Queue<State> q = new LinkedList<State>();
		q.add(source);

		// bfs
		while (!q.isEmpty())
		{
			// mark as visited and check if it's the dest
			State state = q.poll();
			if (state.same(dest))
				return state.dist;

			// add next states
			ArrayList<State> nextStates = getNextState(state);
			for (State next : nextStates)
				if (!visited[next.nums[0]][next.nums[1]][next.nums[2]][next.nums[3]])
				{
					visited[next.nums[0]][next.nums[1]][next.nums[2]][next.nums[3]] = true;
					q.add(next);
				}
		}
		return -1;
	}

	private ArrayList<State> getNextState(State state)
	{
		ArrayList<State> result = new ArrayList<>();

		// add up or down
		for (int i = 0; i < 4; i++)
		{
			// up
			State up = new State();
			up.dist = state.dist + 1;
			for (int j = 0; j < 4; j++)
				up.nums[j] = state.nums[j];
			up.nums[i] += 1;
			if (up.nums[i] >= 26)
				up.nums[i] -= 26;
			result.add(up);

			// down
			State down = new State();
			down.dist = state.dist + 1;
			for (int j = 0; j < 4; j++)
				down.nums[j] = state.nums[j];
			down.nums[i] -= 1;
			if (down.nums[i] < 0)
				down.nums[i] += 26;
			result.add(down);
		}

		return result;
	}

	private State toState(String str)
	{
		State result = new State();
		for (int i = 0; i < 4; i++)
			result.nums[i] = str.charAt(i) - 'a';
		return result;
	}

	private void removeState(String forbidden)
	{
		// get the four strings
		StringTokenizer tok = new StringTokenizer(forbidden);
		String a = tok.nextToken();
		String b = tok.nextToken();
		String c = tok.nextToken();
		String d = tok.nextToken();

		// visit all states
		for (int i1 = 0; i1 < a.length(); i1++)
			for (int i2 = 0; i2 < b.length(); i2++)
				for (int i3 = 0; i3 < c.length(); i3++)
					for (int i4 = 0; i4 < d.length(); i4++)
					{
						int idx1 = a.charAt(i1) - 'a';
						int idx2 = b.charAt(i2) - 'a';
						int idx3 = c.charAt(i3) - 'a';
						int idx4 = d.charAt(i4) - 'a';
						visited[idx1][idx2][idx3][idx4] = true;
					}
	}

}

class State
{
	int nums[];
	int dist;

	public State()
	{
		this.nums = new int[4];
	}

	public boolean same(State other)
	{
		for (int i = 0; i < nums.length; i++)
			if (nums[i] != other.nums[i])
				return false;
		return true;
	}

}
