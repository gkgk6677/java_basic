package gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("고급자는 run을 엄청나게 잘 합니다.");
	}

	@Override
	public void jump() {
		System.out.println("고급자는 jump를 엄청나게 잘 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("고급자는 turn을 엄청나게 잘 합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("-----*고급자 레벨입니다.*-----");
	}
	
}
