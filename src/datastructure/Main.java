package datastructure;

import java.util.Arrays;

public class Main {

    public  static boolean log(int[] numbers, String[] names){

        for (int number : numbers) {
            System.out.println(number);

        }
        for (String name : names){
            System.out.println(name);
        }
        // 0(n * 2)
        for (int count : numbers)
            System.out.println(count);

        for (int first : numbers) // 0 (n)
            for (int second : numbers)
                Arrays.stream(numbers).mapToObj(third -> first + ", " + second + ", " + third).forEach(System.out::println);

        return false;
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        String[] words = {"okay"};
        System.out.println(log(array,words));
    }


}
