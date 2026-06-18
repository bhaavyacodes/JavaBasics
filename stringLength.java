// The function takes a string as input and returns the length of the string without using the built-in length() method.

import java.util.*;
public class stringLength {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		int c = 0;
		int i = 0;
		
		try{
			while(true){
				s.charAt(i);
				c++;
				i++;
			}
		}
		catch(Exception e){}

		System.out.print(c);
	}
}