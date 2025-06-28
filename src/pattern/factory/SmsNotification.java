package pattern.factory;

public class SmsNotification implements Notification {

	@Override
	public void notifyy() {
		System.out.println("Sms notification.....");
	}

}
