// Given five int values and a String ("even" or "odd"), return the count of how many of the int values are even or odd, depending on the String input(even or odd).

public int countEvensOdds (int input1, int input2, int input3, int input4, int input5, String input6) {
	int Ocount = 0;
    int Ecount = 0;
    if (input1%2==0) Ecount++;
    else Ocount++;
    if (input2%2==0) Ecount++;
    else Ocount++;
    if (input3%2==0) Ecount++;
    else Ocount++;
    if (input4%2==0) Ecount++;
    else Ocount++;
    if (input5%2==0) Ecount++;
    else Ocount++;
    return (input6.equals("even")) ? Ecount : Ocount;
}