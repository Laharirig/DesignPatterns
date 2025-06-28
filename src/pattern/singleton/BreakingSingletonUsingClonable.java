package pattern.singleton;


//To enable cloning, the Singleton class must implement the Cloneable interface.
/* Overriding clone():
The clone() method from Object (or a superclass) needs to be overridden to allow the creation of a new instance. 
By default, Object.clone() performs a shallow copy.
*/
/* Creating a Copy:
When clone() is invoked on the existing Singleton instance, it creates a new, distinct instance of the class. 
This new instance will have a different memory address (and thus a different hash code) compared to the original Singleton instance.
*/
public class BreakingSingletonUsingClonable {

	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonDemo1 s1 = SingletonDemo1.getInstance();
		System.out.println(s1.hashCode()); 				//gives diff hashcode
		SingletonDemo1 clone = (SingletonDemo1)s1.clone();
		System.out.println(clone.hashCode());			//gives diff hashcode
		
		SingletonCloneable5 s2 = SingletonCloneable5.getInstance();
		System.out.println(s2.hashCode());				//gives same hashcode
		SingletonCloneable5 s3 = SingletonCloneable5.getInstance();
		System.out.println(s3.hashCode());				//gives same hashcode
	}

}
