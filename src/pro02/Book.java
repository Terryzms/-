package pro02;


public class Book {
	String name = "�й�";

	public String getName(){
		return name;
	}

	public static void main(String[] args) {
		Book b= new Book();
		System.out.println( b.getName());
	}
}
