package pattern.factory;

public class FactoryPattern {
	Notification notification = null;

	public FactoryPattern(Notification notification) {
		super();
		this.notification = notification;
	}
	
	public static Notification generateNotification(String mode) {
		switch(mode) {
			case "sms":
				return new SmsNotification();
			case "email":
				return new EmailNotification();
			default:
				return null;
		}
	}
}
