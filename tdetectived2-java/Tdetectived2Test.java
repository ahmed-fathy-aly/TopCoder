import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Tdetectived2Test {

    protected Tdetectived2 solution;

    @Before
    public void setUp() {
        solution = new Tdetectived2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] s = new String[]{"000", "000", "000"};

        int expected = 3;
        int actual = solution.reveal(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] s = new String[]{"0224", "2011", "2104", "4140"};

        int expected = 10;
        int actual = solution.reveal(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] s = new String[]{"0886", "8086", "8801", "6610"};

        int expected = 12;
        int actual = solution.reveal(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] s = new String[]{"064675511", "603525154", "430262731", "652030511", "726302420", "552020464", "517544052", "153126500", "141104200"};

        int expected = 170;
        int actual = solution.reveal(s);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] s = new String[]{"0313131", "3030020", "1301132", "3010031", "1010003", "3233003", "1021330"};

        int expected = 37;
        int actual = solution.reveal(s);

        Assert.assertEquals(expected, actual);
    }

}
