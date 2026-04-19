class CheckoutFacade {
    Cart cart;
    Order order;

    CheckoutFacade(Cart cart, Order order) {
        this.cart = cart;
        this.order = order;
    }

    void placeOrder() {
        cart.checkout();
        order.notifyUsers();
        System.out.println("Order completed!");
    }
}