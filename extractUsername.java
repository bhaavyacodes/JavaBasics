
public class extractUsername {
    public static void main(String[] args) {
        String email = "bhaavyatilhari3498@gmail.com";
        System.out.println(extractUsername(email));
    }
    public static String extractUsername(String email) {
        int at = email.indexOf('@');
        if (at != -1) {
            return email.substring(0, at);
        }
        return email; 
    }
}
