package firstWeek;

/**
 * 写一个方法digitSum() 求输入值的各个位数之和
 * 
 */
public class Practice3 {

	static int digitSum(int num) {

		int sum = 0;

		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		return sum;

	}

	public static void main(String[] args) {

		System.out.println(digitSum(10));// 1
		System.out.println(digitSum(25));// 7
		System.out.println(digitSum(82854));// 18

	}
}
