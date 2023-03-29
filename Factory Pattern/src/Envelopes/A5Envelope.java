package Envelopes;

public class A5Envelope implements Envelope{

        private int weight;

        A5Envelope(int weight){
            this.weight = weight;
        }


        @Override
        public void printProperties() {
            System.out.println("A5 envelope, weight: " + weight + "g, size: 148mm x 210mm");
        }
}

