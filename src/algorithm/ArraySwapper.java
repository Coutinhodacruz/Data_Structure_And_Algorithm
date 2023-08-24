package algorithm;

public class ArraySwapper {

    public static void swapElements(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12};


        swapElements(array, 0, 5);

        swapElements(array, 1, 4);

        swapElements(array, 2, 3);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
