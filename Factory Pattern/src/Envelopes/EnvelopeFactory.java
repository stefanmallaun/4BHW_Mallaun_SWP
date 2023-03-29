package Envelopes;

public class EnvelopeFactory {

    Envelope createEnvelope(String type, int weight) {
        if (type == null) {
            return null;
        } else if (type.equalsIgnoreCase("A4")) {
            return new A4Envelope(weight);
        } else if (type.equalsIgnoreCase("A5")) {
            return new A5Envelope(weight);
        } else if (type.equalsIgnoreCase("A6")) {
            return new A6Envelope(weight);
        }
        return null;
    }
}
