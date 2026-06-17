// The function takes a string as input and checks if it is a palindrome (a string that reads the same backward as forward).

import java.util.*;
public class palinString {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		String palin = "";
		for (int i = 0; i < str.length(); i++) {
			palin = str.charAt(i) + palin;
		}
		System.out.print(str.equals(palin) ? "Palindrome" : "Not Palindrome");
	}
}