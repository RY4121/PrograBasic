package Report15;

public class Report15_08 {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		mulNum(a, b);
		if(mulNum(a, b) == 12 && b >= 3) {
			System.out.println("Good!");
		} else {
			System.out.println("Bad!");
		}
	}

	public static int mulNum(int a, int b) {
		return a * b;
	}

}
