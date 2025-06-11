package activities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;

	Car(String color, String transmission, int make) {
		this.color = color;
		this.transmission = transmission;
		this.make = make;
		this.tyres = 4;
		this.doors = 4;
	}

	public void displayCharacterstics(){
		System.out.println("car color is"+ this.color);
		System.out.println("car transmission is"+this.transmission);
		System.out.println("car make is"+this.make);
		System.out.println("car tyres is"+this.tyres);
		System.out.println("car doors is"+this.doors);
	}

	public void accelarate() {
		System.out.println("Car is moving forward");
	}

	public void brake() {
		System.out.println("Car has stopped");
	}
}
