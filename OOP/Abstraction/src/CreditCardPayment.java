public class CreditCardPayment extends Payment{


    @Override
    void processPayment(double amount) {
         initializeTransaction();
         System.out.println("Processing payment of $" + amount);
         confirmPayment();
    }

    @Override
    void initializeTransaction() {
        System.out.println("Initializing payment of credit card");
    }
}
