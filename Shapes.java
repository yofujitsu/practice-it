import java.lang.*;
import java.util.*;

public class Shapes {
    public enum FigureType {SQUARE, CIRCLE, RECTANGLE}

    public class Square extends Shapes {};
    public class Circle extends Shapes {};
    public class Rectangle extends Shapes {};

    public Shapes createFigure(FigureType figure) {
        Shapes figure1 = null;
        switch (figure) {
            case SQUARE:
                figure1 = new Square();
                break;
            case CIRCLE:
                figure1 = new Circle();
                break;
            case RECTANGLE:
                figure1 = new Rectangle();
                break;
        }
        return figure1;
    }

    public static void main(String[] args) {
        Shapes figure1 = new Shapes();
        System.out.println(figure1.createFigure(Shapes.FigureType.CIRCLE));
    }
}