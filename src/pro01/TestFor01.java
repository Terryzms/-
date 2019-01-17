package pro01;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TestFor01 {
      public static void main(String[] args) {
		int sum = 0;
		for(int i = 1;i<=100;i++) {
			sum = sum + i;
		}System.out.println("sum="+sum);
      }
}
