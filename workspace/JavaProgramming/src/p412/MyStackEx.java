package p412;

import java.util.LinkedList;

public class MyStackEx {
	public static void main(String[] args) {
		MyStack<Integer> m = new MyStack<Integer>();

		m.push(1);
		m.push(2);
		m.push(5);
		for (int i = 0; i < 3; i++) {
			System.out.println(m.pop());
		}
	}
}

class MyStack<T> implements Stack<T> {
	LinkedList<Object> ll = new LinkedList<Object>();
	int top = 0;

	@SuppressWarnings("unchecked")
	@Override
	public T pop() {
		top--;
		return (T) ll.get(top);
	}

	@Override
	public boolean push(T ob) {
		ll.add(ob);
		top++;
		return true;
	}

}
