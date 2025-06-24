package pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Breaking serialzation using serializable interface
public class BreakingSingletonUsingSerialization {
	public static void main(String[] args) {
		SingletonSerialzable2 s1 = SingletonSerialzable2.getInstance();
		try (
			FileOutputStream fos = new FileOutputStream("C:\\Users\\bhanu\\OneDrive\\Desktop\\SingletonClass.ser");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\bhanu\\OneDrive\\Desktop\\SingletonClass.ser"));
				) {
			os.writeObject(s1);
			SingletonSerialzable2 s2 = (SingletonSerialzable2)ois.readObject();
			System.out.println("S2  : "+s1.hashCode()+" "+s1.name);
			System.out.println("S1  : "+s2.hashCode()+" "+s2.name);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
