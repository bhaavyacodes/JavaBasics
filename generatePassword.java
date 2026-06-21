public class generatePassword {
    public static String generatePassword(String name, int year) {
        return name.substring(0, Math.min(4, name.length())).toUpperCase() + year;
    }
    public static void main (String[] args) {
        String name = "avi";
        int year = 2006;
        System.out.println(generatePassword(name, year));
    }
}