// Given 4 integers, find the most frequent digit among them.
// If there are several such digits, return the largest one.

int MostFrequentDigit (int input1, int input2, int input3, int input4) {
	int []ar = new int[10];
    if (input1 == 0) ar[0]++;
    if (input2 == 0) ar[0]++;
    if (input3 == 0) ar[0]++;
    if (input4 == 0) ar[0]++;
    while (input1 > 0) {
        ar[input1 % 10]++;
        input1 /= 10;
    }
    while (input2 > 0) {
        ar[input2 % 10]++;
        input2 /= 10;
    }
    while (input3 > 0) {
        ar[input3 % 10]++;
        input3 /= 10;
    }
    while (input4 > 0) {
        ar[input4 % 10]++;
        input4 /= 10;
    }
    int max = 0; 
    int in = 0;
    for (int i = 9; i >= 0; i--) {
        if (max < ar[i]) {
            max = ar[i];
            in = i;
        }
    }
    return (in);
}