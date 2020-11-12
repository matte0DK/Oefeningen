package be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics;

public final class Square extends Rectangle {

    //class members
    private static int count = 0;

    { count++; }

    // instance members

    public final String DESCRIPTION = "Square";

    // constructors
    public Square() { this(10,1,1); }

    public Square(int side) {
        this(side, 1,1);
    }

    public Square(int side, int xPos, int yPos) { super(side, side, xPos, yPos); }

    public Square(Square square) {
        this(square.getSide());
    }

    // getters
    public int getSide() {
        return this.getHeight();
    }

    // setters
    public final void setSide(int side) {
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

    public static int getCount() {
        return count;
    }

    // toString method
    @Override
    public String toString() {
        return "Square{" +
                "} " + super.toString();
    }


}
