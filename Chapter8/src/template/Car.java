package template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("-----stratCar()-----");
	}
	
	public void turnOff() {
		System.out.println("-----turnOff()-----");
	}
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
