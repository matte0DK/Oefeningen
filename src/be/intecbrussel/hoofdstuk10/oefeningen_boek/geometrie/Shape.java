package be.intecbrussel.hoofdstuk10.oefeningen_boek.geometrie;

public abstract class Shape {

    // class members
    private static int count;
    {
        count++;
    }

    // instance members
    private int x;
    private int y;


    // constructors
    public Shape() {
        this(0,0);
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPositions(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getters
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public static int getCount() {
        return count;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
