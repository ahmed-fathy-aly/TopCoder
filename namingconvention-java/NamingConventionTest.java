import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NamingConventionTest {

    protected NamingConvention solution;

    @Before
    public void setUp() {
        solution = new NamingConvention();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String variableName = "sum_of_two_numbers";

        String expected = "sumOfTwoNumbers";
        String actual = solution.toCamelCase(variableName);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String variableName = "variable";

        String expected = "variable";
        String actual = solution.toCamelCase(variableName);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String variableName = "t_o_p_c_o_d_e_r";

        String expected = "tOPCODER";
        String actual = solution.toCamelCase(variableName);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String variableName = "the_variable_name_can_be_very_long_like_this";

        String expected = "theVariableNameCanBeVeryLongLikeThis";
        String actual = solution.toCamelCase(variableName);

        Assert.assertEquals(expected, actual);
    }

}
