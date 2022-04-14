package secondWeek;

/**
 * 使用Practice2的Token完成下列代码 测试类中输入的表达式只包含三个数和两个运算符，且不包含括号 提示：Integer.valueOf();
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

		int i = Character.getNumericValue('1');

		// 字符串解析
		char[] chars = expression.toCharArray();

		// 用下标区分数字，符号

		// 确认优先级

		// 运算
		int result = 0;

		int num1 = Character.getNumericValue(chars[0]);
		int num2 = Character.getNumericValue(chars[2]);
		int num3 = Character.getNumericValue(chars[4]);

		if ((chars[3] == '*' || chars[3] == '/') && (chars[1] == '+' || chars[1] == '-')) {
			result = getToken(chars[3]).compute(num2, num3);
			result = getToken(chars[1]).compute(num1, result);

		} else {
			result = getToken(chars[1]).compute(num1, num2);
			result = getToken(chars[3]).compute(result, num3);

		}

		return result;

	}

	static Token getToken(char tokenAsChar) {

		switch (tokenAsChar) {
		case '+':
			return new Add();
		case '-':
			return new Sub();
		case '*':
			return new Mul();
		case '/':
			return new Div();

		default:
			return null;
		}

	}

}
