package algorithm;



public class BinarySearch {


    public static int binarySearch(String[] array, String number){

        int low = 0;
        int high = array.length -1;

        while (low <= high){
            int mid = (low + high) / 2;
            int sort = number.compareTo(array[mid]);
            if (sort < 0){
                high = mid -1;
            } else if (sort > 0) {
                high = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {


    }
}
