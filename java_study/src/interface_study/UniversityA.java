package interface_study;

public class UniversityA implements UnivInfo {

	String name = "KoreaUniv";
	int num = 20000;
	
	public UniversityA() {
		System.out.println("--- START UniversityA() ---");
	}
	
	public void getName() {
		System.out.println("Name : "+ name);
	}
	
	public void getNumber() {
		System.out.println("Number : " + num);
	}
	
}
