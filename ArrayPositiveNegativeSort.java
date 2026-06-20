// https://www.hackerrank.com/challenges/java-negative-subarray/problem

import java.util.*;

public class ArrayPositiveNegativeSort {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int len = sc.nextInt();
    	int[] ar = new int[len];
    	for (int i = 0; i < len; i++) {
    		ar[i] = sc.nextInt();
    		if (ar[i] >= 0) System.out.print(ar[i] + " ");
    	}
    	for (int i = 0; i < len; i++) {
    		if (ar[i]<0) System.out.print(ar[i] + " ");
    	}
    }
}
