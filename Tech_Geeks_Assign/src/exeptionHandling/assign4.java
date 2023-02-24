package exeptionHandling;

class A{
	void m()throws Exception {
		System.out.println("Throws Exception");
	}
}
public class assign4 {
	
	public static void main(String[] args) {	
		A o1=new A();
		try {
		o1.m();
	}
		catch(Exception e) {
			System.out.println("Exxeption handled");
		}
	}
}