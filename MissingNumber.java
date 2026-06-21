// Code to read an array of integers and find the sum of the absolute differences between the indices of the three occurrences of a repeated number.

import java.util.*;

public class ArrayPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int len = sc.nextInt();
        int[] ar = new int[len];
        for (int i = 0; i < len; i++) {
            ar[i] = sc.nextInt();
        }
        int x = 0;
        int y = 0;
        int z = 0;
        for (int i = 0; i < len; i++){
            for (int j = i; j < len; j++) {
                for(int k = j; k < len; k++) {
                    if (ar[i] == ar[j] & ar[j] == ar[k]) {
                        x = i;
                        y = j;
                        z = k;
                    }
                }
            }
        }
        int a = i - j;
        int b = j - k;
        int c = k - i;
        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);
        System.out.print(a+b+c);
    }
}