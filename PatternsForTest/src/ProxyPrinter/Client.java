package ProxyPrinter;

public class Client {
    public static void main(String[] args) {



    Printer printer = new ProxyPrinter();

    printer.connectPrinter(60);
    printer.connectPrinter(20);
    }

}
