package pattern.singleton;

public class SingletonMultithreading3{
//	private static final SingletonDemo1 INSTANCE = new SingletonDemo1(); //Eager loading
	private static SingletonMultithreading3 INSTANCE = null; // For Lazy loading

	private SingletonMultithreading3() {
	}

	public static SingletonMultithreading3 getInstance() {
		if(INSTANCE == null)
		{
			synchronized (SingletonMultithreading3.class) {
				if (INSTANCE == null) {
					INSTANCE = new SingletonMultithreading3();    //Lazy loading
					return INSTANCE;
				}
					
			}
		}
		return INSTANCE;
	}
	public void logging() {
		System.out.println("Logging.......");
	}
}
