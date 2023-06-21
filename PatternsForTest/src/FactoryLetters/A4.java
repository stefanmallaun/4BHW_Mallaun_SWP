package FactoryLetters;

public class A4 implements IEnvelopes{
    @Override
    public void printEnv(int weight) {
        System.out.println("A4 und bin 10cm groß und wiege: " + weight);
    }
}
