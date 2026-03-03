package creational.factory.example01;

public class SmsNotification implements Notification {
    private final String message;

    public SmsNotification(String message) {
        this.message = message;
    }

    @Override
    public void notifyUser() {
        System.out.println("Sending sms notification: " + message);
    }
}
