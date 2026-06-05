// Given a number, return the sum of its even digits. If there are no even digits, return 0.

int EvenDigitsSum (int input1) {
	int sum = 0;
    while (input1 > 0){
        if (input1 % 10 % 2 == 0) {
            sum += input1 % 10;
        }
        input1 /= 10;
    }
    return sum;
}
