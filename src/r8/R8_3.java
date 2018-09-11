package r8;

public class R8_3 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(i * j <= 18) {

					System.out.print(i * j + "\t");
				}
			}
			System.out.println();
		}
	}

}
