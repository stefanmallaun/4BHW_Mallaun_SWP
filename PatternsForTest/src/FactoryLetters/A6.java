package FactoryLetters;

public class A6 implements IEnvelopes{
    @Override
    public void printEnv(int weight) {
        System.out.println("A6 und bin 2cm groß und wiege: " + weight);
    }
}
