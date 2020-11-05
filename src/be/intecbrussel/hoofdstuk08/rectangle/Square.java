package be.intecbrussel.hoofdstuk08.rectangle;

public class Square extends Rectangle{

    @Override
    public String toString() {
    return "Square{" +
            "side=" + side +
            ", DESCRIPTION='" + DESCRIPTION + '\'' +
            '}';
}
    private int side;
    public final String DESCRIPTION = "Square";



    public Square() {
        super();
    }

    public Square(int side) {
        super(side, side);
    }

    public Square(int side, int xPos, int yPos) {
        super(side, side, xPos, yPos);
    }

    public Square(Square square) {
        super(square);
    }

    // setters
    public void setSide(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    @Override
    public void setHeight(int h) {
        setSide(h);
    }

    @Override
    public void setWidth(int w) {
        setSide(w);
    }

    // getters
    public int getSide() {
        return this.getHeight();
    }


}
