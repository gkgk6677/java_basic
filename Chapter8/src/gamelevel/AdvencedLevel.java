package gamelevel;

public class AdvencedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("중급자는 run을 매우 잘 합니다.");
	}

	@Override
	public void jump() {
		System.out.println("중급자는 jump를 매우 잘 합니다.");		
	}

	@Override
	public void turn() {
		System.out.println("중급자는 turn을 못합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("-----*중급자 레벨입니다.*-----");
	}

}
