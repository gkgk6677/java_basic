package gamelevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("초급자는 run을 잘 합니다.");
	}

	@Override
	public void jump() {
		System.out.println("초급자는 jump를 못합니다.");
	}

	@Override
	public void turn() {
		System.out.println("초급자는 turn을 못합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("-----*초급자 레벨입니다.*-----");
	}

}
