package pro02;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Test01 {
	public static void main(String[] args) {
		String a = "china.java";
		boolean bool1 = a.endsWith("java");

		boolean bool2 = a.endsWith("jpg");
		System.out.println(bool1);
		System.out.println(bool2);
		boolean bool3 = a.startsWith("china");
		boolean bool4 = a.startsWith("chinese");
		System.out.println(bool3);
		System.out.println(bool4);

	}

}
