package pro01;

public class Switch {
	public static void main(String[] args) {
		int grade = 10;
		switch (grade) {
		case 10:
			System.out.println("优秀");
			break;
		case 9:
			System.out.println("良好");
			break;
		case 7:
			System.out.println("中等");
			break;
		case 5:
			System.out.println("一般");
			break;
		default:
			System.out.println("差");
			break;
		}

	}
}
