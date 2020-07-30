
public class Book {
	String title;
	String author;
	int ISBN;
	Book(String title, String author, int ISBN){
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	}
	public static void main(String[] args){
		Book javaBook=new Book("Java Sdk","Á¤À±Àç",10119);
	}

}
