package abstractes;

public class Desktop extends Computer {

	public void display() {
		System.out.println("����ũž �Դϴ�.");
	}

	public void typing() {
		System.out.println("����ũž�� Ÿ�����մϴ�.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("����ũž�� ������ �մϴ�.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("����ũž�� ������ ���ϴ�.");
	}
	
}
