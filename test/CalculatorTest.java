import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

/**
 * Written by Katsuhiko Ishiguro <ishiguro.katsuhiko@lab.ntt.co.jp>
 * Last update: 04/19, 2016
 */

public class CalculatorTest {

    @Before
    public void setUp() throws Exception {

        //TODO: implement the setUp
    }

    @After
    public void tearDown() throws Exception {

        // implement the tearDown
    }

    @Test
    public void testMultiply3Times4() throws Exception {

       Calculator calc = new Calculator();
        int expected = 12;
        int actual = calc.multiply(3, 4);
        assertThat(actual, is(expected));
    }

    @Test
    public void testDivide3By2() throws Exception {
        Calculator calc = new Calculator();
        float expected = 1.5f;
        float actual = calc.divide(3, 2);
        assertThat(actual, is(expected));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideIllegalArgumentExceptionForZeroDivide() {
        Calculator calc = new Calculator();
        calc.divide(5, 0);
    }
}