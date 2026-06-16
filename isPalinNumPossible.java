// The function takes an integer as input;
// returns 2 if it's possible to rearrange the digits of the number to form a palindrome
// 1 if it's not possible.

int isPalinNumPossible (int input1) {
    int []arr = new int[10];
    while (input1 > 0) {
        arr[input1 % 10]++;
        input1 /= 10;
    }
    int flag = 0;
    for (int i = 0; i < 10; i++) {
        if (arr[i] % 2 != 0) flag++;
    }
    return ((flag == 0) ? 2 : (flag == 1) ? 2 : 1);
}