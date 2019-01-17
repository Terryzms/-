package pro02;

import java.util.Date;;;

public class Test04 {
public static void main(String[] args) {
	Date date=new Date();
	String string=String.format("%tF", date);
		System.out.println(string);
	
}
}
