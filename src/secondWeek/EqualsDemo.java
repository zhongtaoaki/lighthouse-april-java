package secondWeek;

/**
 * ==比较的是地址
 * 重写equals方法比较的是业务逻辑
 */
public class EqualsDemo {

	public static void main(String[] args){


		Animal dog1 = new Animal("dog");
		Animal dog2 = new Animal("dog");
		
		String s1 = "dog";
		String s2 = "dog";
		String s3 = new String("dog");
		String s4 = "do"+"g";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		
	}
}


