package section6;

public class Question6_6 {
	public static void main(String[] args) {
		int year = 2019;
		char sign = '子';

		switch (year % 12) {
		case 0:
			sign = '申';
			break;
		case 1:
			sign = '酉';
			break;
		case 2:
			sign = '戌';
			break;
		case 3:
			sign = '亥';
			break;
		case 4:
			sign = '子';
			break;
		case 5:
			sign = '丑';
			break;
		case 6:
			sign = '寅';
			break;
		case 7:
			sign = '卯';
			break;
		case 8:
			sign = '辰';
			break;
		case 9:
			sign = '已';
			break;
		case 10:
			sign = '午';
			break;
		case 11:
			sign = '未';
			break;
		default:
			sign = '子';
			//break;
		}
		System.out.println(sign);
	}
}
