
public class Speaker implements Observer{

    //Push-Methode
    /*@Override
    public void update(int state) {
        if (state > 0) {


        } else if (state < 0) {
            java.awt.Toolkit.getDefaultToolkit().beep();

        }
    }
    */
    @Override
    public void update(Wetterstation wetterstation) {
        if (wetterstation.state > 0) {


        } else if (wetterstation.state < 0) {
            java.awt.Toolkit.getDefaultToolkit().beep();

        }
    }
}
