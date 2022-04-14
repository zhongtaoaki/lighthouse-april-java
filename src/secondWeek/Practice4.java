package secondWeek;

/**
 * 实现stack的数据结构
 * 在不修改main方法的基础上完成代码
 * 可以不用考虑stack的长度会超过10的情况；
 */
public class Practice4 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.pop());//输出结果为2
		System.out.println(stack.pop());//输出结果为1
		
	}
}

class Stack<T>{
	
	private T[] array = (T[]) new Object[10];
	
	public void push(T t) {
		
	}
	
	public T pop() {
		
	}
	
	
}