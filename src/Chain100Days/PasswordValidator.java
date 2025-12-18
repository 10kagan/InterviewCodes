package Chain100Days;

public class PasswordValidator {
    public void validate(String password){
        if (password == null || password.length() < 0){
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }
    }


}
