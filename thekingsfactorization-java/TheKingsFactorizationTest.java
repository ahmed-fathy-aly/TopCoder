import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TheKingsFactorizationTest {

    protected TheKingsFactorization solution;

    @Before
    public void setUp() {
        solution = new TheKingsFactorization();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        long N = 12L;
        long[] primes = new long[]{2L, 3L};

        long[] expected = new long[]{2L, 2L, 3L};
        long[] actual = solution.getVector(N, primes);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        long N = 7L;
        long[] primes = new long[]{7L};

        long[] expected = new long[]{7L};
        long[] actual = solution.getVector(N, primes);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        long N = 1764L;
        long[] primes = new long[]{2L, 3L, 7L};

        long[] expected = new long[]{2L, 2L, 3L, 3L, 7L, 7L};
        long[] actual = solution.getVector(N, primes);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        long N = 49L;
        long[] primes = new long[]{7L};

        long[] expected = new long[]{7L, 7L};
        long[] actual = solution.getVector(N, primes);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        long N = 210L;
        long[] primes = new long[]{2L, 5L};

        long[] expected = new long[]{2L, 3L, 5L, 7L};
        long[] actual = solution.getVector(N, primes);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        long N = 100000L;
        long[] primes = new long[]{2L, 2L, 2L, 5L, 5L};

        long[] expected = new long[]{2L, 2L, 2L, 2L, 2L, 5L, 5L, 5L, 5L, 5L};
        long[] actual = solution.getVector(N, primes);

        Assert.assertArrayEquals(expected, actual);
    }

}
