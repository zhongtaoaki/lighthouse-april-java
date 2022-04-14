package secondWeek;

/**
 * 访问修饰符
 * private 类内
 * default 包内
 * protected 包内和异包子类
 * public 所有
 * 
 * 访问修饰符可以用来修饰类，属性，方法，构造器，接口
 * 
 * 非访问修饰符
 * static
 * 静态
 * 不用创建对象也可以直接调用
 * 类.对象
 * 类.方法
 * 调用的位置是在本类内部的话，类名可以省略
 * 
 * final
 * 当final出现在属性前面的时候，这个属性的值就不能被修改,所以必须要赋予初始值
 * 即 常量（定数）
 * 当final出现在方法前面的时候，这个方法就不能修改（重写）
 * 当final出现在类前面的时候，这个类就不能被修改（继承）
 */
public class AccessDemo {

	public final static int AGE = 56;
	
	public static void main(String[] args) {
		
		AccessDemo accessDemo  = new AccessDemo();
		AccessDemo accessDemo2  = new AccessDemo();
		
		System.out.println(AccessDemo.AGE);
		
	}
	
	static void print() {
		System.out.println("Hello World");
		
	}
}
