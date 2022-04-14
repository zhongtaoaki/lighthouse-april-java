package secondWeek;

/**
 * 抽象类 被abstract修饰的类叫做抽象类 不能被实例化的类叫做抽象类 拥有抽象方法的类叫做抽象类
 * 
 * 抽象类存在的意义就是被继承 如果有一个类继承了抽象类，并且这个类是实体类 那么一定要重写抽象类里的所有抽象方法
 * 
 * 抽象方法 没有方法体的方法,没有{}
 * 
 * 接口 是一个引用数据类型 Type 接口是抽象方法的集合体 接口里不可以有属性 接口里不可以有非抽象方法（1.8） 一个类可以使用这个接口
 * 
 * 接口的访问修饰符只能是public 接口里的抽象方法只能是public，一般省略
 * 
 * 接口的意义 DRY 开闭原则 暴露的是方法 暴露的是链接本系统的方法的规范
 * 
 */
public abstract class AbstractDemo implements Speak {

	public abstract void name();

	Object obj = new Object();
}

interface Speak {

	void speak();
}

class Boy implements Speak {
	public String name;

	@Override
	public void speak() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {

		Boy boy = new Boy();
		boy.speak();

	}

}
