package showrom;
import java.util.ArrayList;
public class factory extends Bike{
	public factory(String name, String gears, Integer price, Double milegde) {
		super(name, gears, price, milegde);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<Bike> a1 = new ArrayList();
		Bike b2 = new Bike("Pulsor","5",70000,34.9);
		a1.add(b2);
		a1.add(new Bike("Pulsor","5",70000,34.9));
		a1.add(new Bike("Pulsor1","51",30000,45.9));
		a1.add(new Bike("Pulsor2","52",50000,56.9));
		a1.add(new Bike("Pulsor3","53",40000,12.9));
		//Bike b1;
		Bike b9 = a1.get(1);
		Bike b3 = a1.get(2);
		Bike b4 = a1.get(3);
		System.out.println(a1.toString()+"  ");
		System.out.println(b4);
	}

	@Override
	public String toString() {
		return "factory []";
	}
	
}