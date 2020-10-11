package working_wit_abstraction.lab.point_in_rectangle;

public class Rectangle {
    private final int bottomLeft_X;
    private final int bottomLeft_Y;
    private final int topLeft_X;
    private final int topLeft_Y;

    public Rectangle(int... tokens) {
        this.bottomLeft_X = tokens[0];
        this.bottomLeft_Y = tokens[1];
        this.topLeft_X = tokens[2];
        this.topLeft_Y = tokens[3];
    }

    public boolean contains(Point point) {
        int x = point.getX();
        int y = point.getY();

        boolean xInRange = x >= bottomLeft_X && x <= topLeft_X;
        boolean yinRange = y >= bottomLeft_Y && y <= topLeft_Y;

        return xInRange && yinRange;
    }

}
