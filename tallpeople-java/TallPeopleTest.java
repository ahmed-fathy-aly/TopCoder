import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TallPeopleTest {

    protected TallPeople solution;

    @Before
    public void setUp() {
        solution = new TallPeople();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] people = new String[]{"9 2 3", "4 8 7"};

        int[] expected = new int[]{4, 7};
        int[] actual = solution.getPeople(people);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] people = new String[]{"1 2", "4 5", "3 6"};

        int[] expected = new int[]{4, 4};
        int[] actual = solution.getPeople(people);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] people = new String[]{"1 1", "1 1"};

        int[] expected = new int[]{1, 1};
        int[] actual = solution.getPeople(people);

        Assert.assertArrayEquals(expected, actual);
    }

}
