package abstractes;

public class ComputerTest {
	public static void main(String[] args) {
		Computer computer = new Desktop();
		computer.turnOn();
		computer.display();
		computer.turnOff();
	}
}
