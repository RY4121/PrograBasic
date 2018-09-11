package r8;

public class R8_4 {
	public static void main(String[] args) {
		int Leng = 12;
		int CoP = 0;

		int i = 1;
		while(true) {
			CoP += 4;
			if(CoP >= Leng) {
				break;
			}
			i++;
			CoP -= 3;
		}
		System.out.println(i);
	}
}
