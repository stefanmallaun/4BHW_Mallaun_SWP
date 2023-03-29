package Envelopes;

public class A4Envelope implements Envelope {
    private int weight;

    A4Envelope(int weight){
        this.weight = weight;
    }


    @Override
    public void printProperties() {
        System.out.println("A4 envelope, weight: " + weight + "g, size: 210mm x 297mm");
    }
}
