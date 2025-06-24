package pattern.singleton;

// Thread Defn : Thread is nothing but a independent path of execution with in a program 

public class BreakingSingletonUsingMultithreading extends Thread {

	public static void main(String[] args) {
		BreakingSingletonUsingMultithreading t1 = new BreakingSingletonUsingMultithreading();
		BreakingSingletonUsingMultithreading t2 = new BreakingSingletonUsingMultithreading();
		t1.setName("Thread -1");
		t2.setName("Thread -2");
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		SingletonMultithreading3 s1 = SingletonMultithreading3.getInstance();
		System.out.println(s1.hashCode()+" - "+Thread.currentThread().getName());
	}
}
