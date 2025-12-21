package Chain100Days;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

    @Mock
    private PaymentService paymentService;

    @InjectMocks
    private OrderService orderService;

    @Test
    public void shouldConfirmOrderWhenPaymentIsSuccessful() {

        // Arrange
        when(paymentService.processPayment("ORD123")).thenReturn(true);

        // Act
        String result = orderService.placeOrder("ORD123");

        // Assert
        assertEquals("ORDER_CONFIRMED", result);

        // Verify
        verify(paymentService).processPayment("ORD123");
    }

    @Test
    public void shouldFailOrderWhenPaymentFails() {

        when(paymentService.processPayment("ORD999")).thenReturn(false);

        String result = orderService.placeOrder("ORD999");

        assertEquals("PAYMENT_FAILED", result);
        verify(paymentService).processPayment("ORD999");
    }
}

// Mock a service call using Mockito