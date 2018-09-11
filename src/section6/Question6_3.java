package section6;

public class Question6_3 {
	public static void main(String[] args) {
		int number = 3;
		char direction = 'O';

		switch (number) {
		case 0:
			direction = 'E';
			break;
		case 1:
			direction = 'W';
			break;
		case 2:
			direction = 'S';
			break;
		case 3:
			direction = 'N';
			break;
		default:
			direction = 'O';
		}
		System.out.println(direction);
	}
}