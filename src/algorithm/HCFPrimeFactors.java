package algorithm;

import java.util.ArrayList;
import java.util.List;

public class HCFPrimeFactors {

    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 42;
        List<Integer> factors1 = primeFactors(num1);
        List<Integer> factors2 = primeFactors(num2);
        List<Integer> hcfFactors = new ArrayList<>();
        for (int factor : factors1) {
            if (factors2.contains(factor)) {
                hcfFactors.add(factor);
                factors2.remove(Integer.valueOf(factor));
            }
        }
        System.out.println(hcfFactors);
    }

    public static List<Integer> primeFactors(int num) {
        List<Integer> factors = new ArrayList<>();
        int i = 2;
        while (i * i <= num) {
            if (num % i == 0) {
                factors.add(i);
                num /= i;
            } else {
                i++;
            }
        }
        if (num > 1) {
            factors.add(num);
        }
        return factors;
    }


}
