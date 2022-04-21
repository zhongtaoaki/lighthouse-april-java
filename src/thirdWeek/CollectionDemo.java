package thirdWeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Collection是一个接口，Map是一个和Collection同一抽象级别的接口 所以Collection是不可以被实例化的 他是一个规范
 * List，Set，Queue是接口 ArrayList，LinkedList是实体类，在使用方式没有区别
 * 
 * 使用方式是由接口决定，实体类决定的是实现方式 ArrayList可以改变长度，数据类型是引用数据类型
 * 不可以使用int等基本数据类型，要使用Integer等包装类（Wrapper Class），
 * 
 * Consumer是一个函数式接口（只有一个抽象方法的接口）
 * 当一个方法的入参是函数式接口的时候，可以把这个入参也成lambda表达式
 * Function，Supplier，Predicate，Consumer，Runnable
 * 
 */
public class CollectionDemo {

	public static void main(String[] args) {

		int[] array = new int[5];
		List<Integer> list = new ArrayList<>();// 多态
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		// 一个有1,2,3,4,5元素的List
		// 用for循环去输出这个List的每个元素

		// Consumer action = new ForEach();

//		Consumer action1 = new Consumer<Integer>() {
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//		};//匿名类

//		list.forEach(new Consumer<Integer>() {
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//		}); // 参数为Consumer

		list.forEach(t -> {System.out.println(t);}); // 参数为Consumer

	}
}

//class ForEach implements Consumer<Integer> {
//
//	@Override
//	public void accept(Integer t) {
//		System.out.println(t);
//	}
//}
