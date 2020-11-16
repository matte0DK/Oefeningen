package be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics;

import java.util.Objects;

public abstract class Shape implements Drawable{

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
        setX(x);
        setY(y);
        // omdat we al een setter hebben. beter gebruik maken van de setter,
        // in sommige gevallen hebben we een bepaalde voorwaarde meegegeven in een setter zoals bij de height in dit geval mag de waarde niet negatief zijn.
    }

    // setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPositions(int x, int y) {
        setX(x); //this.x = x;
        setY(y); //this.y = y;
        // omdat we al een setter hebben. beter gebruik maken van de setter,
        // in sommige gevallen hebben we een bepaalde voorwaarde meegegeven in een setter zoals bij de height in dit geval mag de waarde niet negatief zijn.
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


    // toString
    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    // equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return x == shape.x &&
                y == shape.y;
    }

    // hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }




}
