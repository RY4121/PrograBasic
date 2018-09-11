package finalExam;

public class Question13 {
	public static void main(String[] atgs) {
		double rate = 0.08;
		int price = 1255;

		double tax = rate * price;
		System.out.println(tax);

		double taxPrice = (1 + rate) * price;
		System.out.println(taxPrice);
	}

}
