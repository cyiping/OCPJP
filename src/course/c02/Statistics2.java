package course.c02;

public class Statistics2 {
	public float average(int... nums) {
		int sum = 0;
		float result = 0;
		if (nums.length > 0) {
			for (int x : nums)
				// iterate int array nums
				sum += x;
			result = (float) sum / nums.length;
		}
		return (result);
	}
	
	public static void main(String args[]) {
		
		Statistics2 s = new Statistics2();
		
		System.out.println(s.average());
		System.out.println(s.average(1,2,3,4));
		System.out.println(s.average(1,2,3,4,5,6));
		System.out.println(s.average(1,2));
		
		int[ ] arr = {1,2,3,4};
		
		System.out.println(s.average(arr));

	}
	
}
