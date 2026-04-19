import java.util.*;

class Cart {
    List<Product> products = new ArrayList<>();
    PaymentStrategy strategy;

    void addProduct(Product p) {
        products.add(p);
    }

    int getTotal() {
        int total = 0;
        for (Product p : products) {
            total += p.price;
        }
        return total;
    }

    void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    void checkout() {
        strategy.pay(getTotal());
    }
}