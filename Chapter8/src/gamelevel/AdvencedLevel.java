package gamelevel;

public class AdvencedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("�߱��ڴ� run�� �ſ� �� �մϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("�߱��ڴ� jump�� �ſ� �� �մϴ�.");		
	}

	@Override
	public void turn() {
		System.out.println("�߱��ڴ� turn�� ���մϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("-----*�߱��� �����Դϴ�.*-----");
	}

}