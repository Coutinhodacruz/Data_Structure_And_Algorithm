package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAscendingOrder {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>(Arrays.asList(2, 4, 3, 5, 1, "you are how"));
        reverseAscendingOrder(list);
        System.out.println(list);
    }

    public static void reverseAscendingOrder(List<Object> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compare(list.get(j), list.get(j + 1)) > 0) {
                    swap(list, j, j + 1);
                }
            }
        }
    }

    private static int compare(Object obj1, Object obj2) {
        if (obj1 instanceof Integer && obj2 instanceof Integer) {
            int num1 = (int) obj1;
            int num2 = (int) obj2;
            return Integer.compare(num1, num2);
        } else {
            String str1 = obj1.toString();
            String str2 = obj2.toString();
            return str1.compareTo(str2);
        }
    }

    private static void swap(List<Object> list, int i, int j) {
        Object temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
