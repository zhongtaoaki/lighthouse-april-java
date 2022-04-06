package firstWeek;

/**
 * 有方法add()
 * 参数为两个数字
 * 返回值为这两个数字的和
 * 要求计算
 * 1+1
 * 1+0.1
 * 0.1+1
 * 0.1+0.1
 * 的值
 */
public class Practice2 {

	static int add(int i,int j) {
		return i+j;
	}
	
	public static void main(String[] args) {
		
		System.out.println(add(1, 1));
		System.out.println(add(1, 0.1));
		System.out.println(add(0.1, 1));
		System.out.println(add(0.1, 0.1));
	}
}
