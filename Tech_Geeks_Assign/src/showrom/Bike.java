package showrom;

import java.util.*;

public class Bike {
	private String name;
	private String gears;
	private Integer price;
	private Double milegde;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGears() {
		return gears;
	}

	public void setGears(String gears) {
		this.gears = gears;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", gears=" + gears + ", price=" + price + ", milegde=" + milegde + "]";
	}

	public Integer getPrice() {
		return price;
	}

	public Bike(String name, String gears, Integer price, Double milegde) {
		super();
		this.name = name;
		this.gears = gears;
		this.price = price;
		this.milegde = milegde;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Double getMilegde() {
		return milegde;
	}

	public void setMilegde(Double milegde) {
		this.milegde = milegde;
	}
	/*
	 * public static void main(String[] args) { Bike b1 = new Bike();
	 * b1.setName("Apache"); b1.setGears("4"); b1.setMilegde(45.55);
	 * b1.setPrice(90000); System.out.println(b1.getGears() +b1.getName()
	 * +b1.getPrice() +b1.getMilegde()); System.out.println(b1.gears+" "+b1.name+" "
	 * );
	 * 
	 * 
	 * }
	 */
}
