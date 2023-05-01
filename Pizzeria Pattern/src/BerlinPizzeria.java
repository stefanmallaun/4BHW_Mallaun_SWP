

public class BerlinPizzeria extends Pizzeria{

    public Pizza createPizza(String type) {
        if (type.equals("Salami")) {
            return new BerlinSalamiPizzaNeu();
        } 
        else if(type.equals("Hawaii")){
            return new RostockCalzonePizza();
        }
        else {
            return null;
        }
    }

}
