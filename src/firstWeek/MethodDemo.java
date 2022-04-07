package firstWeek;

/**
 * 方法 method メソッド
 * 参数
 * 方法体
 * 返回值
 * 
 * 方法的声明
 * 方法名和变量名的命名规则一致，要遵守小驼峰命名
 * 入参是有个数和顺序的
 * 
 * 使用
 * 在同一个类中，静态方法可以直接调用
 * 在另一个方法内使用
 * 在使用的时候方法的小括号内写参数，参数的个数和数据类型必须要和声明位置一样 
 * 
 * 方法的重载
 * 方法签名 = 方法名+参数
 * 在同一个类内，方法名相同，但是方法签名不同的两个的方法之间的关系
 * 参数不同：与变量名无关，与参数的数据类型和参数的个数和不同数据类型参数的位置
 * 
 * 方法的意义：
 * 整理代码（提高代码的可读性）
 * DRY
 * 扩展性
 */
public class MethodDemo {
    
	// y = f(x) = x*x
	static int power(int i) {
		return i*i;
	}
	
	public static void main(String[] args) {
		
		int i = 6;
		
		System.out.println(power(i));
		
	}

}
