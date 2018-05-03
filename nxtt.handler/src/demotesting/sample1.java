package demotesting;

public class sample1 {
	static int a = 40, b = 20;

	public static void add(){
			int add = a + b;
			System.out.println("add = "+add);
		}
	public static void sub(){
		int sub = a - b;
		System.out.println("sub = "+sub);
	}
	public static void div(){
		int div = a / b;
		System.out.println("div = "+div);
	}
	public static void mul(){
		int mul = a * b;
		System.out.println("mul = "+mul);
	}



	public static void main(String[] args) {
		add();
		sub();
		div();
		mul();
	}
	
}
