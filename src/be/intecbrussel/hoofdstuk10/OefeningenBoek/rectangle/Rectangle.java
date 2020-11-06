package be.intecbrussel.hoofdstuk10.OefeningenBoek.rectangle;

public class Rectangle {
    @Override
    public String toString() {
        return "Rectangle{" +
                "DESCRIPTION='" + DESCRIPTION + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", corners=" + corners +
                '}';
    }

    public final String DESCRIPTION = "Rectangle";

    private static int count = 0;
    public static final int ANGLES;

    /* instance variabelen */
    private int width;
    private int height;
    private int x;
    private int y;
    private int corners;

    static {
        ANGLES = 4;
    }

    {
        count++;
    }

    // constructors
    public Rectangle() {
        this(1, 2, 4, 8);
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height, int newX, int newY) {
        this.width = width;
        this.height = height;
        this.x = newX;
        this.y = newY;
//        count++;
    }

    /*copy constructor*/
    public Rectangle(Rectangle newRectangle) {
        this.width = newRectangle.width;
        this.height = newRectangle.height;
        this.x = newRectangle.x;
        this.y = newRectangle.y;
        this.corners = newRectangle.corners;
        /* this(newRectangle.width, newRectangle.height, newRectangle.x, newRectangle.y); */
    }

    // setters
    public void setWidth(int newWidth) {
        width = Math.abs(newWidth);
    }

    public void setHeight(int newHeight) {
        height = Math.abs(newHeight);
    }

    public void setPositions(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    // getters
    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return height * 2 + width * 2;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getxPos() {
        return x;
    }

    public int getyPos() {
        return y;
    }

    // grow methode
    public void grow(int d) {
        this.width *= Math.abs(d);
        this.height *= Math.abs(d);
    }

    // methode om een aantal rechthoeken in rectangleApp weer te geven.
    public static int getCounter() {
        return count;
    }


}
