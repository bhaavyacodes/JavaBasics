// The function takes an integer as input and returns the nth prime number.

int NthPrime(int input1) {
    int count = 0, num = 1;
    while (input1 != count) {
        num++;
        if (isPrime(num)) count++;
    }
    return  num
}
boolean isPrime (int n) {
    for (int i = 2; i*i <= n; i++) {
        if (n % i == 0) return false;
    }
    return true;
}