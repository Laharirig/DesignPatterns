package pattern.singleton;

public class Test {
	public static void main(String[] args) {
		SingletonDemo1 in1 = SingletonDemo1.getInstance();
		SingletonDemo1 in2 = SingletonDemo1.getInstance();
		SingletonDemo1 in3 = SingletonDemo1.getInstance();
		
		System.out.println(in1.hashCode());
		System.out.println(in2.hashCode());
		System.out.println(in3.hashCode());
		in1.logging();
		in1.logging();
		in2.logging();
		in3.logging();
		
	}
}
