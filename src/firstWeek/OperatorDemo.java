package firstWeek;

/**
 * 算数运算符 +-*%/ ++ -- **
 * 
 * 赋值运算符 = 右边的值赋给左边的变量 +=,-=
 * 
 * 比较运算符 == != >= <= 结果是boolean （true false）
 * 
 * 逻辑运算符 & | ! && ||
 * 增强代码的健壮性，可用性
 * 增强代码的运行效率（performance）
 */

public class OperatorDemo {

	public static void main(String[] args) {

		int i = 1;
		int j = i++;
		int k = ++i;
		int l = 17;

		System.out.println(j);
		System.out.println(i);
		System.out.println(i++);
		System.out.println(i);
		System.out.println(k);
		System.out.println("17对4取余是: " + l % 4);
		System.out.println(1 + 1);
		System.out.println("1" + "1");

		boolean[] booleanArray = {true,false};
		
		//boolean b1 = booleanArray[2];
		boolean b2 = booleanArray[1];
		System.out.println(b2 && booleanArray[2]);

	}
}
