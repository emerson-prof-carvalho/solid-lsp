package view;

import model.Rectangle;
import model.Shape;
import model.Square;

public class Main {

	public static void main(String[] args) {
        
		Shape shape = new Rectangle(5.0, 10.0);
        System.out.println("Área Rectangulo 1: " + shape.getArea());

        shape = new Square(3.0);
        System.out.println("Área Rectangulo 2: " + shape.getArea());
    }
}