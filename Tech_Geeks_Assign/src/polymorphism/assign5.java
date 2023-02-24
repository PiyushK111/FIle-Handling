package polymorphism;

public class assign5 {
	public static void main(String[] args) {
		A o1 = new A();
		o1.m1();
		o1.m1(5);
		A o2 = new B();
		o2.m1();
		
	}
}
class A{
	
	public static void m1() {
		System.out.println("NO argument");
	}
	public static void m1(int i) {
		
		System.out.println("1 Argument " + i);
	}
}

class B extends A{
	public static void m1() {
		System.out.println(" Overriding method cannot be called");
	}
}