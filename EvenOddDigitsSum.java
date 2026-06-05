// Given an integer and a string, return the sum of the even or odd digits in the integer depending on the string (e.g. if the string is "even", return the sum of the even digits, and if the string is "odd", return the sum of the odd digits).

int EvenOddDigitsSum(int input1, String input2) {
	int Esum = 0;
    int Osum = 0;
    while (input1 > 0){
        if (input1 % 10 % 2 == 0) {
            Esum += input1 % 10;
        }
        else {
            Osum += input1 % 10;
        }
        input1 /= 10;
    }
    return input2.equals("even") ? Esum : Osum;
}