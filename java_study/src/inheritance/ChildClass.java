package inheritance;

public class ChildClass extends ParentClass {
	public ChildClass() {
		System.out.println("--- ChildClass() START ---");
	}
	public void childFunc() {
		System.out.println("--- childfunction() ---");
	}
	
	public void parentFunc() {
		System.out.println("--- New!! parentFunc() ---");
	}
}
