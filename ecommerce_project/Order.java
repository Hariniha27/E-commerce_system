import java.util.*;

class Order {
    List<Observer> users = new ArrayList<>();

    void addObserver(Observer o) {
        users.add(o);
    }

    void notifyUsers() {
        for (Observer o : users) {
            o.update("Order placed successfully!");
        }
    }
}