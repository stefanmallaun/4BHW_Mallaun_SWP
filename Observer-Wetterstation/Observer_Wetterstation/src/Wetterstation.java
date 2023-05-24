import java.util.Random;


public class Wetterstation extends Subject{
    int state;

    public void setState(int state){
        this.state = state;

        //notifyObservers(state);
        pullNotifyObservers(Wetterstation.this);
    }
    public int getState(){
        return state;
    }
}