package encapsulation.exercises.box;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public void setLength(double length) {
        validateParameter(length, "Length");
        this.length = length;
    }

    public void setWidth(double width) {
        validateParameter(width, "Width");
        this.width = width;
    }

    public void setHeight(double height) {
        validateParameter(height, "Height");
        this.height = height;
    }

    public double calculateSurfaceArea() {
        return 2 * ((this.length * this.width)
                + (this.length * this.height)
                + (this.width * this.height));

    }

    public double calculateLateralSurfaceArea() {

        return 2 * ((this.length * this.height) + (this.width * this.height));

    }

    public double calculateVolume() {
        return this.length * this.width * this.height;

    }

    private void validateParameter(double input, String typeParameter) {
        if (input <= 0) {
            throw new IllegalArgumentException(String.format("%s cannot be zero or negative.", typeParameter));
        }
    }
}
