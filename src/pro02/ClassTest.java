package pro02;

public class ClassTest {
int count;
	public ClassTest(int count ) {
		this.count = count;
		System.out.println(count);
	
}
public ClassTest() {
	this(1);
}
	public static void main(String[] args) {
	ClassTest e = new ClassTest();
	ClassTest f= new ClassTest(5);

}
}
