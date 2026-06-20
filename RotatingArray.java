// Rotate an array by r times.

import java.util.*;

public class RotatingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] ar = new int[len];
        for (int i = 0; i < len; i++) {
            ar[i]=sc.nextInt();
        }
        int r = sc.nextInt();
        if (r>len) r=r%len;
        for (int i = r; i < len; i++) {
            System.out.print(ar[i] + " ");
        }
        for (int i = 0; i < r; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}