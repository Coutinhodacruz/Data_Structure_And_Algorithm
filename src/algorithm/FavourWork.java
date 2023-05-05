package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class FavourWork {


    public int[] searchRange(int[] numbers, int target) {
        int count = numbers.length;
        int[] result = {-1, -1};

        int left = 0;
        int right = count - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] == target) {
                result[0] = mid;
                result[1] = mid;
                break;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (result[0] == -1) {
            return result;
        }
        left = 0;
        right = result[0] - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] == target) {
                result[0] = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        left = result[1] + 1;
        right = count - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] == target) {
                result[1] = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        FavourWork favourWork = new FavourWork();
        Scanner input = new Scanner(System.in);

        int[] arrays = {5, 7, 7, 8, 8, 10,4,9,10};
//        int target = 10;
        // System.out.println(Arrays.toString(favourWork.searchRange(arrays, target)));
        System.out.println("yes --> to use the app ");
        String choice = input.next();

        while (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter a target number");
            int number = input.nextInt();

            System.out.println(Arrays.toString(favourWork.searchRange(arrays, number)));

            System.out.println("yes --> to use the app ");
            choice = input.next();

//        }
        }

    }
}

































//    public int[] searchRange(int[] nums, int target) {
//        int n = nums.length;
//        int[] result = {-1, -1};
//
//        // Binary search to find the target value
//        int left = 0, right = n - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] == target) {
//                result[0] = mid;
//                result[1] = mid;
//                break;
//            } else if (nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//
//        // If target value was not found, return [-1, -1]
//        if (result[0] == -1) {
//            return result;
//        }
//
//        // Binary search to find starting position of target value
//        left = 0;
//        right = result[0] - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] == target) {
//                result[0] = mid;
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//
//        // Binary search to find ending position of target value
//        left = result[1] + 1;
//        right = n - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] == target) {
//                result[1] = mid;
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//
//        return result;
//    }