public class Printer {

    private int sheetsLeft;
    private int sheetsPrinted;
    private int copies;

    public Printer(int sheetsLeft, int sheetsPrinted, int copies) {
        this.sheetsLeft = sheetsLeft;
        this.sheetsPrinted = sheetsPrinted;
        this.copies = copies;
    }

    public int getSheetsLeft() {
        return sheetsLeft;
    }

    public void setSheetsLeft(int sheetsLeft) {
        this.sheetsLeft = sheetsLeft;
    }

    public int getSheetsPrinted() {
        return sheetsPrinted;
    }

    public void setSheetsPrinted(int sheetsPrinted) {
        this.sheetsPrinted = sheetsPrinted;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public int printPages() {
        int printedPages = sheetsLeft - sheetsPrinted;
        return printedPages * getCopies();
    }
}
