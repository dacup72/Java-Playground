package Intro;

public class Car {
	
	private String color;
	private String make;
	private String model;
	private int year;
	
	//Defaults
	public Car(String color) {
		this.color = color;
	}
	
	public static void honk() {
		System.out.println("beep beep");
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getColor() {
		return color;
	}

	public String getMake() {
		return this.make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

}
