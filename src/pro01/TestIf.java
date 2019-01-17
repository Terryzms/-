package pro01;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TestIf {
	public static void main(String[] args) {
		/*
		 * int a= 7; if (a %2==0) { System.out.println(a+"是偶数");
		 * }System.out.println(a+"是奇数"); }
		 */
		int a = 300;
		if (a == 500) {
			System.out.println("账户余额500");
		} else {
			System.out.println("账户余额太少");
		}
		System.out.println("吃饭睡觉");
	}

}