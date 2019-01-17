package pro02;

public class TransferPropty {
	int i = 47;

	public void call() {
		System.out.println("调用call方法");
		for (i = 0; i <= 3; i++) {
			System.out.println(i + "");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		TransferPropty T1= new TransferPropty();
		TransferPropty T2=new TransferPropty();
		T2.i=60;
		System.out.println("第一次调用i结果"+T1.i);
		T1.call();
		System.out.println("第二次调用i结果"+T2.i);
		T2.call();
	}
}
