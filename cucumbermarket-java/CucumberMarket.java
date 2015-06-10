import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CucumberMarket
{

	public String check(int[] price, int budget, int k)
	{
		Arrays.sort(price);
		int start = 0;
		int count = 0;
		for (int i = price.length - 1; i >= 0; i--)
			if (count < k)
			{
				start += price[i];
				count++;
			}
		count = start - count;
		return start <= budget ? "YES" : "NO";
	}
}
