package polymorphism;

public class assign4 {
	public static void main(String[] args) {
		base m= new child();
		m.display();   //child class method is called
	}
}
class base{
	public void display() {
		System.out.println("This is the base class");
	}
}
class child extends base{
	public void display() {
		System.out.println("This is the child class");
	}
}