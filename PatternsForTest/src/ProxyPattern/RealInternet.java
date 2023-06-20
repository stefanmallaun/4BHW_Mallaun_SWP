package ProxyPattern;

public class RealInternet implements Internet{

    @Override
    public void connectTo(String serverhost) {
        System.out.println("Connection to: " + serverhost);
    }
}
