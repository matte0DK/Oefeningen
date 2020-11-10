package be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics;

public class Rectangle extends Shape{

    // class members
    private static int count = 0;
    public static final int ANGLES = 4;

    // instance members
    private int width;
    private int height;
    private int corners;
    public final String DESCRIPTION = "Rectangle";

//    static {
//        ANGLES = 4;
//    }

    {
        count++;
    }

    // constructors
    public Rectangle() {
        this(1, 2);
    }


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
//        count++;
    }

    public Rectangle(int width, int height, int xPos, int yPos) {
        super(xPos,yPos);
        this.width = width;
        this.height = height;
    }

    /* copy constructor */
    public Rectangle(Rectangle newRectangle) {
        this.width = newRectangle.width;
        this.height = newRectangle.height;
        this.corners = newRectangle.corners;
        /* this(newRectangle.width, newRectangle.height, newRectangle.x, newRectangle.y); */
    }

    // setters
    public void setWidth(int newWidth) {
        width = Math.abs(newWidth);
    }

    public void setHeight(int newHeight) { height = Math.abs(newHeight); }


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

    // toString
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", corners=" + corners +
                ", DESCRIPTION='" + DESCRIPTION + '\'' +
                "} " + super.toString();
    }
}
