package algorithm;

public class SortStrings {
    public static void main(String[] args) {
        String[] myArray = {"caroline", "hazard", "ben", "david", "fred", "ela", "isaac", "abel", "greg", "josh","zaza", "yamarita", "will"};
        sortStrings(myArray);
        System.out.println("\n==================");
        reverseString(myArray);
       }

    public static void sortStrings(String[] array) {
        int letter = array.length;
        for (int number = 0; number < letter - 1; number++) {
            int minIndex = number;
            for (int count = number + 1; count < letter; count++) {
                if (array[count].compareTo(array[minIndex]) < 0) {
                    minIndex = count;
                }
            }
            if (minIndex != number) {
                String temp = array[number];
                array[number] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        for (String word : array) {
            System.out.println(word);
        }

    }

    public static void reverseString(String[] myArray) {
        int newLetter = myArray.length;
        for (int number = 0; number < newLetter -1; number++) {
            int midIndex = number;
            for (int count = number ; count < newLetter; count++) {
                if (myArray[count].compareTo(myArray[midIndex]) > 0){
                    midIndex = count;
                }
            }
            if (midIndex > number){
                String temp = myArray[number];
                myArray[number] = myArray[midIndex];
                myArray[midIndex] = temp;
            }
        }
        for (String word : myArray) {
            System.out.println(word);
        }

    }
}




//    main method
//// Define and initialize the array of Strings
//  myArray = {"orange", "apple", "banana", "pear"}
//
//          // Call the sortStrings method to sort the array
//          sortStrings(myArray)
//
//          // Print out the sorted array
//          for each s in myArray
//          print s
//
//          sortStrings method (arr)
//          n = length of arr
//
//          // Loop through the array and find the minimum element
//          for i = 0 to n-2
//          minIndex = i
//          for j = i+1 to n-1
//          if arr[j] < arr[minIndex]
//        minIndex = j
//
//        // Swap the minimum element with the current element
//        if minIndex != i
//        temp = arr[i]
//        arr[i] = arr[minIndex]
//        arr[minIndex] = temp

