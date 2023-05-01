

public class BerlinPizzeria extends Pizzeria{

    public Pizza createPizza(String type) {
        if (type.equals("Salami")) {
<<<<<<< HEAD
            return new BerlinSalamiPizza();
        }
        else{
=======
            return new BerlinSalamiPizzaNeu();
        } 
        else if(type.equals("Hawaii")){
            return new RostockCalzonePizza();
        }
        else {
>>>>>>> ca47b43ec51275ae13dd5662e5ff8858a07f5215
            return null;
        }
    }

}
