package Envelopes;

public class A6Envelope implements Envelope{
    private int weight;

    A6Envelope(int weight){
        this.weight = weight;
    }

    @Override
    public void printProperties() {
        System.out.println("A6 envelope, weight: " + weight + "g, size: 105mm x 148mm");
    }
}
