package StrategyTickets;

public class ShoppingCart {

    public static void main(String[] args) {


        ChildStrategy cs = new ChildStrategy();


        cs.steuerSatz(20);

        StudentStrategy Student = new StudentStrategy();

        Student.steuerSatz(30);
    }



}
