package be.intecbrussel.hoofdstuk04;

public class Op11ConditioneleOperator {

    public static void main(String[] args) {

        int myNumber = 57;
        int myNumber2 = 33;
        int myNumber3 = -65;

        System.out.println((myNumber < myNumber2)? myNumber : myNumber2);
        System.out.println((myNumber < myNumber3)? myNumber : myNumber3);
        System.out.println((myNumber2 < myNumber)? myNumber2 : myNumber);
        System.out.println((myNumber2 < myNumber3)? myNumber2 : myNumber3);
        System.out.println((myNumber3 < myNumber)? myNumber3 : myNumber);
        System.out.println((myNumber3 < myNumber2)? myNumber3 : myNumber2);

    }

}
