package ObserverWeather;

public class Client {
    public static void main(String[] args) {


        Station st = new Station();

        st.register(new Signal());
        st.setState(22, 50 );

    }



}
