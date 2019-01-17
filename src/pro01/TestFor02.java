package pro01;

public class TestFor02 {
	/*
	 * public static void main(String[] args) { int arr[]= {7,8,9,10,99}; for(int
	 * x:arr) { System.out.println(x); } }
	 */
	public static void main(String[] args) {
		int cock, hen, chick;
		for (cock = 1; cock <= 20; cock++) {
			for (hen = 1; hen <= 33; hen++) {
				for (chick = 3; chick <= 99; chick += 3) {
					if (cock * 5 + hen * 3 + chick / 3 == 100) {
						if (cock + hen + chick == 100) {
							System.out.println("¹«¼¦" + cock + "Ä¸¼¦" + hen + "Ð¡¼¦" + chick);
						}
					}
				}

			}
		}
	}
}