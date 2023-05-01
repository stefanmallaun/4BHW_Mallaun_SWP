

public class BerlinPizzeria extends Pizzeria{

    public Pizza createPizza(String type) {
        if (type.equals("Salami")) {
            return new BerlinSalamiPizza();
        }
        else{
            return null;
        }
    }

}
