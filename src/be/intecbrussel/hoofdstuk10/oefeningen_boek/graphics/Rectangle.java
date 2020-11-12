package be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics;

import java.util.Objects;

public class Rectangle extends Shape {

    // class members
    private static int count = 0;
    public static final int ANGLES = 4;

    { count++; }

    // instance members
    private int width;
    private int height;

    // constructors
    public Rectangle() {
        this(1, 2);
    }


    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
//        count++;
    }

    public Rectangle(int width, int height, int xPos, int yPos) {
        setPositions(xPos, yPos);
        setWidth(width);
        setHeight(height);
    }

    /* copy constructor */
    public Rectangle(Rectangle newRectangle) {
        this(newRectangle.width, newRectangle.height, newRectangle.getX(), newRectangle.getY());
//        setWidth(newRectangle.width);
//        setHeight(newRectangle.height);
//        setPositions(newRectangle.getX(), newRectangle.getY());

        /* this(newRectangle.width, newRectangle.height, newRectangle.x, newRectangle.y); */
    }

    // setters
    public void setWidth(int newWidth) {
        width = Math.abs(newWidth);
    }

    public void setHeight(int newHeight) {
        height = Math.abs(newHeight);
    }

    // getters
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() { return this.width * this.height; }

    @Override
    public double getPerimeter() { return (this.height + this.width) * 2; }


    // grow methode
    public void grow(int d) {
        this.width *= Math.abs(d);
        this.height *= Math.abs(d);
    }

    // static counter method
    public static int getCount() {
        return count;
    }

    // toString method
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "} " + super.toString();
    }

    // equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width &&
                height == rectangle.height;
    }

    // hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, height);
    }




}
