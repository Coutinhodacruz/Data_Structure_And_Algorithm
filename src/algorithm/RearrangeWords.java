package algorithm;

public class RearrangeWords {

    public static String getResult(int[] arr, String str) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += str.charAt(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {0,3,2,4,5,1,6,7,8};
        String str = "someiclon";
        int[] array = {4,5,6,7,0,1,2,3};
        String word = "codeleet";
        String result = getResult(arr, str);
        String secondResult = getResult(array, word);
        System.out.println(result);
        System.out.println(secondResult);
    }

}
