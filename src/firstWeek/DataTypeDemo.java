package firstWeek;

/**
 * 变量 変数 声明 使用 声明： 类型 变量名 ＝ 值；
 * 
 * 基本数据类型 ：byte short int long double float boolean char 整数 ：byte（-128 127）
 * short（65000） int（21亿） long 
 * 小数（浮点型）：double float num = 10l； num = 0.1d；
 * 
 * char（character） 'c' 28
 * 
 * boolean (0,1 , true false)
 * 
 * 引用数据类型 String(字符串) 配列 数据类型必须保持一致 下标（index），从0开始 长度是不可变的 有顺序的
 * 数组是一个执行效率非常高的数据结构
 * 
 * 变量的声明 数据类型 变量名 = 字面值; 
 * 数据类型 变量名; 变量名开头小写，不可以数字开头，可以使用字母数字下划线$，不可以有空格
 * 遵守小驼峰命名原则（增强代码的可读性）
 * 
 * 变量的使用 使用
 * 
 * 
 */

public class DataTypeDemo {
	public static void main(String[] args) throws Exception {

		float f = 0.1f;
		String s = "Hello World";
		
		int[] array1 = { 1, 2, 3 };
		int[] array2 = new int[3];
		System.out.println(array2[0]);
		String[] stringArray = new String[3];
		System.out.println(stringArray[0]);
		
 		

	}
}
