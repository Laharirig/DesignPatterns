package pattern.singleton;

import java.io.Serializable;

public class SingletonSerialzable2 implements Serializable {
//	private static final SingletonDemo1 INSTANCE = new SingletonDemo1(); //Eager loading
	private static SingletonSerialzable2 INSTANCE = null; // For Lazy loading
	
	String name = "Bhanu Chandar";

	private SingletonSerialzable2() {
	}

	public static SingletonSerialzable2 getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonSerialzable2();    //Lazy loading
			return INSTANCE;
		} else
			return INSTANCE;
	}
	public void logging() {
		System.out.println("Logging.......");
	}
	// It will give same obj and not create new singleton obj while de-serialzation(using readObject() internally calls readResolve to create new obj)
	Object readResolve() {   //soln for breking singleton using serialzation
		return INSTANCE;
	}
}
