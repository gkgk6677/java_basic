package carlevel;

public class Genesis extends Car {

	@Override
	public void start() {
		System.out.println("Genesis가 출발");
	}

	@Override
	public void drive() {
		System.out.println("Genesis가 운전");
	}

	@Override
	public void stop() {
		System.out.println("Genesis가 스탑");
	}

	@Override
	public void turnoff() {
		System.out.println("Genesis의 시동 꺼짐");
	}
}
