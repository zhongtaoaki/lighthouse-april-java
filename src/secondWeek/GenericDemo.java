package secondWeek;

/**
 * 泛型（総称型）
 * 数据类型不同，但是算法相同的时候使用的
 * 
 * 多态
 * 数据类型相同，算法不同的时候使用的
 *
 */
public class GenericDemo {

	public static void main(String[] args) {
		
		new Calculater().add("a", "b");
	}
	
}

class Calculater {

	//Type
	public <T> T add(T i, T j) {
		return i;
	}

}