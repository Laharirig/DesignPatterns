package pattern.singleton;

public class SingletonCloneable5 implements Cloneable {
//		private static final SingletonDemo1 INSTANCE = new SingletonDemo1(); //Eager loading
	private static SingletonCloneable5 INSTANCE = null; // For Lazy loading

	String name = "Bhanu Chandar";

	private SingletonCloneable5() {
	}

	public static SingletonCloneable5 getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonCloneable5(); // Lazy loading
			return INSTANCE;
		} else
			return INSTANCE;
	}

	public void logging() {
		System.out.println("Logging.......");
	}

	protected Object clone() throws CloneNotSupportedException {
		return INSTANCE;
	}
}
