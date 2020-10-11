package polymorphism.lab.shapes;

public class Circle extends Shape {
    private final Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    protected Double calculatePerimeter() {

        Double perimeter = Math.pow(Math.PI, 2) * this.radius;
        super.setPerimeter(perimeter);
        return perimeter;

    }

    @Override
    protected Double calculateArea() {

        Double area = Math.pow(this.radius, 2) * Math.PI;
        super.setArea(area);
        return area;

    }
}
