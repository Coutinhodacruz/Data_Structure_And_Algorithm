package algorithm;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        // Initialize x and result arrays
        int[] x = {4,2,1};
        int carry = 1;
        int[] result = new int[1];

// Loop through the elements of x starting from the last element
        for (int i = x.length - 1; i >= 0; i--) {
            // Add the carry to the current element of x
            int sum = x[i] + carry;

            // Compute the new carry if necessary
            carry = sum > 9 ? 1 : 0;

            // Add the least significant digit of the sum to the result array
            int[] newResult = new int[result.length + 1];
            newResult[0] = sum % 10;
            for (int j = 0; j < result.length; j++) {
                newResult[j+1] = result[j];
            }
            result = newResult;
        }

// Add the final carry if necessary
        if (carry == 1) {
            int[] newResult = new int[result.length + 1];
            newResult[0] = carry;
            for (int j = 0; j < result.length; j++) {
                newResult[j+1] = result[j];
            }
            result = newResult;
        }

// Output the result array
        System.out.println(Arrays.toString(result)); // Output: [1, 0]

    }
}
