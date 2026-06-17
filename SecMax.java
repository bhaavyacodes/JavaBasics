// https://www.hackerrank.com/challenges/java-2d-array/problem

import java.util.*;
public class SecMax {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int[] arr = new int[s];
		for (int i = 0; i < s; i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0;
		int max2 = 0;
		for (int i = 0; i < s; i++) {
			if (arr[i] > max) {
				max2 = max;
				max = arr[i];
			}
			else if (arr[i] > max2 & arr[i] != max) {
				max2 = arr[i];
			}
		}
		System.out.print(max2);
	}
}