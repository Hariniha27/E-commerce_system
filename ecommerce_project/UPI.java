class UPI implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid using UPI: " + amount);
    }
}