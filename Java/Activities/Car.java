package Activities;

public class car {
	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	car() {
		tyres = 4;
		doors = 4;
	}
	
	public void displaycharacteristics() {
		
		System.out.println("The color of the car is:" + color);
		System.out.println("The value of transmission is:" + transmission);
		System.out.println("The make of car is:" + make);
		System.out.println("The number of Tyres is:" + tyres);
		System.out.println("The number of doors is:" + doors);
	
	}
	
	public void acclerate() {
		System.out.println("Car is moving forward.");
	}
	
	public void brake() {
		System.out.println("The car has stopped");
	}

}