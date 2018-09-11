package r12;

public class R12_4 {
	public static void main(String[] args) {
		int[] nums = { 4, 5, 6 };
		writeDiff(nums);
	}

	public static void writeDiff(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			System.out.println(Math.abs(nums[0] - nums[i]));
		}
	}

}
