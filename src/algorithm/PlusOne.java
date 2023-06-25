package algorithm;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

        int[] x = {4,2,1};
        int carry = 1;
        int[] result = new int[1];


        for (int i = x.length - 1; i >= 0; i--) {

            int sum = x[i] + carry;


            carry = sum > 9 ? 1 : 0;


            int[] newResult = new int[result.length + 1];
            newResult[0] = sum % 10;
            for (int j = 0; j < result.length; j++) {
                newResult[j+1] = result[j];
            }
            result = newResult;
        }


        if (carry == 1) {
            int[] newResult = new int[result.length + 1];
            newResult[0] = carry;
            for (int j = 0; j < result.length; j++) {
                newResult[j+1] = result[j];
            }
            result = newResult;
        }


        System.out.println(Arrays.toString(result));

    }
}
