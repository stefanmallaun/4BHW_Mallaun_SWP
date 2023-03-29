import java.util.Locale;
import java.util.Scanner;

public class EnvelopeMain {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        EnvelopeFactory enveFac = new EnvelopeFactory();

        Envelope a4 = enveFac.createEnvelope("A4", 10);

        a4.printProperties();

        Envelope a5 = enveFac.createEnvelope("A5", 20);

        a5.printProperties();

        Envelope a6 = enveFac.createEnvelope("A6", 30);

        a6.printProperties();

        System.out.print("Welchen Brief wollen Sie? [A4, A5, A6]: ");
        String type = reader.next();
        System.out.print("Wie schwer ist Ihr Brief ?[Eingabe in Gramm]:  ");
        int weight = reader.nextInt();

        Envelope customer = enveFac.createEnvelope(type, weight);

        customer.printProperties();
    }
}
