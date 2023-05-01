public class Screen implements Observer{
    @Override
    public void update(int state) {
        if(state > 0 ){
            System.out.println("The Temperatur rn is: " + state);
        }
        if(state < 0 ){
            System.out.println("It is freezing!" + state);
        }
    }
}
