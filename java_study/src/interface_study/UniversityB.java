package interface_study;

public class UniversityB implements UnivInfo  {

	String name = "SeoulUniv";
	int num = 80000;
	
	public UniversityB() {
		System.out.println("--- START UniversityA() ---");
	}
	
	public void getName() {
		System.out.println("Name : "+ name);
	}
	
	public void getNumber() {
		System.out.println("Number : " + num);
	}
	
}
