package pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakingSingletonUsingReflection {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, Exception {
		SingletonDemo1 s1 = SingletonDemo1.getInstance();
		System.out.println(s1.hashCode());						//gives same hashcode
		SingletonDemo1 s2 = SingletonDemo1.getInstance();
		System.out.println(s2.hashCode());						//gives same hashcode
		System.out.println("-------------------------------");
		
		Constructor<SingletonDemo1> ref = SingletonDemo1.class.getDeclaredConstructor();
		ref.setAccessible(true);
		SingletonDemo1 s3 = ref.newInstance();
		System.out.println(s3.hashCode());               //gives diff hashcode
		SingletonDemo1 s4 = ref.newInstance();			 
		System.out.println(s4.hashCode());               //gives diff hashcode
		System.out.println("-------------------------------");
		
		System.out.println(SingletonReflection4.getInstance().hashCode());
		Constructor<SingletonReflection4> constructor = SingletonReflection4.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		SingletonReflection4 s5 = constructor.newInstance();
		System.out.println(s5.hashCode());
		
	/*	try {
			Class<?> c = Class.forName("pattern.singleton.SingletonDemo1");
			Constructor<?> con = c.getDeclaredConstructor();
			System.out.println(con.isAccessible());      //gives false 
			con.setAccessible(true);
			System.out.println(con.isAccessible());      // gives true
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}           */

	}
}
