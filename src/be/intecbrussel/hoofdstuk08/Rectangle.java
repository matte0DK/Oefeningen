package be.intecbrussel.hoofdstuk08;

public class Rectangle {
    public int x;
    public int y;
    public int height;
    public int width;

    public void setPosition(int xPos, int yPos) {
        x = xPos;
        y = yPos;
    }

    public void setHeightAndWidth(int setHeight, int setWidth) {
        height = setHeight;
        width = setWidth;
    }

    public double getArea(int givenHeight, int givenWidth) {
        return givenHeight*givenWidth;
    }
}
