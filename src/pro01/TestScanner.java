package pro01;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TestScanner {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pwd1 = "0";
		String pwd2 = "1";
	
    do {
    	System.out.println("����������");
    	pwd1 =sc.nextLine();
    	System.out.println("���ٴ���������");
    	pwd2 =sc.nextLine();
    	if(!pwd1.equals(pwd2)) {
    		System.out.println("�������벻һ��");
    	}
    }while(!pwd1.equals(pwd2));
    System.out.println("��������ɹ�");
}
}