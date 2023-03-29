package Fußballschuhe;

public class FootballshoeFactory {

    public Footballshoe Footballshoe(String Marke, String color){
        if (Marke == null){
            return null;
        }else if (Marke.equalsIgnoreCase("Adidas")){
            return new Adidas(color);
        }else if (Marke.equalsIgnoreCase("Nike")){
            return new Nike(color);
        }
        return null;
    }
}
