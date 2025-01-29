public class BankTransferPayment extends Payment{
    @Override
    void processPayment(double amount) {
        initializeTransaction();
        System.out.println("Processing bank transfer Payment of $" + amount);
        confirmPayment();
    }

    @Override
    void initializeTransaction() {
       System.out.println("Initializing bank payment method with bank verification");
    }
}
