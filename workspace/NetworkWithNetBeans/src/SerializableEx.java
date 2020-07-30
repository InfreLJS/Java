import java.io.*;

public class SerializableEx {

	private static String fileName = "/Users/leejaeseok/Documents/Programming/Java/Files/object.dat";

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			ClassA classA = new ClassA();
			classA.field1 = 1;
			classA.field2.field1 = 2;
			classA.field3 = 3;
			oos.writeObject(classA);
			oos.flush();
			oos.close();
			fos.close();

			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			ClassA robj = (ClassA) ois.readObject();
			ois.close();
			fis.close();

			System.out.println(robj.field1);
			System.out.println(robj.field2.field1);
			System.out.println(robj.field3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
