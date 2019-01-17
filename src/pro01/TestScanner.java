package pro01;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TestScanner {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pwd1 = "0";
		String pwd2 = "1";
	
    do {
    	System.out.println("请输入密码");
    	pwd1 =sc.nextLine();
    	System.out.println("请再次输入密码");
    	pwd2 =sc.nextLine();
    	if(!pwd1.equals(pwd2)) {
    		System.out.println("输入密码不一致");
    	}
    }while(!pwd1.equals(pwd2));
    System.out.println("设置密码成功");
}
}