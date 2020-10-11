package polymorphism.lab.shapes;

public abstract class Shape {

    private  Double perimeter;
    private  Double area;

    protected abstract Double calculatePerimeter();


    protected abstract Double calculateArea();

    public Double getPerimeter() {
        return this.perimeter;
    }

    public Double getArea() {
        return this.area;
    }

    protected void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    protected void setArea(Double area) {
        this.area = area;
    }
}
