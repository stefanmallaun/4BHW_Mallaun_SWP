public class SignalLamp implements Observer{

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";

    //Push-Methode
    /*@Override

    public void update(int state) {
        if(state > 0 ){
            System.out.println(ANSI_RED + "OOO" + ANSI_RESET );
        }
        if(state < 0 ){
            System.out.println(ANSI_BLUE + "OOO" + ANSI_RESET );
        }
    }
    */
    //Pull-Methode
    @Override
    public void update(Wetterstation wetterstation) {
        if(wetterstation.state > 0 ){
            System.out.println(ANSI_RED + "OOO" + ANSI_RESET );
        }
        else if(wetterstation.state < 0 ){
            System.out.println(ANSI_BLUE + "OOO" + ANSI_RESET );
        }
    }
}
