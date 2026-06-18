// https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.util.*;

public class charOccuranceinString {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		char c = sc.next().charAt(0);
		int chc = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (c==ch) chc++;
		}
		System.out.print(chc);
	}
}