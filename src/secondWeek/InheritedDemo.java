package secondWeek;

/**
 * 在继承关系里
 * 子类会自动继承父类的所有非private修饰的属性，方法，构造器
 * 继承意味着可以使用和修改（非static修饰的属性和方法）
 * 
 * 方法的重写(override)
 * 方法签名不变，方法体发生改变
 * DRY 
 * 继承是把不同的类的共性给抽象出来
 * 共性之外的个性就是重写的意义所在
 * 
 * 超类和继承类
 * 
 * 继承的构造器
 * 
 */
public class InheritedDemo {
}

class People{
	
	public String name ;
	
	public void speak() {
		
	}
	
}

class Japanese extends People{
	
	public Japanese() {
	}
	
	public Japanese(String name) {
		this();
		this.name = name;
	}
	
}

class Water{
	
}