// The function takes an integer as input and returns an integer as output. 
// The return value is 2 if the input number is a palindrome, otherwise it returns 1.

int isPalinNum (int input1) {
	int n = input1;
    int num = 0;
    while (n>0){
        num *= 10;
        num += n % 10;
        n /= 10;
    }
    return ((num == input1) ? 2 : 1);
}