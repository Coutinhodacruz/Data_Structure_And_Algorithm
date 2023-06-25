package algorithm;

public class SubSumArray {

    public static int maxSubSumArray(int[] array, int number){
        int count = array.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            sum += array[i];
            if (i >= number -1){
                maxSum = Math.max(maxSum, sum);
                sum -= array[i - number + 1];
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int number = 3;
        int maxSum = maxSubSumArray(arr, number);
        System.out.println("Maximum sum of subarray of size " + number + " is " + maxSum);

    }
}
