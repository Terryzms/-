package pro01;

public class StringTest2 {
	public static void main(String[] args) {
		/*
		 * char[] arr = {'t','i','m', 'e'}; String a = new String(arr);
		 * System.out.println(a);
		 */
		char[] arr = { 'ʱ', '��', '��', '��', '��', 'Ǯ' };
		String a = new String(arr, 4, 2);
		System.out.println(a);
	}
}
