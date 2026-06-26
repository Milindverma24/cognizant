interface Notification {
    void notifyUser();
}

class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Email Notification Sent Successfully.");
    }
}

class SMSNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("SMS Notification Sent Successfully.");
    }
}

class PushNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Push Notification Sent Successfully.");
    }
}

class NotificationFactory {

    public Notification createNotification(String type) {

        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        }

        if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        }

        if (type.equalsIgnoreCase("PUSH")) {
            return new PushNotification();
        }

        return null;
    }
}

public class Factory_Method_Pattern {

    public static void main(String[] args) {

        NotificationFactory factory = new NotificationFactory();

        Notification notification1 = factory.createNotification("EMAIL");
        notification1.notifyUser();

        Notification notification2 = factory.createNotification("SMS");
        notification2.notifyUser();

        Notification notification3 = factory.createNotification("PUSH");
        notification3.notifyUser();
    }
}