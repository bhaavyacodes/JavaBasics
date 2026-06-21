import java.util.*;

public class maskEmail {
    public static void main(String[] args){
        String email = "bhaavyatilhari3498@gmail.com";
        System.out.print (maskEmail(email));
    }
    public static String maskEmail(String email) {
        int at = email.indexOf('@');
        if (at == -1 || at < 6) return email;
        String username = email.substring(0, at);
        String domain = email.substring(at);
        return username.substring(0, 3) + "*".repeat(at - 5) + username.substring(at - 2,at) + domain;
    }
}