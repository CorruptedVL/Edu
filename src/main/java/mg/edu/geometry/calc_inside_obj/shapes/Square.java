package mg.edu.geometry.calc_inside_obj.shapes;

public class Square implements ShapePerimeter, ShapeArea {
    private final double side;

    public Square(double side) {
        if (side <= 0) throw new IllegalArgumentException("Сторона квадрата должна быть положительной.");
        this.side = side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getArea() {
        return side * side;
    }

}