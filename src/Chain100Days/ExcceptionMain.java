package Chain100Days;

public class ExcceptionMain {
    public static void main(String[] args) {

        UserService service = new UserService();

        service.registeredUser("Alice", 25);
        service.registeredUser("Bob", 16);
    }
}

// Create a custom exception and throw it in a method