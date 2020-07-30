import java.io.*;

public class ObjIOExample {

	private static String fileName = "/Users/leejaeseok/Documents/Programming/Java/Files/object.dat";

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(new Integer(10));
			oos.writeObject(new String("String"));
			oos.writeObject(new Double(3.5));
			oos.writeObject(new int[] { 1, 2, 3 });
			oos.flush();
			fos.close();
			oos.close();

			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Integer obj1 = (Integer) ois.readObject();
			String obj2 = (String) ois.readObject();
			Double obj3 = (Double) ois.readObject();
			int[] obj4 = (int[]) ois.readObject();
			fis.close();
			ois.close();

			System.out.println("obj1 : " + obj1);
			System.out.println("obj2 : " + obj2);
			System.out.println("obj3 : " + obj3);
			System.out.println("obj4 : ");
			for (int i : obj4) {
				System.out.println(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
