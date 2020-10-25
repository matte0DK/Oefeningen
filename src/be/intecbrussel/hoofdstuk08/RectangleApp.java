package be.intecbrussel.hoofdstuk08;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();
        Rectangle mySecondRectangle = new Rectangle(20,10);
        Rectangle myThirdRectangle = new Rectangle(20,10,2,3);
        Rectangle newRectangle = new Rectangle(mySecondRectangle);

        //first rectangle =
        myRectangle.setWidth(-10);
        myRectangle.setHeight(-20);
        myRectangle.setX(2);
        myRectangle.setY(3);

        //System.out.println(myRectangle.width);
        //System.out.println(myRectangle.height);
        //System.out.println(myRectangle.x);
        //System.out.println(myRectangle.y);


        //print perimeter and area
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getPerimeter());
        System.out.println(myRectangle.getxPos());
        System.out.println(myRectangle.getyPos());
        System.out.println(myRectangle.getHeight());
        System.out.println(myRectangle.getWidth());

        System.out.println(mySecondRectangle.getWidth() +
                            mySecondRectangle.getHeight());

        System.out.println(myThirdRectangle.getWidth() +
                            myThirdRectangle.getHeight() +
                            myThirdRectangle.getxPos() +
                            myThirdRectangle.getyPos());

        System.out.println(newRectangle.getWidth());
        System.out.println(newRectangle.getHeight());
        System.out.println(newRectangle.getxPos());
        System.out.println(newRectangle.getyPos());

    }
}

//         second rectangle
//        mySecondRectangle.width = 30;
//        mySecondRectangle.height = 40;
//        mySecondRectangle.x = 4;
//        mySecondRectangle.y = 5;

//        System.out.println(mySecondRectangle.width);
//        System.out.println(mySecondRectangle.height);
//        System.out.println(mySecondRectangle.x);
//        System.out.println(mySecondRectangle.y);