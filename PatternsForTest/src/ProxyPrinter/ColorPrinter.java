package ProxyPrinter;

public class ColorPrinter implements Printer{
    @Override
    public void connectPrinter(int pageCount) {
        System.out.println("Color Printer has been used with " + pageCount + " pages");
    }
}
