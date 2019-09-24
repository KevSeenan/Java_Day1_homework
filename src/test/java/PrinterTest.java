import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(25);
    }

    @Test
    public void hasSheetsLeft() {
        assertEquals(25, printer.getSheetsLeft());
    }

//    @Test
//    public void canPrintSheetsAndCheckCopies() {
//        printer.printPages();
//        assertEquals(22, printer.getSheetsLeft());
//    }
}
