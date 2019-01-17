package pro01;

public class TestIf02 {
	public static void main(String[] args) {
		int balance = 600;
		if (balance >= 500) {
			System.out.println("兰博基尼");
		} else if (balance >= 200) {
			System.out.println("卡宴");
		} else if (balance >= 300) {
			System.out.println("Q7");
		} else {
			System.out.println("再接再厉");
		}
	}
}