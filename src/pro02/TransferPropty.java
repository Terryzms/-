package pro02;

public class TransferPropty {
	int i = 47;

	public void call() {
		System.out.println("����call����");
		for (i = 0; i <= 3; i++) {
			System.out.println(i + "");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		TransferPropty T1= new TransferPropty();
		TransferPropty T2=new TransferPropty();
		T2.i=60;
		System.out.println("��һ�ε���i���"+T1.i);
		T1.call();
		System.out.println("�ڶ��ε���i���"+T2.i);
		T2.call();
	}
}
