package creational.factory.example01;

public class WhatsAppNotification implements Notification {

    private final String message;

    public WhatsAppNotification(String message) {
        this.message = message;
    }

    @Override
    public void notifyUser() {
        System.out.println("Sending whatsapp notification: " + message);
    }
}
