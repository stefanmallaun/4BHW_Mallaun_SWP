package ProxyPattern;

public class ProxyMain {

    public static void main(String[] args) {

        Internet i = new ProxyInternet();
        try{
            i.connectTo("Test.at");
            i.connectTo("abc.com");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }



}
