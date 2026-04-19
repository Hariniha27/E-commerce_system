class User implements Observer {
    public void update(String msg) {
        System.out.println("Notification: " + msg);
    }
}