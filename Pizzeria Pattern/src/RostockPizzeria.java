

public class RostockPizzeria extends Pizzeria{
    public Pizza createPizza(String type) {
        if (type.equals("Calzone")) {
            return new RostockCalzonePizza();
        } else {
            return null;
        }
    }
}
