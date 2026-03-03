package creational.factory.example01;

public class NotificationFactory {

    public static Notification createNotification(String type, String message) {
        if (type == null || type.isBlank()) {
            return null;
        }

        return switch (type.toLowerCase()) {
            case "sms" -> new SmsNotification(message);
            case "whatsapp" -> new WhatsAppNotification(message);
            case "email" -> new EmailNotification(message);
            default -> throw new IllegalArgumentException("Invalid notification type");
        };

    }
}
