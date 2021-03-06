package secondWeek;

/**
 * 写一个能进行四则运算的程序，在不修改main方法的基础上能顺利输出“12，8，20，5”
 */
public class Practice2 {

	public static void main(String[] args) {

		Token[] tokens = {new Add(),new Sub(),new Mul(),new Div()};
		for (Token token : tokens) {
			System.out.println(token.compute(10, 2));
		}
	}

}

interface Token {
	int compute(int a, int b);
}

class Add implements Token {

	@Override
	public int compute(int a, int b) {
		return a+b;
	}

}

class Sub implements Token {

	@Override
	public int compute(int a, int b) {
		return a-b;
	}
}

class Mul implements Token {

	@Override
	public int compute(int a, int b) {
		return a*b;
	}
}

class Div implements Token {

	@Override
	public int compute(int a, int b) {
		return a/b;
	}
}
