package be.intecbrussel.hoofdstuk07;

public class Opdracht01 {

    public static void main(String[] args) {
//        multiple of seven array
        int[] workingArray = multipleOfSeven();

//        boolean arrays
        boolean[] booleanArray = new boolean[2];
        booleanArray[0] = true;

//        print out multiple of seven array
        for (int temp :
                workingArray) {
            System.out.println(temp);
        }

//        printing reversed
        printingReverse(workingArray);

//        print out boolean array
        for (boolean temp :
                booleanArray) {
            System.out.print("\n" + temp);
        }

    }

    public static int[] multipleOfSeven() {

        int[] multipleOfSeven = new int[20];
        for (int i = 0; i < multipleOfSeven.length; i++) {
            multipleOfSeven[i] = 7 * (i + 1);
        }
        return multipleOfSeven;
    }

    public static void printingReverse(int[] givenArray) {
        for (int i = givenArray.length - 1; i >= 0; i--) {
            System.out.print(givenArray[i] + " ");
        }
    }
}



//    int[] mutipleOfSeven = new int[20];
//    StringBuilder string7 = new StringBuilder();
//        string7.append(mutipleOfSeven[i]).append(" ");
