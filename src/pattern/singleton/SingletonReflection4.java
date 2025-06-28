package pattern.singleton;

public class SingletonReflection4 {
//		private static final SingletonDemo1 INSTANCE = new SingletonDemo1(); //Eager loading
	private static SingletonReflection4 INSTANCE = null; // For Lazy loading

	String name = "Bhanu Chandar";

	private SingletonReflection4() {
		if(INSTANCE != null)
		{
			throw new RuntimeException("Object is already created");
		}
	}

	public static SingletonReflection4 getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonReflection4(); // Lazy loading
			return INSTANCE;
		} else
			return INSTANCE;
	}

	public void logging() {
		System.out.println("Logging.......");
	}
}
