package FactoryLetters;

public class A5 implements IEnvelopes{
    @Override
    public void printEnv(int weight) {
        System.out.println("A5 und bin 5cm groß und wiege: " + weight);
    }
}
