package thirdWeek;

import java.util.List;

/**
 * 
 * Consumer 有参数，但没有返回值 Predicate 有参数，有返回值，且返回值为boolean
 * 
 */
public class LambdaDemo {

	public static void main(String[] args) {

		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		list.add(1);
//		list.forEach(e -> {
//			if (e % 2 == 0) {
//				System.out.println(e);
//			}
//		});

		list.stream()//
				.sorted((e1, e2) -> e2 - e1)//
				.filter(e -> e % 2 == 0)//
				.forEach(e -> System.out.println(e));
	}
}
