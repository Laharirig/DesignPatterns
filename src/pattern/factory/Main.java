package pattern.factory;

public class Main {
	public static void main(String[] args) {
		Notification smsNotification = FactoryPattern.generateNotification("sms");
		smsNotification.notifyy();
		Notification emailNotification = FactoryPattern.generateNotification("email");
		emailNotification.notifyy();
	}
}
