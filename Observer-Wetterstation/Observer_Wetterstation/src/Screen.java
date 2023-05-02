public class Screen implements Observer{

    //Push-Methode
     /*
    @Override

    public void update(int state) {
        if(state > 0 ){
            System.out.println("The Temperature rn is: " + state);
        }
        if(state < 0 ){
            System.out.println("It is freezing!" + state);
        }
    }
    */
    @Override
    public void update(Wetterstation wetterstation) {
        if(wetterstation.state > 0){
            System.out.println("The Temperature rn is: " + wetterstation.state);
        }
        else if(wetterstation.state < 0){
            System.out.println("It is freezing! " + wetterstation.state);
        }

    }
}
