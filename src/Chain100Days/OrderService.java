package Chain100Days;

public class OrderService {

    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public String placeOrder(String orderId){
        boolean paid = paymentService.processPayment(orderId);

        if (paid) {
            return "ORDER_CONFIRMED";
        } else{
            return "PAYMENT_FAILED";
        }
    }


}
