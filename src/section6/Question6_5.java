package section6;

public class Question6_5 {
	public static void main(String[] args) {
		int year = 2100;
		boolean isLeapYear = false;
		//ifは上から一つずつ真偽が問われるため、数の大きい順に判定しないと論理が煩雑になってしまう
		//例えば、２と３を入れ替えるだけでyear=100のときはtrueの評価になってしまう
		//逆に言えば検算するときは境目の数字を真っ先に考えると良いということになる。
		if(year % 400 == 0) {
			isLeapYear = true;
		} else if(year % 100 == 0) {
			isLeapYear = false;
		} else if(year % 4 == 0) {
			isLeapYear = true;
		} else {
			isLeapYear = false;
		}

		if(isLeapYear == true) {
			System.out.println("leap year");
		} else {
			System.out.println("not leap year");
		}
	}
}
