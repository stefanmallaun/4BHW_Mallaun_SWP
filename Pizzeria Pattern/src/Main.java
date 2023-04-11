public class Main {
    public static void main(String[] args) {
        // Bestellung in Berlin
        Pizzeria berlinPizzeria = new BerlinPizzeria();
        Pizza berlinSalamiPizza = berlinPizzeria.createPizza("Salami");
        berlinSalamiPizza.prepare();
        berlinPizzeria.bakePizza(berlinSalamiPizza);
        berlinPizzeria.cutPizza(berlinSalamiPizza);
        berlinPizzeria.packPizza(berlinSalamiPizza);

        // Bestellung in Hamburg
        Pizzeria hamburgPizzeria = new HamburgPizzeria();
        Pizza hamburgHawaiiPizza = hamburgPizzeria.createPizza("Hawaii");
        hamburgHawaiiPizza.prepare();
        hamburgPizzeria.bakePizza(hamburgHawaiiPizza);
        hamburgPizzeria.cutPizza(hamburgHawaiiPizza);
        hamburgPizzeria.packPizza(hamburgHawaiiPizza);

        // Bestellung in Rostock
        Pizzeria rostockPizzeria = new RostockPizzeria();
        Pizza rostockCalzonePizza = rostockPizzeria.createPizza("Calzone");
        rostockCalzonePizza.prepare();
        rostockPizzeria.bakePizza(rostockCalzonePizza);
        rostockPizzeria.cutPizza(rostockCalzonePizza);
        rostockPizzeria.packPizza(rostockCalzonePizza);
    }
}
