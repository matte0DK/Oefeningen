package be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics;

public class InterfaceDrawingApp {
    public static void main(String[] args) throws NegativeSizeException {
        Drawing myBeauDessin = new Drawing();
        DrawingContext drawingContext = new TextDrawingContext();

        IsoScelesTriangle iso = new IsoScelesTriangle();
        Rectangle rect = new Rectangle();
        Shape spongebob = new Square();

        myBeauDessin.add(iso);
        myBeauDessin.add(rect);
        myBeauDessin.add(spongebob);

        myBeauDessin.draw(drawingContext);

        myBeauDessin.scaleDouble();

        myBeauDessin.draw(drawingContext);
    }
}
