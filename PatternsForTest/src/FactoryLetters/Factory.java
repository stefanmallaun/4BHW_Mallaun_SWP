package FactoryLetters;

public class Factory {

    public IEnvelopes getEnv(String type, int weight){

       if(type.equalsIgnoreCase("A4")){
           return new A4();
       }if(type.equalsIgnoreCase("A5")){
           return new A5();
        }
       if(type.equalsIgnoreCase("A6")){
           return new A6();
       }else{
           return null;
       }

    }





}
