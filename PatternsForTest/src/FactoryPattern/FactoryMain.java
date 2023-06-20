package FactoryPattern;

import java.io.Reader;
import java.util.Scanner;

public class FactoryMain {



    public static void main(String[] args) {


        FactoryShape f1 = new FactoryShape();

        Shape s1 = f1.getShape("rectangle");
        s1.draw();






    }
}
