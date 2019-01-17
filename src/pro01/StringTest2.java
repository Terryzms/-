package pro01;

public class StringTest2 {
	public static void main(String[] args) {
		/*
		 * char[] arr = {'t','i','m', 'e'}; String a = new String(arr);
		 * System.out.println(a);
		 */
		char[] arr = { '时', '间', '就', '是', '金', '钱' };
		String a = new String(arr, 4, 2);
		System.out.println(a);
	}
}
