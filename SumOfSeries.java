// The function takes an integer n as input and returns the sum of the series 1 + 1! + 2! + ... + n!.

int SumOfSeries (int n) {
	int sum = 1;
	for (int i = 1;i <= n; i++) {
		sum += nFactorial(i);
	}
}

int nFactorial(int input1) {
	int factorial = 1;
    while (input1 > 0) {
        factorial *= input1;
        input1--;
    }
    return factorial;
}