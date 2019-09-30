package java_study;

public class MainClass {
	public static void main(String[] args) {
		
		Grandeur myCar1 = new Grandeur();
		myCar1.color = "green";
		myCar1.gear = "1´Ü";
		myCar1.price = 120000; 
		
		myCar1.run();
		myCar1.stop();
		myCar1.info();
		
		System.out.println("============");
		Bicycle myBicycle1 = new Bicycle();
		myBicycle1.color = "yello";
		myBicycle1.price = 20000;
		myBicycle1.info();
		
		System.out.println("============");
		Bicycle myBicycle2 = new Bicycle("red", 1000);
		myBicycle2.info();
	}
}
