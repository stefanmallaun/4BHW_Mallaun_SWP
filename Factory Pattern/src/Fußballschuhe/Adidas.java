package Fußballschuhe;

public class Adidas implements Footballshoe {
    private String color;

    Adidas(String color) {
        this.color = color;
    }

    @Override
    public void FBAusgabe() {

        System.out.print("Der Adidas Schuh hat die Farbe: " + color);
    }
}

