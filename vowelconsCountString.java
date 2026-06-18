//Write a program to count the number of vowels and consonants in a user-defined string.

import java.util.*;

public class vowelconsCountString {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		int v = 0;
		int c = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLetter(ch)) {
				if (ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u') {
					v++;
				}
				else {
					c++;
				}
			}
		}
		System.out.print(v + " " + c);
	}

}