package be.intecbrussel.hoofdstuk08.circle;

public class CircleApp {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        Circle mySecondCircle = new Circle(5);
        Circle myThirdCircle = new Circle(5, 3, 2);
        Circle myFourthCirce = new Circle(mySecondCircle);

        myCircle.setX(20);
        myCircle.setY(30);
        myCircle.setRadius(7);

        System.out.println(myThirdCircle.getX());
        System.out.println(myThirdCircle.getY());
        System.out.println(myThirdCircle.getRadius());
        System.out.println(myThirdCircle.getArea());
        System.out.println(myThirdCircle.getPerimeter());
        System.out.println(myThirdCircle.grow(2));
        System.out.println(Circle.getCount());
        System.out.println("------------------");
        System.out.println("these are the cosinus between 0 rad and 2PI rad:");
        myThirdCircle.getCos();
    }

}
