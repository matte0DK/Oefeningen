package be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics;

public class TextDrawingContext implements DrawingContext{
    @Override
    public void draw(Rectangle rectangle) {
        System.out.println(rectangle);
    }

    @Override
    public void draw(Triangle triangle) {
        System.out.println(triangle);
    }

    @Override
    public void draw(Circle circle) {
        System.out.println(circle);

    }
}
