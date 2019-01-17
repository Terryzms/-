package pro02;

public class Test02 {
	public static void main(String[] args) {
		String a = new String("time");
		String b = new String("time");
		System.out.println(a == b);
		System.out.println(a.equals(b));
		String a1= new String("abc");
		String b1=new String("ABC");
		System.out.println(a1 == b1);
		System.out.println(a1.equals(b1));
		System.out.println(a1.equalsIgnoreCase(b1));
	}
}
