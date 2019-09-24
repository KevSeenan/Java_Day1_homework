import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(25, 3, 1);
    }

    @Test
    public void hasSheetsLeft() {
        assertEquals(25, printer.getSheetsLeft());
    }

    @Test
    public void canPrintSheetsAndCheckCopies() {
        assertEquals(22, printer.printPages());
    }
}
