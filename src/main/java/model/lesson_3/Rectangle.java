package model.lesson_3;
import abstraction.*;

public class Rectangle extends Shape {

    public void calculateArea(double n) {
        System.out.println(String.format("area of rectangle is %.2f", n * n));
    }
}
