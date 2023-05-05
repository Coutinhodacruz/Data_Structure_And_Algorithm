package algorithm;

import java.util.Arrays;

public class SecondHighestNumber {
    
    public static int[] secondHighest(int[] numbers){
        int highest = 0;
        int secondHighest = 0;

        for (int i = 0; i <= numbers.length; i++) {
            if (numbers[i] >= highest){
                secondHighest = highest;
                highest = numbers[i];
            } else if (numbers[i] > secondHighest && numbers[i] < highest) {
                secondHighest = numbers[i];
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] arrayNumbers = {21,28,10,4,40,40};

        System.out.println(Arrays.toString(secondHighest(arrayNumbers)));
    }
}
