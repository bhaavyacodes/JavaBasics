// https://www.hackerrank.com/challenges/array-zeros/problem

import java.util.*;

public class ArrayZeros {
    public static void main(String[] args) {
    	Scanner sc =  new Scanner(System.in);
    	int len = sc.nextInt();
    	int z = 0;
    	int nz = 0;
    	int[] ar = new int[len];
    	for (int i = 0; i < len; i++) {
    		ar[i] = sc.nextInt();
    		if (ar[i]==0) z++;
    		else nz++;
    	}
    	System.out.print((nz>z) ? "Dense" : "Not Dense");
    }
}