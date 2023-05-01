import java.util.Random;

public class Client {

    public static void main(String[] args){

        Random rand= new Random();

        int state = rand.nextInt(-20, 50);


        Wetterstation concreteSubject = new Wetterstation();
        concreteSubject.register(new SignalLamp());
        concreteSubject.register(new Speaker());
        concreteSubject.register(new Screen());

        concreteSubject.setState(state);
        //Concrete Observer A is updated with 77
        //Concrete Observer B is updated with 77
    }
}
