public class Car {
    String color;
    int make;
    String transmission;
    int doors;
    int tyres;

    Car() {
        doors = 4;
        tyres = 4;
    }

    public void displayCharacteristics() {
        System.out.println("Color of the Car:" + color);
        System.out.println("Make of the Car:" + make); 
	System.out.println("Transmission of the Car:" + transmission);
	System.out.println("Number of doors:" + doors); 
	System.out.println("Number of tyres:" + tyres);
    }

    public void accelerate() {
        System.out.println("Car is moving forward.");
    }
    
    public void brake() {
        System.out.println("Car has stopped.");
    }
}
	   