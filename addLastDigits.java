// Given two int values, return the sum of their last digits.
// The program handles negative numbers by taking the absolute value before calculating the last digit.

public int addLastDigits (int input1, int input2) {
     input1 = Math.abs(input1);
     input2 = Math.abs(input2);
     return input1 % 10 + input2 % 10;   
}
