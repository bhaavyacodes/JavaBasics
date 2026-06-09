// Given two int values, return 3 if both numbers are zero, 2 if the first number is a multiple of the second, and 1 otherwise.

public int isMultiple (int input1, int input2) {
	return (input1 == 0 & input2 == 0) ? 3 : (input1 % input2 == 0) ? 2 : 1;
}