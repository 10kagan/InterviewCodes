package Chain100Days;

public class CardMain {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService(new EmailService());
        notificationService.notify("Hello!");

        NotificationService notificationService1 = new NotificationService(new SmsService());
        notificationService1.notify("Hello!");
    }
}

// Design a class to represent a deck of cards