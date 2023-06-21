package StrategyTickets;

public class StudentStrategy implements TicketType{

    private double grundPreis = 19.99;

    @Override
    public void steuerSatz(int steuerstatz) {
        double price = grundPreis * (steuerstatz/100.0+1);
        System.out.println("Der Preis vom Studenten Ticket mit dem Steuersatz: " + steuerstatz + "beträgt: " + price);
    }
}
