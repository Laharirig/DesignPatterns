package pattern.factory;

public class EmailNotification implements Notification {

	@Override
	public void notifyy() {
		System.out.println("Email notification.....");
	}

}
