package pattern.singleton;

public class SingletonDemo1{
//	private static final SingletonDemo1 INSTANCE = new SingletonDemo1(); //Eager loading
	private static SingletonDemo1 INSTANCE = null; // For Lazy loading
	
	String name = "Bhanu Chandar";

	private SingletonDemo1() {
	}

	public static SingletonDemo1 getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonDemo1();    //Lazy loading
			return INSTANCE;
		} else
			return INSTANCE;
	}
	public void logging() {
		System.out.println("Logging.......");
	}
}
