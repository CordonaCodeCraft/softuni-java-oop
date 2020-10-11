package working_wit_abstraction.lab.point_in_rectangle;

public class Point {
    private final int x;
    private final int y;

    public Point(int... tokens) {
        this.x = tokens[0];
        this.y = tokens[1];
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
