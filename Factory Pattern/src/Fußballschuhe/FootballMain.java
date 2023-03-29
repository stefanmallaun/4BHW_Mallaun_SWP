package Fußballschuhe;

public class FootballMain {

    public static void main(String[] args) {



    FootballshoeFactory FbFactory = new FootballshoeFactory();

    Footballshoe adidas = FbFactory.Footballshoe("Adidas", "Rot");

        adidas.FBAusgabe();

    }
}
