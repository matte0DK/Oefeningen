package be.intecbrussel.hoofdstuk08;

public class Rectangle {
    private int width;
    private int height;
    private int x;
    private int y;

    // set breedte en lengte
    public void setWidth(int newWidth) {
        width = Math.abs(newWidth);
    }
    public void setHeight(int newHeight) {
        height = Math.abs(newHeight);
    }

    // set positions
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

    // grow methode
    public void grow(int d) {
        this.width *= Math.abs(d);
        this.height *= Math.abs(d);
    }

    // get area and perimeter methode
    public int getArea(){
        return width*height;
    }
    public int getPerimeter() {
        return height*2 + width*2;
    }

    //get width, height, x , y methode
    public int getWidth(){
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

    // constructors instellen
    public Rectangle() {
        this(1,2,4,8);
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
    }
    public Rectangle(Rectangle newRectangle) {
        this.width = newRectangle.width;
        this.height = newRectangle.height;
        this.x = newRectangle.x;
        this.y = newRectangle.y;
    }

}
