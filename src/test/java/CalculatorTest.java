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

    @Test
    public void canSubtractNumbers(){
        assertEquals(3, calculator.subtractNumbers(), 0.01);
    }

    @Test
    public void canMultiplyNumbers() {
        assertEquals(10, calculator.multiplyNumbers(), 0.01);
    }

    @Test
    public void canDivideNumbers() {
        assertEquals(0.4, calculator.divideNumbers(), 0.01);
    }
}
