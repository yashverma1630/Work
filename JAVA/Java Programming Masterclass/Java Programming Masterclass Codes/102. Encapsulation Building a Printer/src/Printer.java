public class Printer {
    private int tonerLevel = 40; // it is the percentage of toner left in the toner cartridge
    private int pagesPrinted; // it is the count of total pages printed
    private boolean duplex; // it is an indicator of whether the printer will print on both sides of a sheet of paper.
                            // True means it can, False means it can only print on one side of paper.


    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <=100)?tonerLevel:-1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){

        int tempAmount = tonerLevel + tonerAmount;
        if(tempAmount > 100 || tempAmount < 0){
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        int jobPages = (duplex)?(pages/2)+(pages%2):pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
