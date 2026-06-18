// The function takes a string as input and returns the string in both lowercase and uppercase.

import java.util.*;

public class StringLowerUpper {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		String l = s.toLowerCase();
		String u = s.toUpperCase();
		System.out.println(l);
		System.out.println(u);
	}
}