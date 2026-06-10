// The function takes an integer as input and returns the nth Fibonacci number.

int nthFibonacci(int input1) {
    int a = 0, b = 1, c = 0;
    if (input1 == 1) return 0;
    else if (input1 == 2 | input1 == 0) return 1;
    else {
        for (int i = 2; i <= input1; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }
}