package be.intecbrussel.hoofdstuk07;

public class Opdracht03_2dimArray {
    public static void main(String[] args) {

        int[] [] data = rowsAndColumns(4,6);
        printingTheArray(data);
    }

    public static int[][] rowsAndColumns(int row, int column) {

        int[] [] rowsAndColmuns = new int[row][column];

        // filling the arrays

        // we will go one by one, go through the rows
        for (row = 0; row < rowsAndColmuns.length; row++) {
            // for each row we will go one by one through the columns
            for (column = 0; column < rowsAndColmuns[row].length; column++) {
                rowsAndColmuns[row] [column] = row*column;
            }
        } return rowsAndColmuns;
    }

    public static void printingTheArray(int[][] data) {
        // printing array

        for (int[] row:
             data) {
            //going through the columns
            for (int value:
                 row) {
                System.out.printf(" " + value + " ");
            }
        }
    }
}
