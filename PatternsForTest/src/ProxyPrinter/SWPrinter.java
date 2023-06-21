package ProxyPrinter;

public class SWPrinter implements Printer{
    @Override
    public void connectPrinter(int pageCount) {
        System.out.println("SW Printer has been used with " + pageCount + " pages");
    }
}
