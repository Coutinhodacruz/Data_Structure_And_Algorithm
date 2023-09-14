package algorithm;


public class SwappingNumber {


    public int[] swapping(int[] arr) {

        int [] array = {22, 18, 15, 13, 5, 3};
        for (int i = 0; i < array.length - 1; i += 2) {
            if (arr[i] % 2 == 0 && arr[i + 1] % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        return arr;
    }
}
