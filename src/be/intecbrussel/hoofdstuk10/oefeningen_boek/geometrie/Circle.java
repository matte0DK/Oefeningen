package be.intecbrussel.hoofdstuk10.oefeningen_boek.geometrie;

public final class Circle extends Shape{

    // class members
    private static int count;
    public static final int ANGLES;

    // instance members
    private int radius;

    static {
        ANGLES = 0;
    }

    {
        count++;
    }

    // constructors
    public Circle() {
        this(9,2,2);
    }

    public Circle(int radius) {
        this(radius,0,0);
    }

    public Circle(int radius, int xPos, int yPos) {
        super(xPos,yPos);
        this.radius = radius;
    }

    public Circle(Circle myCircle) {
        this.radius = myCircle.radius;
    }

    // setters
    public void setRadius(int newRadius) {
        radius = newRadius;
    }

    // getters
    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return this.radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    //grow methode
    public int grow(int d) {
        this.radius *= Math.abs(d);
        return this.radius;
    }

    //cosinus method
    private void getCos() {
        int count = 0;
        for (double i = 0; i < 2 * (Math.PI); i += 0.1) {
            count++;
            System.out.println("cos of angle nr " + count + " : " + Math.cos(i));
        }
    }

    public static int getCount() {
        return count;
    }

    // toString

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
