package model.lesson_3;

import abstraction.Shape;

public class Circle extends Shape {
    public void calculateArea(double n) {
        System.out.println(String.format("area of circle is %f", 3.14 * (n * n)));

    }
}
