package FactoryPattern;

public class FactoryShape {

    public Shape getShape(String input){

        if(input == null){
            return null;
        }
        else if(input.equalsIgnoreCase("rectangle")){
            Shape s = new Rectangle();
            return s;
        }
        else if(input.equalsIgnoreCase("triangle")){
            return new Triangle();
        }
        else{
            return null;
        }
    }


}
