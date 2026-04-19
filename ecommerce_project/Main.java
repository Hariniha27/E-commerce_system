public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart();
        cart.addProduct(new Product("Shoes", 2000));
        cart.addProduct(new Product("Bag", 1500));

        cart.setPaymentStrategy(new UPI());

        Order order = new Order();
        order.addObserver(new User());

        CheckoutFacade facade = new CheckoutFacade(cart, order);
        facade.placeOrder();
    }
}