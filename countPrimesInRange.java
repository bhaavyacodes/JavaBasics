// The function takes two integers as input and returns the count of prime numbers in the range between those two integers (inclusive).

int countPrimesInRange (int input1, int input2) {
    int count = 0;
    for (int i = input1; i <= input2; i++) {
        if (isPrime(i)) count++;
    }
    return count;
}
boolean isPrime (int n) {
    for (int i = 2; i*i <= n; i++) {
        if (n % i == 0) return false;
    }
    return true;
}