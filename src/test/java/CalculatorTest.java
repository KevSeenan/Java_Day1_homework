import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(2.00, 5.00);

    }

    @Test
    public void canAddNumbers(){
        assertEquals(7.00, calculator.addNumbers(), 0.01);
    }
}
