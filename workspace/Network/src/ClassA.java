import java.io.Serializable;

public class ClassA implements Serializable {
	static final long serialVersionID = 1;
	int field1;
	ClassB field2 = new ClassB();
	static int field3;
}

class ClassB implements Serializable {
	int field1;
}
