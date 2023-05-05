package algorithm;

public class Duplicate {

    public static void main(String[] args) {
        int[] givenArray = {2,3,3,4,1,1,12,4};
         duplicateNumber(givenArray);
        System.out.println(duplicateNumber(givenArray));

    }

    public static int duplicateNumber(int[] array){

        boolean isDuplicate = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (i != j && array[i] == array[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                return array[i];

            }
        }

        return -1;
    }
}
