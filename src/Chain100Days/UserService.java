package Chain100Days;

public class UserService {
    public void registeredUser(String name, int age){
        if (age < 18){
            throw new UnderAgeException("User must be at least 18 years old");
        }
        System.out.println("User registered: " + name);
    }
}
