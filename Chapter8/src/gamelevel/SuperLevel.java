package gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("����ڴ� run�� ��û���� �� �մϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("����ڴ� jump�� ��û���� �� �մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("����ڴ� turn�� ��û���� �� �մϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("-----*����� �����Դϴ�.*-----");
	}
	
}
