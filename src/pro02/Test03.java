package pro02;

public class Test03 {
public static void main(String[] args) {
	String a="         ab   c          ";
	System.out.println("["+a+"]");
	System.out.println(a.trim());
	String b = a.replaceAll("\\s", "");
	System.out.println(b);
}
}
