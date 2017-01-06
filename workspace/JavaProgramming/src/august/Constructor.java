package august;
public class Constructor {

	public static void main(String[] args) {
	}

}

class Person {
	String name;
	int age;
	int length;

	public Person(String name, int age, int length) {
		this.name = name;
		this.age = age;
		this.length = length;
	}
}

class Book {
	String title, author;
	int ISBN;

	public Book() {
		System.out.println("Book 按眉 积己凳");
	}

	public Book(String title) {
		this.title = title;
		System.out.println("title 檬扁拳等 Book 按眉 积己凳");
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		System.out.println("title, author 檬扁拳等 Book 按眉 积己凳");
	}

	public Book(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		System.out.println("title, author, ISBN 檬扁拳等 Book 按眉 积己凳");
	}
}