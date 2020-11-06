package be.intecbrussel.hoofdstuk10.OefeningenBoek.rectangle;

public class Square extends Rectangle {

    @Override
    public String toString() {
    return "Square{" +
            "side=" + side +
            ", GEOMETRICAL SHAPE ='" + DESCRIPTION + '\'' +
            '}';
}
    private int side;
    public final String DESCRIPTION = "Square";

    // constructors
    public Square() {
        this(10,1,1);
    }

    public Square(int side) {
        this(side, 1,1);
    }

    public Square(int side, int xPos, int yPos) { super(side, side, xPos, yPos); }

    public Square(Square square) {
        this(square.getSide(), square.getxPos(), square.getyPos());
    }


    // setters
    public void setSide(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    @Override
    public void setHeight(int height) {
        setSide(height);
    }

    @Override
    public void setWidth(int width) {
        setSide(width);
    }

    // getters
    public int getSide() {
        return this.getHeight();
    }


}
