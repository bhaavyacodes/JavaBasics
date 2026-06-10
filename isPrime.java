// The function takes an integer as input and returns 1 if the number is prime, else returns 2.

int isPrime(int input1) {
	int count = 2;
        if (input1 == 2) return 2;
        else {
            int i = 2;
            while (count==2 & i<input1) {
                if (input1 % i == 0) count = 1;
                i++;
            }
            return count;
        }
}