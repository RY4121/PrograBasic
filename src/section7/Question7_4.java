package section7;

public class Question7_4 {
	public static void main(String[] args) {

		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(j * i + " \t");
			}
			System.out.println();//任意のタイミングで改行したい時の処理
		}

	}
}
