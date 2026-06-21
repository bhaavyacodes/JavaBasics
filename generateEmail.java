import java.util.*;

public class generateEmail {
    public static void main(String[] args) {
        String firstName = "Bhaavya";
        String lastName = "Tilhari";
        String branch = "cse";
        int year = 25;
        System.out.println(generateEmail(firstName, lastName, branch, year));
    }
    public static String generateEmail(String firstName, String lastName, String branch, int year) {
        return firstName.toLowerCase() + '.' +lastName.toLowerCase() + '_' + branch.toLowerCase() + year % 100 + "@" + "gla.ac.in";
    }
}