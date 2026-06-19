// The function takes an array of integers and a window size as input; it returns the maximum sum of any contiguous subarray of the given size.

import java.util.*;

public class SlidingWindowMaxSum {
    public static void main(String[] args) {

        int[] arr = {0,-1,2,5,-6,4,10,-4};
        int i = 0;
        int j = 0;
        int w = 3;
        int sum = 0;

        for (; j < w; j++) {
            sum += arr[j];
        }

        int max = sum;

        for (; j < arr.length; j++, i++) {
            sum += arr[j] - arr[i];
            if (sum > max) max = sum;
        }

        System.out.print(max);

    }
}