package section6;

public class Question6_1 {
	public static void main(String[] args) {
		int number = 43749322;
		boolean isEven = false;

		if(number % 2 == 0) {
			isEven = true;
		} else {
			isEven = false;
		}

		if(isEven == true) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
}
