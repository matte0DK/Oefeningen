package be.intecbrussel.hoofdstuk07;

public class VoorbeeldArrayD2 {
    public static void main(String[] args) {

        // all arrays have same length
        int[] [] arrayOfArray1 = new int[5] [2];

        // subarrays have different lengths
        int[] [] arrayOfArray2 = new int [5] [];

        arrayOfArray2[0] = new int[3];
        arrayOfArray2[1] = new int[2];

        arrayOfArray2[2] = new int[] {5,2};

        // anomnieme declaratie array
        int[] [] arrayOfArray3 = {{5,2},{4,5,7}};

        //printing a specific spot
        System.out.println(arrayOfArray2[2] [1]);
        System.out.println(arrayOfArray3[1] [1]);


    }
}
