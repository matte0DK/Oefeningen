package be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics;

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
        this.setPerpendicular(width / 2);
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
        super.setPerpendicular(width/2);
    }

    @Override
    public void setPerpendicular(int perpendicular) {
        super.setPerpendicular(perpendicular);
        super.setWidth(perpendicular * 2);
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
