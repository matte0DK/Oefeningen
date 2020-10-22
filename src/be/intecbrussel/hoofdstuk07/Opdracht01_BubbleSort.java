package be.intecbrussel.hoofdstuk07;

public class Opdracht01_BubbleSort {

    // Driver program
    public static void main(String args[]) {

        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
    static void bubbleSort(int[] arr, int lengthArr) {

        int i, j, temp;                                         /* i = index of array, j = index to compare with i */
        boolean swapped;

        for (i = 0; i < lengthArr - 1; i++) {

            swapped = false;
            for (j = 0; j < lengthArr - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)       /* IF no two elements were swapped by inner loop, then break*/
                break;
        }
    }
    // method to print an array

    static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }



}
