// Code to read a string and replace all occurrences of a given character with a hyphen. 
// The program reads three strings and a character from the user. 
// It then creates a new string by alternating characters from the first two strings, appending the third string at the end, 
// and finally replacing all occurrences of the specified character with a hyphen before printing the result.

import java.util.*;
public class StringAlternateShift {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		String f = sc.next();
		String s = sc.next();
		String t = sc.next();
		char n = sc.next().charAt(0);
		String name = "";
		int i = 0;
		int fl = f.length();
		int sl = s.length();
		while (i < fl & i < sl) {
			name += f.charAt(i) + "" + s.charAt(i);
			i++;
		}
		if (fl < sl) {
			i = fl;
			while (i < sl) {
				name += s.charAt(i);
				i++;
			} 
		}
		else {
			i = sl;
			while (i < fl) {
				name += f.charAt(i);
				i++;
			}
		}
		name += t;
		i = 0;
		while (i < name.length()) {
			if (name.charAt(i) == n) System.out.print("-");
			else System.out.print(name.charAt(i));
			i++;
		}
	}
}
