package be.intecbrussel.hoofdstuk10.oefeningen_boek.geometrie;

public class Triangle extends Shape {

    // class members
    public static final int ANGLES = 3;
    private static int count;

    // instance members
    private int height;
    private int width;
    private int perpendicular;

    // constructors
    public Triangle() {
        this(2, 3, 0, 0);
    }

    public Triangle(int width, int height) {
        this(width, height, 0, 0);
    }

    public Triangle(int width, int height, int xPos, int yPos) {
        super(xPos, yPos);
        this.width = width;
        this.height = height;
    }

    // setters

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }

    // getters
    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getPerpendicular() {
        return this.perpendicular;
    }

    @Override
    public double getArea() {
        return 0.5 * (this.width * this.height);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }  // <=

    public static int getCount() {
        return count;
    }

    // toString

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                ", perpendicular=" + perpendicular +
                "} " + super.toString();
    }
}
