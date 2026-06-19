// Code to read an array of integers and determine whether each element is prime or not.

import java.util.*;

public class ArrayPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int len = sc.nextInt();
        int[] ar = new int[len];
        for (int i = 0; i < len; i++) {
            ar[i] = sc.nextInt();
            if (prime(ar[i])==1) System.out.println("Not Prime");
            else System.out.println("Prime");
        }
    }
    public static int prime (int n) {
        int flag = 0;
        if (n<2) flag = 1;
        if (n>3) {
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }
        return (flag);
    }
}
