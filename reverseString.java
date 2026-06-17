// The function takes a string as input and returns the string in reverse order.

import java.util.*;
public class reverseString {
	public static void main (String[] args) {


		// Usual method:
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		System.out.print(rev);


		// Faster method 1:
		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		char[] ar = s.toCharArray();
		int i = 0;
		int j = arr.length-1;
		while (i < j) {
			char c = ar[i];
			ar[i] = ar[j];
			ar[j] = c;
			i++;
			j--;
		}
		s = new String(ar);
		System.out.print(s);


		// Faster method 2:
		Scanner sc = new Scanner (System.in);
		StringBuilder sb = new StringBuilder(sc.next());
		sb.reverse();
		System.out.print(sb.toString);
	}
}