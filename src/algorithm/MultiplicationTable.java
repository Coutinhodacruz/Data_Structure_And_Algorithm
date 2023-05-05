package algorithm;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[] array = {2, 3, 7, 8, 10};
        MultiplicationTable table = new MultiplicationTable();
        table.tableOfMultiplication(array);


    }

    public void tableOfMultiplication(int[] array){
        int[][] table = new int[array.length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                table[i][j] = array[i] * array[j];
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

