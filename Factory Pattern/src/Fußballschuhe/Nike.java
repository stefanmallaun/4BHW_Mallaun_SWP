package Fußballschuhe;

public class Nike implements Footballshoe{
    private String color;

    Nike (String color){
        this.color = color;
    }

    @Override
    public void FBAusgabe() {
        System.out.println("Der Nikeschuh hat die Farbe: " + color);
    }
}
