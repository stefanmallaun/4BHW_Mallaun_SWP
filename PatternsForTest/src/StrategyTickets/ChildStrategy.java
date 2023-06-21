package StrategyTickets;

public class ChildStrategy implements TicketType{
    private double grundPreis = 9.99;

    @Override
    public void steuerSatz(int steuerstatz) {

        double price = grundPreis *(steuerstatz/100.0 + 1);
        System.out.println("Der Preis von dem Kinderticket mit dem Steuersatz: " + steuerstatz + " beträgt: " + price);
    }
}
