public class StrategyPatternTest {

    public static void main(String[] args) {
        
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
        PaymentStrategy payPal = new PayPalPayment("john.doe@example.com");

        
        PaymentContext paymentContext = new PaymentContext(creditCard);
        System.out.println("Using Credit Card Payment:");
        paymentContext.executePayment(250.00);

        
        paymentContext.setPaymentStrategy(payPal);
        System.out.println("\nUsing PayPal Payment:");
        paymentContext.executePayment(150.00);
    }
}
