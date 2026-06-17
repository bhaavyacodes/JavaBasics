// This program calculates the sum of the maximum digits in each window of size k in the number n.

import java.util.*;
public class SumOfNumberByWindow {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int m = (int)(Math.pow(10,k));
		int temp = n;
		int count = 0;
		while (temp > 0) {
			temp /= 10;
			count++;
		}
		if (k > count) System.out.print(0);
		else {
			int sum = 0;
			while (n > m / 10) {
				int x = n % m;
				int max = 0;
				for (int i = 0; i < k; i++) {
					if (x % 10 > max) max = x % 10;
					x /= 10;
				}
				sum += max;
				n /= 10;
			}
			System.out..print(sum);
		}
	}
}