// Code to read an integer and return the last digit of the number. 
// The program handles negative numbers by taking the absolute value before calculating the last digit.

public int lastDigitOf (int input1) {
     input1 = Math.abs(input1);
     return input1 % 10;   
}
