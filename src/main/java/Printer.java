public class Printer {

    private int sheetsLeft;
//    private int sheetsPrinted;
//    private int copies;

    public Printer(int sheetsLeft) {
        this.sheetsLeft = sheetsLeft;
//        this.sheetsPrinted = sheetsPrinted;
//        this.copies = copies;
    }

    public int getSheetsLeft() {
        return sheetsLeft;
    }

    public void setSheetsLeft(int sheetsLeft) {
        this.sheetsLeft = sheetsLeft;
    }

//    public int printPages() {
//        sheetsLeft  = copies * sheetsPrinted;
//        return copies;
//    }
}
