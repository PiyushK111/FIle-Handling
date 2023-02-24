package polymorphism;

public class assign1 {
	double num= 0;
	double num2=0 ;
	public double getnum(int d,int m) {
		num = (d+m);
		return num;
	}
	public double getnum(double f1,double f2) {
		num2 = f1+f2;
		return num2;
	}
	public static void main(String[] args) {
		assign1 obj = new assign1();
	double n1 = 	obj.getnum(15,16);
	double n2=	obj.getnum(15.1456,562.12);
		System.out.println(n1);	
		System.out.println(n2);}
}
