package java_study;

public class Grandeur {
	//Class 제작 예제 Grandeur
	public String color;
	public String gear;
	public int price;
	
	// 생성자
	public Grandeur(){
		System.out.println("Grandeur constructor");
	}
	public void run() {
		System.out.println("--- run() ---");
	}
	public void stop() {
		System.out.println("--- stop() ---");
	}
	public void info() {
		System.out.println("--- info() ---");
		System.out.println("color : " + color);
		System.out.println("gear : " + gear);
		System.out.println("price : " + price);
	}
}
