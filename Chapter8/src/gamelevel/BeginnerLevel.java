package gamelevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("�ʱ��ڴ� run�� �� �մϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("�ʱ��ڴ� jump�� ���մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("�ʱ��ڴ� turn�� ���մϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("-----*�ʱ��� �����Դϴ�.*-----");
	}

}
