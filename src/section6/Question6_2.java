package section6;

public class Question6_2 {
	public static void main(String[] args) {
		int year = 1968;
		char japaneseEra = 'E';

		if(year >= 1989) {
			japaneseEra = 'H';
		} else if(year >= 1926) {
			japaneseEra = 'S';
		} else if(year >= 1912) {
			japaneseEra = 'T';
		} else if(year >= 1868) {
			japaneseEra = 'H';
		} else {
			japaneseEra = 'E';
		}
		System.out.println(japaneseEra);
	}
}
