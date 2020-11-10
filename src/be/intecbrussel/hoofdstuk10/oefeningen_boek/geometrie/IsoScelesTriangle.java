package be.intecbrussel.hoofdstuk10.oefeningen_boek.geometrie;

public final class IsoScelesTriangle extends Triangle{

    // class members
    private static int count;

    {
        count++;
    }

    // constructors
    public IsoScelesTriangle() {
        this(10,20,3,3);
    }

    public IsoScelesTriangle(int width, int height) {
        this(width, height, 0, 0);
    }

    public IsoScelesTriangle(int width, int height, int xPos, int yPos) {
        super(width, height, width/2 , xPos ,yPos);
    }

    public IsoScelesTriangle(IsoScelesTriangle myIsoSceles) {
        this(myIsoSceles.getWidth(), myIsoSceles.getHeight());
    }

    // setters
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }

    @Override
    public void setPerpendicular(int perpendicular) {
        super.setPerpendicular(perpendicular);
    }

    // getters
    public static int getCount() {
        return count;
    }

    // toString

    @Override
    public String toString() {
        return "IsoScelesTriangle{} " + super.toString();
    }
}
