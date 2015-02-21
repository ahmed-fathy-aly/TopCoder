import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlayingCubesTest {

    protected PlayingCubes solution;

    @Before
    public void setUp() {
        solution = new PlayingCubes();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] cubes = new String[]{"ABCDEF", "DEFGHI", "OPQRST", "ZZZZZZ", "YYYYYY"};
        String[] words = new String[]{"CAT", "DOG", "PIZZA"};

        int[] expected = new int[]{1};
        int[] actual = solution.composeWords(cubes, words);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] cubes = new String[]{"ABCDEF", "DEFGHI", "OPQRST", "MNZLSA", "QEIOGH", "IARJGS"};
        String[] words = new String[]{"DOG", "CAT", "MOUSE", "BIRD", "CHICKEN", "PIG", "ANIMAL"};

        int[] expected = new int[]{0, 1, 3, 5};
        int[] actual = solution.composeWords(cubes, words);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] cubes = new String[]{"AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA"};
        String[] words = new String[]{"AA", "AAA", "AAAA", "AAAAA", "AAAAAA"};

        int[] expected = new int[]{0, 1, 2};
        int[] actual = solution.composeWords(cubes, words);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] cubes = new String[]{"ABCDEF", "DEFGHI", "OPQRST", "ZZZZZZ", "ZZZZZZ"};
        String[] words = new String[]{"CAT", "DOG", "PIZZA"};

        int[] expected = new int[]{1, 2};
        int[] actual = solution.composeWords(cubes, words);

        Assert.assertArrayEquals(expected, actual);
    }

}
