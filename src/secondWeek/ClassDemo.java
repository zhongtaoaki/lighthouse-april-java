package secondWeek;

import java.util.Objects;

/**
 * 对象和类 是 is a
 * 类是对象的抽象
 * 对象是类的具体实现
 * 
 * 类的声明
 * 访问修饰符+类名（大驼峰命名原则，不能中文）成对出现大括号{}
 * 可以写属性（field）和方法（method）
 * 声明在方法以外,包内 
 * 类的属性（成员变量）：修饰符+数据类型+名字；
 * 可以有初始值，引用数据类型的初始值是null，基本数据类型的初始值是0
 * 与局部变量
 * 类的方法：修饰符+数据类型+方法名（参数）{}
 * 没有加static的方法叫做成员方法
 * 
 * 构造方法
 * 访问修饰符 类名（参数）{}
 * 默认有一个无参空构造
 * 当你写了一个构造器之后，无参空构造会失效
 * 
 * 非访问修饰符和访问修饰符
 * 
 * 类的使用
 * 生成对象的时候需要使用构造器
 * 对象.的方式去使用变量
 * 对象.的方式去使用方法
 * 
 */
public class ClassDemo {

	int i = 2; 
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.name = "dog";
		Animal animal2 = new Animal("cat");
		System.out.println(animal2.name);
	}
}

class Animal{
	
	String name;

	public Animal() {
	}
	
	//局部变量是在方法声明的变量，成员变量是在类里声明的变量
	public Animal(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(name, other.name);
	}
	
}

