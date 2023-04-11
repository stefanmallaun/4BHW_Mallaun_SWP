public class HamburgPizzeria extends Pizzeria{
    public Pizza createPizza(String type) {
        if (type.equals("Hawaii")) {
            return new HamburgHawaiiPizza();
        } else {
            return null;
        }
    }
}
