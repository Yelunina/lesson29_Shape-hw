package ait.shapes;

import ait.shapes.model.Circle;
import ait.shapes.model.Shape;
import ait.shapes.model.Square;
import ait.shapes.model.Triangle;


public class FigureAppl {
    public static void main(String[] args) {
        Shape[] figures = new Shape[5];
        figures[0] = new Circle(35);
        figures[1] = new Circle(25);
        figures[2] = new Triangle(15);
        figures[3] = new Square(15);
        double totalShapesArea = totalArea(figures);
        double totalShapesPerimeter = totalPerimeter(figures);
        System.out.println("total area = " + totalShapesArea);
        System.out.println("total perimeter = " + totalShapesPerimeter);
        double circlesArea = totalCirclesArea(figures);
        System.out.println("total area of circles = " + circlesArea);
    }
    private static double totalArea(Shape[] figures) {
        double res = 0;
        for (int i = 0; i < figures.length; i++) {
            if(figures[i] != null) {
                res += figures[i].calcArea();
            }
        }
        return res;
    }

    private static double totalPerimeter(Shape[] figures) {
        double res = 0;
        for (int i = 0; i < figures.length; i++) {
            if(figures[i] != null) {
                res += figures[i].calcPerimeter();
            }
        }
        return res;
    }
    private static double totalCirclesArea(Shape[] figures) {
        double res = 0;
        for (int i = 0; i < figures.length; i++) {
            if(figures[i] instanceof Circle) {
                res += figures[i].calcArea();
            }
        }
        return res;
    }
}

