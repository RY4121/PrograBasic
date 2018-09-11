package finalExam;

public class Question8 {
	public static void main(String[] atgs) {
		int num = 1;
		for(int i = 0; i < 5; i++) {
			if(i == num) {
				continue;
			}
			System.out.println(i);
		}
	}
}
