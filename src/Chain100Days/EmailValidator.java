package Chain100Days;

import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        System.out.println(isValidEmail("john.doe@example.com"));      // true
        System.out.println(isValidEmail("user@sub.domain.co"));        // true
        System.out.println(isValidEmail("invalid-email@.com"));        // false
        System.out.println(isValidEmail("noatsign.com"));              // false
        System.out.println(isValidEmail("hello@domain"));              // false
    }
    public static boolean isValidEmail(String email){
        if (email == null) return false;

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";

        return Pattern.matches(regex, email);
    }
}

// Write a regex to validate an email address in Java.