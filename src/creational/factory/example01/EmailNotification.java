package creational.factory.example01;

public class EmailNotification implements Notification {

    private final String message;

    public EmailNotification(String message) {
        this.message = message;
    }

    @Override
    public void notifyUser() {
        System.out.println("Sending email notification: " + this.message);
    }
}
