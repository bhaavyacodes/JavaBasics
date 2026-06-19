// Code to read an array of integers and find the first negative integer in every window of size k.
// The program reads an array of integers and a window size from the user.

import java.util.*;

public class NegativeSlidingWindow {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int len = sc.nextInt();                     //  array length.
        int[] ar = new int[len];                    //  {12, -1, -7, 8, -15, 30, 16, 28};
        for (int i = 0; i < len; i++) {
            ar[i] = sc.nextInt();
        }
        int w = sc.nextInt();                       //  window length.
        
        int j = w-1;
        for (int i = 0; j < ar.length; j++, i++) {
            int x = isNeg(ar, i, j);
            System.out.print(x + " ");
        }
    }

    public static int isNeg(int[] ar, int x, int y) {
        while (x <= y) {
            if (ar[x] < 0) return ar[x];
            x++;
        }
        return 0;
    }
}