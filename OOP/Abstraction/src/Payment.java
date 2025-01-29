public abstract class Payment {


    // Class Abstract method: just showing what this class does
    // and abstracting away how it's been done

    abstract void processPayment(double amount);
    abstract void initializeTransaction();

    // class normal method
    public void confirmPayment(){
        System.out.println("Payment confirmed.");
    }
}
