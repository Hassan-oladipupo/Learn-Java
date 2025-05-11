public class Main {
    public static void main(String[] args)
    {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        PayPalPayment payPalPayment = new PayPalPayment();
        BankTransferPayment bankTransferPayment = new BankTransferPayment();


        creditCardPayment.processPayment(700);
        payPalPayment.processPayment(900);
        bankTransferPayment.processPayment(500);
    }
}