package Chain100Days;

interface MessageService{
    void sendMessage(String msg);
}

class EmailService implements MessageService{
    @Override
    public void sendMessage(String msg){
        System.out.println("Email sent: " + msg);
    }
}

class SmsService implements MessageService{
    @Override
    public void sendMessage(String msg){
        System.out.println("SMS sent: " + msg);
    }
}

class NotificationService {

    private final MessageService messageService;

    public NotificationService (MessageService messageService){
        this.messageService = messageService;
    }

    public void notify (String msg){
        messageService.sendMessage(msg);
    }
}

// Explain dependency injection and give a code example