package interface_study;

public class InterfaceClass implements InterfaceA, InterfaceB {

	public InterfaceClass() {
		System.out.println("--- InterfaceClass() START ---");
	}
	
	public void funcA() {
		System.out.println("--- funcA() ---");
	}
	public void funcB() {
		System.out.println("--- funcB() ---");
	}
}
