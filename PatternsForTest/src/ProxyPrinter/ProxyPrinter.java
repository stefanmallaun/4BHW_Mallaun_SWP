package ProxyPrinter;

public class ProxyPrinter implements Printer{

    Printer p1 = new ColorPrinter();
    Printer p2 = new SWPrinter();

    @Override
    public void connectPrinter(int pageCount) {
        if(pageCount > 50){
            p2.connectPrinter(pageCount);
        }
        if(pageCount < 50){
            p1.connectPrinter(pageCount);
        }
    }
}
