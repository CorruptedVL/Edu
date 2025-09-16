package mg.edu.geometry.calc_outside_obj_separetly_visitors.demo;

import mg.edu.geometry.calc_outside_obj_separetly_visitors.calculations.AreaCalc;
import mg.edu.geometry.calc_outside_obj_separetly_visitors.shapes.AreaShape;
import mg.edu.geometry.calc_outside_obj_separetly_visitors.calculations.PerimeterCalc;
import mg.edu.geometry.calc_outside_obj_separetly_visitors.shapes.PerimeterShape;
import mg.edu.geometry.calc_outside_obj_separetly_visitors.shapes.*;

public class ClientTest {
    public static void main(String[] args) {
        PerimeterShape[] perimeterShapes = {
                new Square(5),
                new Rectangle(4, 7),
                new Triangle(3, 4, 5),
                new Circle(10),
                new Trapezoid(6, 10, 5, 5)
        };

        var perimeterVisitor = new PerimeterCalc();
        for (PerimeterShape s : perimeterShapes) {
            s.accept(perimeterVisitor);
            System.out.println(s.getClass().getSimpleName() + " -> Периметр = " + perimeterVisitor.getResult());
        }

        AreaShape[] areaShapes = {
                new Square(5),
                new Rectangle(4, 7),
                new Triangle(3,4,5),
                new Circle(10)
        };

        var areaVisitor = new AreaCalc();
        for (AreaShape s : areaShapes) {
            s.accept(areaVisitor);
            System.out.println(s.getClass().getSimpleName() + " -> Площадь = " + areaVisitor.getResult());
        }
    }
}
