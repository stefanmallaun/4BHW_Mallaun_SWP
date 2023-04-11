



abstract class Pizzeria {
    public abstract Pizza createPizza(String type);
    public void bakePizza(Pizza pizza) {
        System.out.println("Baking pizza...");
    }
    public void cutPizza(Pizza pizza) {
        System.out.println("Cutting pizza...");
    }
    public void packPizza(Pizza pizza) {
        System.out.println("Packing pizza...");
    }

}
