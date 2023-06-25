package algorithm;

import java.util.Arrays;

public class MergeSortReverse {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 1, 7, 9};
        mergeSort(arr, 0, arr.length - 1);
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);

        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int numberOne = mid - left + 1;
        int numberTwo = right - mid;

        int[] leftArr = new int[numberOne];
        int[] rightArr = new int[numberTwo];

        for (int firstIndex = 0; firstIndex < numberOne; ++firstIndex)
            leftArr[firstIndex] = arr[left + firstIndex];
        for (int secondIndex = 0; secondIndex < numberTwo; ++secondIndex)
            rightArr[secondIndex] = arr[mid + 1 + secondIndex];

        int index = 0, indexTwo = 0;
        int count = left;
        while (index < numberOne && indexTwo < numberTwo) {
            if (leftArr[index] >= rightArr[indexTwo]) {
                arr[count] = leftArr[index];
                index++;
            } else {
                arr[count] = rightArr[indexTwo];
                indexTwo++;
            }
            count++;
        }

        while (index < numberOne) {
            arr[count] = leftArr[index];
            index++;
            count++;
        }

        while (indexTwo < numberTwo) {
            arr[count] = rightArr[indexTwo];
            indexTwo++;
            count++;
        }
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}

