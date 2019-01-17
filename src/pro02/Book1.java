package pro02;

public class Book1 {
	String name = "abc";
	public void showName(String name) {
		System.out.println(this.name);
	}

	public static void main(String[] args) {
		Book1 book = new Book1();
		book.showName("123");
		
	}
}
