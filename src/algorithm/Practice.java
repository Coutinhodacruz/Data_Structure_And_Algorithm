package algorithm;

public class Practice {

    public static void main(String[] args) {
        String[] myArray = {"caroline", "hazard", "ben", "david", "fred", "ela", "isaac", "abel", "greg", "josh","zaza", "yamarita", "will"};
        sortWords(myArray);
    }



    public static void sortWords(String[] array){
        int number = array.length;

        for (int i = 0; i < number - 2; i++) {
            int midIndex = i;
            for (int j = i + 1; j < number - 1; j++) {
                if (array[j].compareTo(array[midIndex]) < 0) {
                    midIndex = j;
                }
                if (midIndex != i){
                   String temp = array[i];
                    array[i] = array[midIndex];
                    array[midIndex] = temp;
                }
            }
        }
        for (String word : array){
            System.out.println(word);
        }
    }
}
