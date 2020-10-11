package polymorphism.lab.shapes;

public class Rectangle extends Shape {

    private final Double height;
    private final Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public Double calculatePerimeter() {

        Double perimeter = (this.height * 2) + (this.width * 2);
        super.setPerimeter(perimeter);
        return perimeter;

    }

    @Override
    public Double calculateArea() {
        Double area = height * width;
        super.setArea(area);
        return area;
    }
}
