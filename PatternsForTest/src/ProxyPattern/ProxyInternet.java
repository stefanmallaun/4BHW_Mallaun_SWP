package ProxyPattern;

import java.util.*;
import java.util.ArrayList;

public class ProxyInternet implements Internet{

    private Internet internet = new RealInternet();

    static List<String> bannedSites;

    static
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }



    @Override
    public void connectTo(String serverhost) throws Exception {
        if(bannedSites.contains(serverhost.toLowerCase())){
            throw  new Exception("Access denied!");
        }
        else{
            internet.connectTo(serverhost);
        }
    }
}
