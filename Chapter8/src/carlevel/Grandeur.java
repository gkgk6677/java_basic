package carlevel;

public class Grandeur extends Car {

	@Override
	public void start() {
		System.out.println("Grandeur�� ���");
	}

	@Override
	public void drive() {
		System.out.println("Grandeur�� ����");
	}

	@Override
	public void stop() {
		System.out.println("Grandeur�� ��ž");
	}

	@Override
	public void turnoff() {
		System.out.println("Grandeur�� �õ� ����");
	}
}
