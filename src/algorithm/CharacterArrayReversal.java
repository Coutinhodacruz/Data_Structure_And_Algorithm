package algorithm;

import java.util.Arrays;

public class CharacterArrayReversal {
    public static void main(String[] args) {
        char[] arr = {'F', 'S', 'A', 'C', 'Z', 'E'};
        reverseCharArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseCharArray(char[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
