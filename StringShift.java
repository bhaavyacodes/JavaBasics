// The program concatenates the first two strings. 
// Shifts each character in the concatenated string by the integer value.
// Appends the third string at the end, and prints the final result.

import java.util.*;
public class StringShift {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		String f = sc.next();
		String s = sc.next();
		String t = sc.next();
		int n = sc.nextInt();
		String name = f + s;
		String result = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isUpperCase(ch)) ch = (char) ((ch - 'A' + n) % 26 + 'A');
			else if (Character.isLowerCase(ch)) ch = (char) ((ch - 'a' + n) % 26 + 'a');
			result += ch;
		}
		System.out.print(result+t);
	}
}
