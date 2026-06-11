// The function takes a string as input and returns the first string code as an integer.
// The first string code is calculated by splitting the input string into words, 
// and for each word, calculating the sum of the absolute differences between the positions of the characters in the word
// and their corresponding characters from the end of the word. 
// The final output is a concatenation of these sums for all words in the input string.

int firstStringCode (String input1) {
    String[] arr = input1.split("\\s+");
    String out = "";
    for (int i = 0; i < arr.length; i++) {
        int sum = 0;
        int len = arr[i].length();
        for (int j = 0; j < (len+1) / 2; j++) {
            int a = Character.toUpperCase(arr[i].charAt(j)) - 'A' + 1;
            int b = Character.toUpperCase(arr[i].charAt(len - 1 - j)) - 'A' + 1;
            if (j == len - 1 - j) {
                sum += a;
            } else {
                sum += Math.abs(a - b);
            } 
        }
        out += sum;
    }
    return Integer.parseInt(out);
}