
public class Speaker implements Observer{


    @Override
    public void update(int state) {
        if (state > 0) {


        } else if (state < 0) {
            java.awt.Toolkit.getDefaultToolkit().beep();

        }
    }
}
