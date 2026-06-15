// The function takes an integer as input and returns the count of non-repeated digits in that integer.

int nonRepeatedDigitsCount (int input1) {
    int []ar = new int[10];
    int count = 0;
    while (input1 > 0) {
        ar [input1 % 10]++;
        input1 /= 10;
    }
    for (int i = 0; i < 10; i++) {
        if (ar[i] == 1) {
            count++;
        }
    }
    return count;
}