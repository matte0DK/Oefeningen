package be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics;

import java.util.Objects;

public class Triangle extends Shape {

    // class members
    private static int count;
    public static final int ANGLES = 3;

    // instance members
    private int height;
    private int width;
    private int perpendicular;

    // constructors
    public Triangle() {
        this(2, 3, -2, 0,0);
    }

    public Triangle(int width, int height, int perpendicular) {
        this(width, height, perpendicular, 0, 0);
    }

    public Triangle(int width, int height, int perpendicular, int xPos, int yPos) {
        super(xPos, yPos);
        this.width = width;
        this.height = height;
        this.perpendicular = perpendicular;
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
        // fully optimised, check code below to see steps until final answer.
        double hypotenuse1 = Math.hypot(this.height, this.perpendicular);
        double hypotenuse2 = Math.hypot(this.height, (this.width - this.perpendicular));

        return this.width + hypotenuse1 + hypotenuse2;
    }

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

    //equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return height == triangle.height &&
                width == triangle.width &&
                perpendicular == triangle.perpendicular;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, width, perpendicular);
    }

    @Override
    public void draw() {

    }
}
//  OVERRIDE PERIMETER ORIGINAL CODE
//        if (perpendicular < 0) {
//            hypotenuse1 = Math.hypot(this.height, this.perpendicular);
//            hypotenuse2 = Math.hypot(this.height, (Math.abs(this.perpendicular) + this.width));
//        } else if (perpendicular > width) {
//            hypotenuse1 = Math.hypot(this.height, (this.perpendicular - this.width));
//            hypotenuse2 = Math.hypot(this.height, this.perpendicular);
//        } else {
//            hypotenuse1 = Math.hypot(this.height, this.perpendicular);
//            hypotenuse2 = Math.hypot(this.height, (this.width - this.perpendicular));
//        }

// Optimised first code
//        if (this.perpendicular < 0) {
//            hypotenuse2 = Math.hypot(this.height, (Math.abs(this.perpendicular) + this.width));
//        } else if (this.perpendicular > width) {
//            hypotenuse1 = Math.hypot(this.height, (this.perpendicular - this.width));
//            hypotenuse2 = Math.hypot(this.height, this.perpendicular);
//        }