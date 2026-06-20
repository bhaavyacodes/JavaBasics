// https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.util.*;

public class StringAlternateSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        for (int i = 1; i < s.length(); i++) {
            System.out.print (s.charAt(i));
            System.out.print (s.charAt(i-1));
            i++;
        }
        if (s.length() % 2 != 0) System.out.print(s.charAt(s.length()-1));
    }
}