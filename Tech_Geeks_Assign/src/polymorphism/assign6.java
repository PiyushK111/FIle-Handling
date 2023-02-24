package polymorphism;

public class assign6 {
	public static void main(String[] args) {
		System.out.println("always  orignal");
		c o1 = new c();
		o1.main(true);
	}
}
class c{
	public static void main(int i ) {
		System.out.println("Integer overloaded" + i);
		
	}
	public static void main(boolean b) {
		System.out.println("Boolean class "+ b);
	}
}
