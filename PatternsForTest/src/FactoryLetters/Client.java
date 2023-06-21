package FactoryLetters;

public class Client {
    public static void main(String[] args) {



    Factory f1 = new Factory();

    IEnvelopes s1 = f1.getEnv("A4", 12);
    s1.printEnv(12);





    }
}
