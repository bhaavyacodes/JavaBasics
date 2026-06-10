// The function takes an integer as input and returns the factorial of that integer.

int nFactorial(int input1) {
	int factorial = 1;
    while (input1 > 0) {
        factorial *= input1;
        input1--;
    }
    return factorial;
}