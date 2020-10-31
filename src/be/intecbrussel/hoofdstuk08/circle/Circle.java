package be.intecbrussel.hoofdstuk08.circle;

public class Circle {
    private int radius;
    private int x;
    private int y;
    private static int count;
    public static final int ANGLES;

    static {
        ANGLES = 0;
    }

    {
        count++;
    }

    // constructors
    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
//        count++;
    }

    public Circle(Circle myCircle) {
        this.radius = myCircle.radius;
        this.x = myCircle.x;
        this.y = myCircle.y;
    }

    // setters
    public void setRadius(int newRadius) {
        radius = newRadius;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public void setPositions(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    // getters
    public int getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public static int getCount() {
        return count;
    }

    //grow methode
    public int grow(int d) {
        this.radius *= Math.abs(d);
        this.x *= Math.abs(d);
        this.y *= Math.abs(d);
        return d;
    }

    //cosinus method
    public void getCos() {
        int count = 0;
        for (double i = 0; i < 2 * (Math.PI); i += 0.1) {
            count++;
            System.out.println("cos of angle nr " + count + " : " + Math.cos(i));
        }
    }
}
