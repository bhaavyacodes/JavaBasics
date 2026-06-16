// The function takes an integer as input and returns the sum of its digits until the result is a single digit.
// If the input is negative, the output will also be negative.

int digitSum (int input1) {
	int input = Math.abs(input1);
    while (input>9){
        input = numsum(input);
    }
	return ((input1>0) ? input : (input*(-1)));
}
int numsum (int num) {
    int sum = 0;
    while (num > 0){
        sum += num % 10;
        num /= 10;
    }
    return sum;
}
