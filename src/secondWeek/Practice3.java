package secondWeek;

/**
 * 使用Practice2的Token完成下列代码
 * 测试类中输入的表达式只包含三个数和两个运算符，且不包含括号
 * 提示：Integer.valueOf();
 * 提示：class Calculator里可以活用switch
 */
public class Practice3 {

	public static void main(String[] args) {

		System.out.println(Calculator.calculate("1+1+1"));
		System.out.println(Calculator.calculate("1+1-1"));
		System.out.println(Calculator.calculate("1+1*1"));
		System.out.println(Calculator.calculate("1+1/1"));
		
	}

}

class Calculator {

	public static int calculate(String expression) {

		int i = Integer.valueOf("1");
		
		String s = "1+1+1";
		char[] chars =  s.toCharArray();
		
	}

}
