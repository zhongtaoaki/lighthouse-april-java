package firstWeek;

import java.util.Iterator;

/**
 * DRY:Dont repeat yourself 迭代器 iterator
 */
public class RoupeDemo {

	public static void main(String[] args) {

		int i = 0;

//		while (i > 10) {
//			System.out.println(i);
//			i++;
//		}

//		do {
//			System.out.println(i);
//			i++;
//		} while (i > 10);

//		for (int j = 0; j < 10; j++) {
//			System.out.println(j);
//		}
		
		String[] array = {"4","8","10"};
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
			array[j] = array[j+1];
		}
		
		for (String j : array) {
			System.out.println(j);
		}
		
	}
}
