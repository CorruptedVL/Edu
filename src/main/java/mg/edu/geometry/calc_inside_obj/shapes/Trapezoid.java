package mg.edu.geometry.calc_inside_obj.shapes;


public class Trapezoid implements ShapePerimeter {
    private final double a;
    private final double b;
    private final double c;
    private final double d;

    public Trapezoid(double a, double b, double c, double d) {
        if (a <= 0 || b <= 0 || c <= 0 || d <= 0)
            throw new IllegalArgumentException("Стороны прямоугольника должны быть положительными.");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getPerimeter() {
        return a + b + c + d;
    }
}