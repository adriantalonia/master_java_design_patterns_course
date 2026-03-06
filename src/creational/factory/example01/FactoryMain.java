package creational.factory.example01;

public class FactoryMain {
    public static void main(String[] args) {
        Notification emailNotification = NotificationFactory.createNotification("email", "Hello from email");
        emailNotification.notifyUser();

        Notification smsNotification = NotificationFactory.createNotification("sms", "Hello from sms");
        smsNotification.notifyUser();

        Notification whatsappNotification = NotificationFactory.createNotification("whatsapp", "Hello from whatsapp");
        whatsappNotification.notifyUser();

        // throw an exception
        //Notification pushNotification = NotificationFactory.createNotification("push", "Hello from push");
        //pushNotification.notifyUser();

    }
}
