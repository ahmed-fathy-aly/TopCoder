public class PalindromePrime {

	public int count(int L, int R) {
		int count = 0;
		for (int i =L; i <= R; i++) 
			if (isPalindrome(i + "") && isPrime(i)) 
				count++;
		return count;
	}

	private boolean isPrime(int x)
	{
		if (x < 2) 
			return false;
		for (int i = 2; i*i <= x; i++) 
			if (x % i == 0) 
				return false;
		return true;
	}

	private boolean isPalindrome(String str)
	{
		int l = 0;
		int r = str.length() - 1;
		while(l < r)
		{
			if (str.charAt(l) != str.charAt(r)) 
				return false;
			l++;
			r--;
		}
		return true;
	}

}
