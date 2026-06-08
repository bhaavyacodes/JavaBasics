// Given an int value, return the second to last digit. 
// If the number is negative, ignore the negative sign and return the second to last digit of the absolute value.

public int secondLastDigitOf (int input1) {
     input1 = Math.abs(input1);
     return input1 / 10 % 10;   
}
