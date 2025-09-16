package mg.edu.geometry.calc_inside_obj.demo;

import mg.edu.geometry.calc_inside_obj.getting_metrics.GetMetrics;
import mg.edu.geometry.calc_inside_obj.shapes.ShapeArea;
import mg.edu.geometry.calc_inside_obj.shapes.ShapePerimeter;
import mg.edu.geometry.calc_inside_obj.shapes.*;

public class ClientTest {
    public static void main(String[] args) {
        Object[] shapes = {
                new Square(5),
                new Rectangle(4, 7),
                new Triangle(3, 4, 5),
                new Circle(10),
                new Trapezoid(6, 10, 5, 5) // площадь не рассчитываем
        };

        for (Object obj : shapes) {
            System.out.print(obj.getClass().getSimpleName());

            if (obj instanceof ShapePerimeter p) { // вдруг будет объект без периметра
                double per = GetMetrics.calculatePerimeter(p);
                System.out.print(" -> Периметр = " + per);
            }

            if (obj instanceof ShapeArea a) {
                double area = GetMetrics.calculateArea(a);
                System.out.print(", Площадь = " + area);
            } else {
                System.out.print(", Площадь = не рассчитывается");
            }
            System.out.println();
        }
    }
}
